package com.pjx.game;

import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
	public void launchFrame() {
		setTitle("飞机躲避子弹");//设置窗口的标题
		setVisible(true);//设置窗口可见，默认是不可见的
		setSize(500, 500);//设置窗口尺寸
		setLocation(800, 200);//设置窗口位置
		
        //增加关闭窗口监听，这样用户点击右上角关闭图标，可以关闭游戏程序
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);//结束虚拟机运行 0表示正常结束，非0为非正常结束

            }
        }); 
	}
	/**
	 * paint方法作用是：画出整个窗口及内部内容。被系统自动调用
	 */
	@Override
	public void paint(Graphics g) {
		g.drawLine(200, 200, 400, 400);
		g.drawRect(100, 100, 200, 300);
		g.drawOval(100, 100, 300, 300);
		
		
	}
	
	
	
	public static void main(String[] args) {
		GameFrame g = new GameFrame();
		g.launchFrame();
	}
}
