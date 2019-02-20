package com.test.basic;

public class Person {
	protected String name;
	protected int age;
    public Person(String name,int age){
		this.name = name;
		this.age =age;
	}
//    public Person(){                        //不写报错
//    	
//    }
    
	protected void display() {
		System.out.println("姓名："+name);
		System.out.println("年龄："+age);
	}
	
	public static void main(String[] args) {
		
		Person p1 = new Person("xxy",24);
		p1.display();
		
	}

}
