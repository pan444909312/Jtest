package com.exam.object;

public class test {
	Musician m1 = new Musician("��1","����",18);
	Musician m2 = new Musician("��2","С����",18);
	Musician m3 = new Musician("��3","����",18);
	Instrument i1 = new Piaon();
	Instrument i2 = new Erhu();
	Instrument i3 = new Violin();
	public void testPlay(Musician m) {
		if(m.getMajor()=="����") {
			System.out.print(m.getName());
			i1.makeSound();
		}
		else if(m.getMajor()=="����") {
			System.out.print(m.getName());
			i2.makeSound();
		}
		else if(m.getMajor()=="С����") {
			System.out.print(m.getName());
			i3.makeSound();
		}
		else {
			System.out.println("������������");
		}
	}
	public static void main(String[] args) {

		test t1 = new test();
		t1.testPlay(t1.m3);

	}

}
