package com.six.Exception;

public class Triangle {
	public void isTriangle(int a, int b, int c) {
		if (a + b > c && a + c > b && b + c > a) {
			System.out.println(a + "\t" + b + "\t" + c);
		} else {
			throw new IllegalArgumentException("a,b,c不能构成三角形");
		}
	}

	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.isTriangle(1, 3, 3);
	}
}
