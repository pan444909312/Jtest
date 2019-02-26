package com.decorate;
import java.util.Base64;

public class DecorateTest02 {
	public static void main(String[] args) {
		Person p = new Person("����", 12);
		Athlete a = new Athlete(p);
		Artist ar = new Artist(a);
		System.out.println(p.getInfo());
		System.out.println(a.getInfo());
		System.out.println(ar.getInfo());
	}
	
}

//�������
interface PersonInfo{
	String getInfo(); 

	
}

//�������
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
//����װ����
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
//����װ����
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
		return "�������";
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
		return "�ᵯ�ٳ���";
	}
	
}