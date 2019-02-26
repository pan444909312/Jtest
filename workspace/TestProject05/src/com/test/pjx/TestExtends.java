package com.test.pjx;

public class TestExtends {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.eat();
		stu.study();
		stu.walk();  
		Person p = new Person();
		p.walk();
	}
}

class Person{
	String name;
	String age;
	String height;
	String weight;
	
	public void rest() {
		System.out.println("������Ϣ");
	}
	void eat() {
		System.out.println("���ڳԷ�");
	}
	protected void walk() {
		System.out.println("������·");
	}
	public Person() {
		
	}
	public Person(String name, String age, String height, String weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public Person(String name) {
		super();
		this.name = name;
	}
	public Person(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	/**
	 * ֻͨ��name�Ա�
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())  //�����಻ͬ������false
			return false;
		Person other = (Person) obj;//ǿ��ת��ΪPerson��
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

}

class Student extends Person{
	String major;
	void study() {
		System.out.println("����ѧϰ");
	}
	
}





