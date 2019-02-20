package com.exam.object;

public class Musician {
	private String name;
	private String major;
	private int age;

	public void play(Instrument i) {
		
		i.makeSound();
	}
	
	public Musician() {
		super();
	}
	public Musician(String name, String major, int age) {
		super();
		this.name = name;
		this.major = major;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
