package com.pjx.person;

public class Person {
	public  String name;
	protected int age;
	String height;
	String Weight;
	public Person() {
		
	}
	public Person(String name,int age) {
		this.age = age;
		this.name = name;
	}
	
	
	public Person(String name) {
		super();
		this.name = name;
	}
	public void sayAge() {
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		
	}
}

