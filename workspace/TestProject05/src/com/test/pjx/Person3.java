package com.test.pjx;

import java.util.Scanner;

public class Person3 {
	public static void main(String[] args) {
		
		Person2 p = new Person2();
		Scanner sca = new Scanner(System.in);	

		p.setName("xxy");
		p.setAge(23);
		p.setSex("Ů");	

		
		System.out.println(p.getName()+"\n"+p.getAge()+"\n"+p.getSex());
		p.rest();
		
		Person2 b = new Boy() ;   //�����Զ�����ת��
		//�൱��  Boy b = new Boy();
		Girl g = new Girl();
		personRest(b);
		personRest(g);
		personRest(p);
		g.makeUp();
//		b.play();  		 //Peron2��û��play����
		Boy b2 =(Boy)b;  //����ת����Ҫǿ��ת��
		b.rest();
		b2.play();       //�ſ�������Boy�ķ�������Ȼ�������b Ĭ����Person2��ģ�ֻ������Person2��ķ��������ܵ���Boy��ķ���
		System.out.println(b2==b);   //ʵ���� ������ͬһ������
	}
	/**
	 * ��̬Ҫ�أ��̳У�������д�����෽������ָ���������
	 * Boy Girl �̳�Person2   ,  Boy Girl����дPerson2�еķ���
	 * ���෽����ͨ�������������ʵ�ֶ�̬��   ��Ϊ ���෽������ָ���������
	 */
	static void personRest(Person2 p) {
		p.rest();
	}
	
}

