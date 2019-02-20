package com.pjx.Test;
/**
 * 抽象类啦 测试一下子咯
 * @author admin
 *
 */
abstract public  class Person {
	public abstract void eat() ;  //抽象方法，没有方法体，只有声明，子类必须实现
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
		System.out.println("学习");
	}
	
	@Override
	public void eat() {
		
		System.out.println("学生要吃饭");
	}
	
}
class Teacher extends Person{

	public void teach() {
		System.out.println("教书");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("老师要吃饭");
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