/**
 * 这是桌球游戏的基础
 * 作者潘炬翔
 */
import java.awt.*;
import javax.swing.*;



//extends JFrame 继承swing里的窗口类
public class ballgame2 extends JFrame{

	//加载图片
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png"); //30*30
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg"); //856*501
	
	double x=100;   //小球的横坐标
	double y=100;   //小球的纵坐标
	
	double degree =3.14/3 ;  //弧度，60度
	
	//画窗口
	public void paint(Graphics g) {
		System.out.println("我画着呢2~");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		
		x = x + 30*Math.cos(degree);
		y = y + 30*Math.sin(degree);

		if(y>501-40-30||y<40+40) { //y<40+40   一个为桌子边框的高度 还有一个为标题栏的高度
			degree = -degree;     //x轴对称
		}
		if(x>856-40-30||x<40){
			degree = 3.14 - degree;  //y轴对称
		}
	}
	
	
	//窗口加载
	void launchFrame() {
		setSize(856,501); //窗口的宽和高
		setLocation(50,50);//窗口在屏幕中的x,y位置
		setVisible(true); //设置窗口可见，默认是不可见的
		
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
		System.out.println("hey~2");
		ballgame2 game = new ballgame2();
		game.launchFrame();
	}
}
