package com.pjx.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;

public class GameStart extends GameObject{
	boolean gameLive;
	int mouseClickX;
	int mouseClickY;

	public GameStart(Image img,double x,double y) {
		super(img, x, y);
		
	}

	@Override
	public void drawMyself(Graphics g) {
		if(!gameLive) {
			super.drawMyself(g);
		}
		if((mouseClickX>400&&mouseClickX<600)&&(mouseClickY>350-36&&mouseClickY<350+72)) {
			gameLive = true;
			

		}
		
	}
	public void Click(MouseEvent e) {
		mouseClickX = e.getX();	
		mouseClickY = e.getY();

	}
	
	
}
