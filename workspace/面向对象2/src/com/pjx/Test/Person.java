package com.pjx.Test;
/**
 * �������� ����һ���ӿ�
 * @author admin
 *
 */
abstract public  class Person {
	public abstract void eat() ;  //���󷽷���û�з����壬ֻ���������������ʵ��
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public static void main(String[] args) {
		School sc = new School ();
		sc.a();
	}
}
class Student extends Person{
	public void study() {
		System.out.println("ѧϰ");
	}
	
	@Override
	public void eat() {
		
		System.out.println("ѧ��Ҫ�Է�");
	}
	
}
class Teacher extends Person{

	public void teach() {
		System.out.println("����");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("��ʦҪ�Է�");
	}
	
}

class School extends Student{
	Person s1 = new Student();
	Person t1 = new Teacher();
	Student s2 = new Student();
	void a() {
		s1.eat();
		s2.study();
		t1.eat();
	}


}