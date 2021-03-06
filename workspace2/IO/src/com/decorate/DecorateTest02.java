package com.decorate;
import java.util.Base64;

public class DecorateTest02 {
	public static void main(String[] args) {
		Person p = new Person("张三", 12);
		Athlete a = new Athlete(p);
		Artist ar = new Artist(a);
		System.out.println(p.getInfo());
		System.out.println(a.getInfo());
		System.out.println(ar.getInfo());
	}
	
}

//抽象组件
interface PersonInfo{
	String getInfo(); 

	
}

//具体组件
class Person implements PersonInfo{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String getInfo() {
		return this.name+"--"+this.age;
	}

	
}
//抽象装饰类
abstract class Skills implements PersonInfo{
	PersonInfo p;
	
	abstract public String skill();
	public Skills(PersonInfo p) {
		super();
		this.p = p;
	}

	@Override
	public String getInfo() {
		return this.p.getInfo();
	}
	
	
}
//具体装饰类
class Athlete extends Skills{

	public Athlete(PersonInfo p) {
		super(p);
	}

	@Override
	public String getInfo() {
		return super.getInfo()+skill();
	}
	@Override
	public String skill() {
		return "会打篮球";
	}
}
class Artist extends Skills{

	public Artist(PersonInfo p) {
		super(p);
	}

	@Override
	public String getInfo() {
		return super.getInfo()+skill();
	}

	@Override
	public String skill() {
		return "会弹琴唱歌";
	}
	
}