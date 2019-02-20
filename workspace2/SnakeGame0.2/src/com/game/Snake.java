package com.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Snake extends GameObject {
	private boolean up, down, right, left;
    int[] snakex = new int [1000];
    int[] snakey = new int [1000];
    int snakeLength = 3;
    
	public Snake() {
	}


	public Snake(int x, int y, int width, int height, int speed) {
		snakex[0] = x;
		snakey[0] = y;
		this.setWidth(width);
		this.setheight(height);
		this.setSpeed(speed);
		snakex[1] = snakex[0];
		snakex[2] = snakex[1];
		snakey[1] = snakey[0] + Constants.SNAKE_HEIGHT;
		snakey[2] = snakey[1] + Constants.SNAKE_HEIGHT;
		for(int i=0;i<snakeLength;i++){
			System.out.println(i+":"+snakex[i]+""+snakey[i]);
		}
	}

	@Override
	public void drawMyself(Graphics g) {
		super.drawMyself(g);
		Color c = g.getColor();
		g.setColor(Color.RED);
		g.fillOval(snakex[0], snakey[0], getWidth(), getHeight());
		for(int i=1;i<snakeLength;i++){
			g.setColor(Color.WHITE);
			g.fillOval(snakex[i], snakey[i], getWidth(), getHeight());
		}
		g.setColor(c);
	}

	public void setDirection(KeyEvent e) {
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
