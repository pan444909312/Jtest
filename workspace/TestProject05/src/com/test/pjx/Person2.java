package com.test.pjx;
/**
 * ���Է�װ����
 * @author pjx
 * 
 *
 */
public class Person2 {
	
	private String name;
	private int age;
	private String sex;
	private int id;
	

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		if(age>=0&&age<=130) {
			this.age = age;
		}
		else {
			System.out.println("��������ȷ������");
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	public void rest() {
		System.out.println("˯��~");
	}

}
class Boy extends Person2{
	public void rest() {
		System.out.println("����Ϸ~");
	}
	public void play() {
		System.out.println("������~");
	}
	
}
class Girl extends Person2{
	public void rest() {
		System.out.println("���~");
	}
	public void makeUp() {
		System.out.println("��ױ~");
	}

}