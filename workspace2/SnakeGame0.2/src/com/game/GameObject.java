package com.game;

import java.awt.Graphics;
import java.awt.Image;

/**
 * 游戏元素基本属性方法类
 * 
 * @author Administrator
 *
 */
public class GameObject {
	Image img;
	private double x, y;
	private int width;
	private int height;
	private int speed;

	public GameObject(Image img, double x, double y, int width, int height, int speed) {
		super();
		this.img = img;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.speed = speed;
	}

	public GameObject(Image img, double x, double y) {
		super();
		this.img = img;
		this.x = x;
		this.y = y;
	}

	public GameObject(double x, double y, int speed) {
		super();
		this.x = x;
		this.y = y;
		this.speed = speed;
	}

	public GameObject(double x, double y, int width, int height, int speed) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.speed = speed;
	}

	public GameObject() {
		super();
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setheight(int height) {
		this.height = height;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void drawMyself(Graphics g) {
		g.drawImage(img, (int) x, (int) y, null);
	}

}
