package com.exam.object;

public class test {
	Musician m1 = new Musician("潘1","钢琴",18);
	Musician m2 = new Musician("潘2","小提琴",18);
	Musician m3 = new Musician("潘3","二胡",18);
	Instrument i1 = new Piaon();
	Instrument i2 = new Erhu();
	Instrument i3 = new Violin();
	public void testPlay(Musician m) {
		if(m.getMajor()=="钢琴") {
			System.out.print(m.getName());
			i1.makeSound();
		}
		else if(m.getMajor()=="二胡") {
			System.out.print(m.getName());
			i2.makeSound();
		}
		else if(m.getMajor()=="小提琴") {
			System.out.print(m.getName());
			i3.makeSound();
		}
		else {
			System.out.println("他会其他乐器");
		}
	}
	public static void main(String[] args) {

		test t1 = new test();
		t1.testPlay(t1.m3);

	}

}
