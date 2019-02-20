package com.test.pjx;

public class TestEquals extends TestExtends{
	
	
	public static void main(String[] args) {
		Object obj;

		Person p1 = new Person("张三","22");
		Person p2 = new Person("张三","11");
		System.out.println(p1==p2); //不是同一个对象
		System.out.println(p1.equals(p2));//equals重写了 只判断name，正常的判断只判断是否为同一个对象
		
		String str1 = "123";
		String str2 = "123";
		String str3 = new String("123");
		System.out.println(str1==str2);
		System.out.println(str1==str3);   //不是同一个对象
		System.out.println(str1.equals(str3));  //字符相同
		
	}
	
    public boolean equals(Object obj) {
        return (this == obj);
    }

    
}
