package com.pjx.circle;

import java.util.Scanner;
public class showCircle {
	public static void main(String[] args) {
		Cylinder c2 = new Cylinder();
		Scanner s = new Scanner(System.in);
		System.out.print("请输入一下半径：");
		c2.setRadius(s.nextDouble());
		System.out.print("请输入一下圆柱的高：");
		c2.setHigh(s.nextDouble());
		c2.showCircle();
		c2.showVolume();
		
		
	}
}


