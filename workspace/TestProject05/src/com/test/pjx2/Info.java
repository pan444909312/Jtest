package com.test.pjx2;
/**
 * 测试封装修饰符
 * @author pjx
 * 
 *
 */
import com.test.pjx.Human;

public class Info{
	public static void main(String[] args) {
		boy b1 = new boy("小明",11);
		girl g1 = new girl("小红");
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
		System.out.println(name);     //public定义的          跨包可以访问
		System.out.println(age);      //protected定义的 子类可以访问
//		System.out.println(weight);   //default不可访问
//		System.out.println(secret);   //private不可访问
	}
	public static void main(String[] args) {

	}
}

class girl {   //通过继承可以省略很多步骤，参考boy类
	
	String name;
	girl(String name){
		this.name = name;
		/*
		 *  只改变在改方法中human类的类变量name
		 *  没有给girl的类变量name赋值
		 *  方法结束后，该值归零
		 */
		Human g = new Human();     
		g.name = name;			  
		
	}
	
	void girlInfo() {
		Human g = new Human();          //没有继承需要new对象访问，
		g.name = name;					//后面的name为girl的类变量
		System.out.println(g.name);     //public定义的          跨包可以访问
//		System.out.println(g.age);      //protected定义的 跨包非子类不可以访问
//		System.out.println(g.weight);   //default不可访问
//		System.out.println(g.secret);   //private不可访问
	}
	
	public static void main(String[] args) {

	}
}