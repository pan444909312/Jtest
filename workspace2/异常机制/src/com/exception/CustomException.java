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
			//�쳣���� ֱ���׳��쳣
			throw new IllegalAgeException("���䲻��Ϊ��");
		}
		this.age = age;

	}
	
}
/**
 * ����һ���Զ����쳣
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