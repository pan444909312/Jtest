package com.pjx.game;

import java.awt.Graphics;
import java.awt.Image;

import java.awt.event.KeyEvent;

public class Plane extends GameObject{
	boolean left,right,up,down;
	boolean live=true;
	
	public Plane() {
		
	}
	public Plane(Image img,double x,double y,int speed,int width,int height) {
//		super(img, x, y，width，height);相当于以下内容
		this.setImg(img);
		this.setX(x);
		this.setY(y);
		this.setSpeed(speed);
		this.setWidth(width);
		this.setHeight(height);
		
	}

	@Override
	public void drawMyself(Graphics g) {
		if(live) {
			super.drawMyself(g);
			if(left) {
				setX(getX()-getSpeed());
			}
			if(right) {
				setX(getX()+getSpeed());
			}
			if(up) {
				setY(getY()-getSpeed());
			}
			if(down) {
				setY(getY()+getSpeed());
			}
		}else {
			
		}
	}
	
	public void addDirection(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			left = true;
			break;
		case KeyEvent.VK_RIGHT:
			right = true;
			break;
		case KeyEvent.VK_UP:
			up = true;
			break;
		case KeyEvent.VK_DOWN:
			down = true;
			break;
		case KeyEvent.VK_A:
			left = true;
			break;
		case KeyEvent.VK_D:
			right = true;
			break;
		case KeyEvent.VK_W:
			up = true;
			break;
		case KeyEvent.VK_S:
			down = true;
			break;
			
		}
	}
	public void minusDirection(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			left = false;
			break;
		case KeyEvent.VK_RIGHT:
			right = false;
			break;
		case KeyEvent.VK_UP:
			up = false;
			break;
		case KeyEvent.VK_DOWN:
			down = false;
			break;
		case KeyEvent.VK_A:
			left = false;
			break;
		case KeyEvent.VK_D:
			right = false;
			break;
		case KeyEvent.VK_W:
			up = false;
			break;
		case KeyEvent.VK_S:
			down = false;
			break;
			
		}
	}
	
	

}
