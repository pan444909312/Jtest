package com.leetcode.solution;

public class Test {
	int name;
	int age;

	public Test(int name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return this.name+"\t"+this.age;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Test t1 = new Test(1, 2);
		Test t2 = t1;
		t1.setAge(1000);
		System.out.println(t1);
		System.out.println(t2);
		t2.setAge(12);
		System.out.println(t1);
		System.out.println(t2);
		
	}
}
