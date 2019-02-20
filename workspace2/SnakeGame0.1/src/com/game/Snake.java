package com.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Snake extends GameObject{
	private boolean up,down,right,left;
	public Snake(){
		
	}
	public Snake(int x,int y,int speed){
		super(x,y,speed);
	}
	public Snake(int x,int y,int width,int height,int speed){
		super(x, y, width, height, speed);
	}
	@Override
	public void drawMyself(Graphics g) {
		super.drawMyself(g);
		Color c = g.getColor();
		g.setColor(Color.RED);
		g.fillRect((int)getX(), (int)getY(), getWidth(), getHeight());
		g.setColor(c);
		if(up){
			setY(getY()-getSpeed());
		}
		else if(down){
			setY(getY()+getSpeed());
		}
		else if(right){
			setX(getX()+getSpeed());
		}
		else if(left){
			setX(getX()-getSpeed());
		}
	}
	public void setDirection(KeyEvent e){
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			up = true;
			down = false;
			left = false;
			right = false;
			break;
		case KeyEvent.VK_DOWN:
			up = false;
			down = true;
			left = false;
			right = false;
			break;
		case KeyEvent.VK_RIGHT:
			up = false;
			down = false;
			left = false;
			right = true;
			break;
		case KeyEvent.VK_LEFT:
			up = false;
			down = false;
			left = true;
			right = false;
			break;
		default:
			break;
		}
	}
	
	
}
