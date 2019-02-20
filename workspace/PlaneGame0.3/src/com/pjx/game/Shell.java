package com.pjx.game;

import java.awt.Color;
import java.awt.Graphics;

public class Shell extends GameObject{
	double degree;
	public Shell(double x, double y, int speed, int width, int height) {
		super(x,y,speed,width,height);
		degree = Math.PI*Math.random()*2;
	}
	public Shell() {
		
	}

	@Override
	public void drawMyself(Graphics g) {
		super.drawMyself(g);
		Color c = g.getColor();  //将外部传入对象的状态保存
		
		g.setColor(Color.red);
		g.fillOval((int) getX(),(int) getY(),(int) getWidth(),(int) getHeight());
		
		
		setX(getX()+getSpeed()*Math.cos(degree));
		setY(getY()+getSpeed()*Math.sin(degree));
//		System.out.println(degree);
		if(getX()<0+10||getX()>Constant.GAME_WIDTH-Constant.SHELL_WIDTH-10) { //10边框宽度
			degree = Math.PI-degree;
		}
		if(getY()<0+30||getY()>Constant.GAME_HEIGHT-Constant.SHELL_HEIGHT-10) { //30标题框高度
			degree = -degree;
			
		}
		
		g.setColor(c);//返回给外部，变回以前的颜色
		
	}
	
}
