
import java.awt.*;
import javax.swing.*;



//extends JFrame 继承swing里的窗口类
public class ballgame extends JFrame{
	
	//加载图片
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png"); //30*30
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg"); //856*501
	
	double x=100;   //小球的横坐标
	double y=300;   //小球的纵坐标
	
	
	boolean direction = true;  //boolean相当于一个判断开关，这里用作指定方向，下面代码会实现当true时，会向右移动，false则向左
	
	//画窗口
	public void paint(Graphics g) {
		System.out.println("我画着呢~");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		

		if(direction) {
			x = x+10;
		}
		else {
			x = x-10;
		}
		
		//两个if判断是否到达边界
		if(x>856-40-30) {     //856桌子宽度  40桌子边框的宽度  30小球的直径
			direction = false;
		}
		if(x<40) {
			direction = true;
		}
		
	}
	
	
	//窗口加载
	void launchFrame() {
		setSize(856,501); //窗口的宽和高
		setLocation(50,50);//窗口在屏幕中的x,y位置
		setVisible(true);
		
		//重画窗口，每秒画25次
		while(true){
			repaint();
			try {
				Thread.sleep(40);  //40ms 1秒25次重画
			}catch(Exception e) {
				e.printStackTrace();
			}

		}
	}
	
	
	
	//main方法是程序执行的入口
	public static void main(String[] args) {
		System.out.println("hey~");
		ballgame game = new ballgame();
		game.launchFrame();
	}
}
