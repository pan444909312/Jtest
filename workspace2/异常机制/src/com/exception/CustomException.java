package com.exception;

public class CustomException {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setAge(-1);
	}
}
class Person{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<0) {
			//异常发生 直接抛出异常
			throw new IllegalAgeException("年龄不能为负");
		}
		this.age = age;

	}
	
}
/**
 * 定义一个自定义异常
 * @author admin
 *
 */
class IllegalAgeException extends RuntimeException{
	public IllegalAgeException(){
		
	}
	public IllegalAgeException(String message) {
		super(message);
	}
	
}