package com.game;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameFrame extends Frame{
	Image imgBackground = GameUtil.getImage("image/black.png");
	Snake snake = new Snake(250,250,
			Constants.SNAKE_WIDTH,Constants.SNAKE_HEIGHT,1);


	
	/**
	 * 初始化游戏窗口
	 */
	public void launchFrame(){
		setTitle("feiji");//标题
		setSize(Constants.GAME_WIDTH, Constants.GAME_HEIGHT);//设置宽高
		setLocationRelativeTo(null);//位置居中
		setVisible(true);//表示可见

		//增加窗口监听，当点击窗口的关闭按钮关闭正常退出
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0); //非0表示异常终止
			}
			
		});
		new PaintThread().start();
		addKeyListener(new KeyMonitor());
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawImage(imgBackground, 0, 0, null);
		snake.drawMyself(g);


	}
	/**
	 * 重画窗口线程类，使惊静态窗口变成动态的
	 * 每40ms调用一次
	 * @author Administrator
	 *
	 */
	class PaintThread extends Thread{
		public void run(){
			while(true){
				repaint();
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	/**
	 * 键盘监听类，获取键盘输入情况
	 * @author Administrator
	 *
	 */
	class KeyMonitor extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			snake.setDirection(e);

			super.keyPressed(e);
		}

	}
	
	

	private Image offScreenImage = null;
	//Frame类，需要双缓冲去闪烁
	public void update(Graphics g) {
	    if(offScreenImage == null)
	        offScreenImage = this.createImage(500,500);//这是游戏窗口的宽度和高度
	     
	    Graphics gOff = offScreenImage.getGraphics();
	    paint(gOff);
	    g.drawImage(offScreenImage, 0, 0, null);
	}  
	public static void main(String[] args) {
		GameFrame frame = new GameFrame();
		frame.launchFrame();
		
	}
	
	
}
