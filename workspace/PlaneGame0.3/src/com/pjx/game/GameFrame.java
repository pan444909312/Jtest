package com.pjx.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;

public class GameFrame extends java.awt.Frame{
	/**
	 * ��ʼ������
	 */
	public void launchFrame() {
		setTitle("�ɻ�����ӵ�");//���ô��ڵı���
		setVisible(true);//���ô��ڿɼ���Ĭ���ǲ��ɼ���
		setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);//���ô��ڳߴ磬��̬��������ֱ�ӷ���
//		setLocation(800, 200);//���ô���λ��
		setLocationRelativeTo(null);//������ʾ
		
        //���ӹرմ��ڼ����������û�������Ͻǹر�ͼ�꣬���Թر���Ϸ����
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);//������������� 0��ʾ������������0Ϊ������
            }
            
        }); 
        new PaintThread().start();//�����ػ��߳�
        addKeyListener(new KeyMonitor());
        addMouseListener(new MouseMonitor());
        //��ʼ���ڵ�
        for(int i=0;i<shells.length;i++) {
        	shells[i] = new Shell(500,350,2,Constant.SHELL_WIDTH,Constant.SHELL_HEIGHT);//x,y,speed,����
        }
	}
	Image imgPlane = GameUtil.getImage("image/feiji.png");//path������������ 
	Image imgBackground = GameUtil.getImage("image/xingkong.jpg");
	Image imgStart = GameUtil.getImage("image/game_start.png");
	Plane plane = new Plane(imgPlane,500,600,3,36,36); //ͼƬ��x,y,�ٶȣ�����
	Shell[] shells = new Shell[100];
	Explode bang;
	//100ΪͼƬ��ȵ�һ�룬3ΪͼƬ�߶ȵ�һ�㣬Ŀ�ľ���        1000 700
	GameStart gameStart = new GameStart(imgStart, Constant.GAME_WIDTH/2-100, Constant.GAME_HEIGHT/2-36);
	
	Date startTime;  //��Ϸ��ʼ��ʱ�䣬����Ϸ��ʼ��ֵ
	Date endTime;	  //��Ϸ������ʱ�䣬�ڷɻ�������ֵ
	
	
	
	/**
	 * paint���������ǣ������������ڼ��ڲ����ݡ���ϵͳ�Զ�����
	 */
	@Override
	public void paint(Graphics g) {
		g.drawImage(imgBackground, 0, 0, null);
		gameStart.drawMyself(g);
		plane.drawMyself(g); //���ɻ�
		if(gameStart.gameLive) {
			if(startTime==null) {
				startTime = new Date();
				}
			//���ڵ�
	        for(int i=0;i<shells.length;i++) {
	        	shells[i].drawMyself(g);
	        	//�ж��ڵ��ľ��������Ƿ�ͷɻ�����ײ
	        	boolean touch = shells[i].getRect().intersects(plane.getRect());
	        	if(touch) {
	        		plane.live = false;
	        		if(bang ==null) {
	                	bang = new Explode(plane.getX(),plane.getY());

	        		}
	        		bang.draw(g);

	        	}
	        }
	        
	        if(!plane.live) {
	        	double period;
	        	if(endTime==null) {
					endTime = new Date();
	        	}

	        	period = (double)(endTime.getTime()-startTime.getTime())/1000;
	        	Color c = g.getColor();
	        	g.setColor(Color.WHITE);
	        	Font f = new Font("����", Font.BOLD, 50);
	        	g.setFont(f);
	        	g.drawString("�����"+period+"��", 320, 350);
	        	
	        	g.setColor(c);
	        }
		}

	}

	/**
	 * ����һ���ػ����߳�
	 * @author pjx
	 *
	 */
	class PaintThread extends Thread{
		public void run() {
			while(true) {
				repaint();
				try {
					Thread.sleep(10);//40ms
//					sleep(40);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}
	/**
	 * ���̼����ڲ���
	 * @author admin
	 *
	 */
	class KeyMonitor extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			plane.addDirection(e);
		}
		@Override
		public void keyReleased(KeyEvent e) {
			plane.minusDirection(e);
		}
	}
	/**
	 * ��������
	 * 
	 */
	class MouseMonitor extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			super.mouseClicked(e);
			gameStart.Click(e);
		}
	}
	

	public static void main(String[] args) {
		GameFrame g = new GameFrame();
		g.launchFrame();
	}
	
	
	
	private Image offScreenImage = null;
	/**
	 * ˫����ȥ��˸
	 */
	public void update(Graphics g) {
		if(offScreenImage == null)
			offScreenImage = this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);//������Ϸ���ڵĿ�Ⱥ͸߶�
		
		Graphics gOff = offScreenImage.getGraphics();
		paint(gOff);
		g.drawImage(offScreenImage, 0, 0, null);
	}	

}
