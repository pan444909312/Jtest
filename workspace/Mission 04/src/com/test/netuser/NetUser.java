package com.test.netuser;

import com.test.basic.Person;

public class NetUser extends Person{

	String psw;

	String email;
	


	
	NetUser(){
		
	}
	NetUser(String name,String psw){
		NetUser n1 = new NetUser();
		n1.name = name;
		this.psw = psw;
		this.email = name +"@aerozhonghuan.com";
		System.out.println(name);
	}
	NetUser(String name,String psw,String emali){
		this(name,psw);
		this.email = email;
		
	}
	public void display() {         //重写方法 访问权限要大于等于父类
		System.out.println(name);
		System.out.println(psw);
		System.out.println(email);
	}
	
	public static void main(String[] args) {

		NetUser n1 = new NetUser("xxy","940822");
		System.out.println(n1.name);
		n1.display();
	}

}
