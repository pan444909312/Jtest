package com.test.pjx;

public class TestEquals extends TestExtends{
	
	
	public static void main(String[] args) {
		Object obj;

		Person p1 = new Person("����","22");
		Person p2 = new Person("����","11");
		System.out.println(p1==p2); //����ͬһ������
		System.out.println(p1.equals(p2));//equals��д�� ֻ�ж�name���������ж�ֻ�ж��Ƿ�Ϊͬһ������
		
		String str1 = "123";
		String str2 = "123";
		String str3 = new String("123");
		System.out.println(str1==str2);
		System.out.println(str1==str3);   //����ͬһ������
		System.out.println(str1.equals(str3));  //�ַ���ͬ
		
	}
	
    public boolean equals(Object obj) {
        return (this == obj);
    }

    
}
