package com.test.basic;

public class Person {
	protected String name;
	protected int age;
    public Person(String name,int age){
		this.name = name;
		this.age =age;
	}
//    public Person(){                        //��д����
//    	
//    }
    
	protected void display() {
		System.out.println("������"+name);
		System.out.println("���䣺"+age);
	}
	
	public static void main(String[] args) {
		
		Person p1 = new Person("xxy",24);
		p1.display();
		
	}

}
