package com.pjx.circle;

import java.util.Scanner;
public class showCircle {
	public static void main(String[] args) {
		Cylinder c2 = new Cylinder();
		Scanner s = new Scanner(System.in);
		System.out.print("������һ�°뾶��");
		c2.setRadius(s.nextDouble());
		System.out.print("������һ��Բ���ĸߣ�");
		c2.setHigh(s.nextDouble());
		c2.showCircle();
		c2.showVolume();
		
		
	}
}


