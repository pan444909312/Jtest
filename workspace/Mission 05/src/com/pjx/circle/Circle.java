package com.pjx.circle;
import java.math.*;

public class Circle {
	private double radius;
	final double PI = 3.14d;
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public double getCircleArea() {
		
		return PI*radius*radius;
	}
	public double getCircumference() {
		return PI*radius*2;
	}
	public void showCircle() {
		System.out.printf("�뾶��%.2f\n",getRadius());
		System.out.printf("�����%.2f\n",getCircleArea());
		System.out.printf("�ܳ���%.2f\n",getCircumference());
	}

}
