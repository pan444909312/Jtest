package com.test.pjx;
/**
 * 测试封装规则
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
			System.out.println("请输入正确的年龄");
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
		System.out.println("睡觉~");
	}

}
class Boy extends Person2{
	public void rest() {
		System.out.println("打游戏~");
	}
	public void play() {
		System.out.println("打篮球~");
	}
	
}
class Girl extends Person2{
	public void rest() {
		System.out.println("逛街~");
	}
	public void makeUp() {
		System.out.println("化妆~");
	}

}