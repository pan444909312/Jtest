package com.pjx.circle;

public class Cylinder extends Circle{
	private double high;

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}
	public double getVolume() {
		return getCircleArea()*high;
	}
	public void showVolume() {
		System.out.printf("Բ����������%.2f",getVolume());
	}

}
