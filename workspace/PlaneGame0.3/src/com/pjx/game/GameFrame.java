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
	 * 初始化窗口
	 */
	public void launchFrame() {
		setTitle("飞机躲避子弹");//设置窗口的标题
		setVisible(true);//设置窗口可见，默认是不可见的
		setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);//设置窗口尺寸，静态方法类名直接访问
//		setLocation(800, 200);//设置窗口位置
		setLocationRelativeTo(null);//居中显示
		
        //增加关闭窗口监听，这样用户点击右上角关闭图标，可以关闭游戏程序
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);//结束虚拟机运行 0表示正常结束，非0为非正常
            }
            
        }); 
        new PaintThread().start();//启动重画线程
        addKeyListener(new KeyMonitor());
        addMouseListener(new MouseMonitor());
        //初始化炮弹
        for(int i=0;i<shells.length;i++) {
        	shells[i] = new Shell(500,350,2,Constant.SHELL_WIDTH,Constant.SHELL_HEIGHT);//x,y,speed,宽，高
        }
	}
	Image imgPlane = GameUtil.getImage("image/feiji.png");//path用引号括起来 
	Image imgBackground = GameUtil.getImage("image/xingkong.jpg");
	Image imgStart = GameUtil.getImage("image/game_start.png");
	Plane plane = new Plane(imgPlane,500,600,3,36,36); //图片，x,y,速度，宽，高
	Shell[] shells = new Shell[100];
	Explode bang;
	//100为图片宽度的一半，3为图片高度的一般，目的居中        1000 700
	GameStart gameStart = new GameStart(imgStart, Constant.GAME_WIDTH/2-100, Constant.GAME_HEIGHT/2-36);
	
	Date startTime;  //游戏开始的时间，在游戏开始赋值
	Date endTime;	  //游戏结束的时间，在飞机死亡后赋值
	
	
	
	/**
	 * paint方法作用是：画出整个窗口及内部内容。被系统自动调用
	 */
	@Override
	public void paint(Graphics g) {
		g.drawImage(imgBackground, 0, 0, null);
		gameStart.drawMyself(g);
		plane.drawMyself(g); //画飞机
		if(gameStart.gameLive) {
			if(startTime==null) {
				startTime = new Date();
				}
			//画炮弹
	        for(int i=0;i<shells.length;i++) {
	        	shells[i].drawMyself(g);
	        	//判断炮弹的矩形区域是否和飞机的碰撞
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
	        	Font f = new Font("宋体", Font.BOLD, 50);
	        	g.setFont(f);
	        	g.drawString("存活了"+period+"秒", 320, 350);
	        	
	        	g.setColor(c);
	        }
		}

	}

	/**
	 * 定义一个重画的线程
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
	 * 键盘监听内部类
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
	 * 鼠标监听类
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
	 * 双缓冲去闪烁
	 */
	public void update(Graphics g) {
		if(offScreenImage == null)
			offScreenImage = this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);//这是游戏窗口的宽度和高度
		
		Graphics gOff = offScreenImage.getGraphics();
		paint(gOff);
		g.drawImage(offScreenImage, 0, 0, null);
	}	

}
