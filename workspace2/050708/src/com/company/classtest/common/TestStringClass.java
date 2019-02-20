package com.company.classtest.common;

import java.util.Date;

public class TestStringClass {
	/*
	 * String  是 private final char value[];  final修饰 所以为不可变字符串
	 * StringBuilder和StringBuffer是  char[] value   可变字符串
	 * StringBuffer JDK1.0版本提供的类，线程安全，做线程同步检查， 效率较低。
	 * StringBuilder JDK1.5版本提供的类，线程不安全，不做线程同步检查，因此效率较高。 建议采用该类。
	 */
	static StringBuilder s1 = new StringBuilder();
//	static StringBuffer s2 = new StringBuffer();
	static StringBuilder s3 = new StringBuilder("abc");

	
	
	
	public static void main(String[] args) {
		
        //编译器做了优化,直接在编译的时候将字符串进行拼接
        String str1 = "hello" + "123";//相当于str1 = "hello123";
        String str2 = "hello123";
        System.out.println(str1 == str2);//true
        String str3 = "hello";
        String str4 = "java";
        //编译的时候不知道变量中存储的是什么,所以没办法在编译的时候优化
        String str5 = str3 + str4;
        System.out.println(str2 == str5);//false
        System.out.println("############################");
        //append方法，在可变字符串后追加内容
    	for(int i=0;i<5;i++) {
    		s1.append((char)('a'+i));  
    	}
    	System.out.println(s1);
    	s1.append(",我喜欢xxy~");
    	System.out.println(s1);
    	s1.append(12313.3123).append('e').append("结束了");//append方法return this，即返回本对象，所以可以继续调用方法
    	System.out.println(s1);
    	s1.insert(0,'s');
    	System.out.println(s1);
    	s1.insert(0, 'x').insert(1, 'y');//return this
    	System.out.println(s1);
    	System.out.println("##################");
    	System.out.println(s3);
//    	s3.insert(4, 1);//StringIndexOutOfBoundsException 数组越界
    	s3.append(1).insert(4, 2);
    	System.out.println(s3);
    	s3.insert(s3.length(), "结尾yb");//相当于s3.append("结尾y");
    	System.out.println(s3);
    	s3.insert(1, s1, 0, 2);//在s3索引为1的地方插入s1字符串[0,2)的元素
    	System.out.println(s3);
    	s3.delete(0, 2);//删除[0,2)的元素
    	System.out.println(s3);
    	s3.deleteCharAt(0);//删除该索引的元素
    	System.out.println(s3);
    	System.out.println(s3.charAt(5));//获取该索引的元素
    	System.out.println(s3.reverse());//倒序
    	
	}
	
	

}
