package com.test.pjx2;
/**
 * ���Է�װ���η�
 * @author pjx
 * 
 *
 */
import com.test.pjx.Human;

public class Info{
	public static void main(String[] args) {
		boy b1 = new boy("С��",11);
		girl g1 = new girl("С��");
		b1.boyInfo();
		g1.girlInfo();
	}
	
}

class boy extends Human{
	
	boy(String name,int age){
		this.name = name;
		this.age = age;
		
	}
	void boyInfo() {
		System.out.println(name);     //public�����          ������Է���
		System.out.println(age);      //protected����� ������Է���
//		System.out.println(weight);   //default���ɷ���
//		System.out.println(secret);   //private���ɷ���
	}
	public static void main(String[] args) {

	}
}

class girl {   //ͨ���̳п���ʡ�Ժܶಽ�裬�ο�boy��
	
	String name;
	girl(String name){
		this.name = name;
		/*
		 *  ֻ�ı��ڸķ�����human��������name
		 *  û�и�girl�������name��ֵ
		 *  ���������󣬸�ֵ����
		 */
		Human g = new Human();     
		g.name = name;			  
		
	}
	
	void girlInfo() {
		Human g = new Human();          //û�м̳���Ҫnew������ʣ�
		g.name = name;					//�����nameΪgirl�������
		System.out.println(g.name);     //public�����          ������Է���
//		System.out.println(g.age);      //protected����� ��������಻���Է���
//		System.out.println(g.weight);   //default���ɷ���
//		System.out.println(g.secret);   //private���ɷ���
	}
	
	public static void main(String[] args) {

	}
}