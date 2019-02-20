package com.company.test1;

public class StringMethod {
	String str1 = "panjuxiang";
	String str2 = "xia";
	String str3 = "xin";
	String str4 = "XIn";
	public static void main(String[] args) {
		StringMethod s1 = new StringMethod();
		char a = 's';
		a = s1.str1.charAt(4);//返回字符串下标为4的字符
		//int类型 返回字符串中该索引的字符
		System.out.println(s1.str1.charAt(0)+"和"+a);
		// boolean类型，比较字符串，不同返回false，相同返回true
		System.out.println(s1.str3.equals(s1.str4));
		//忽略大小写比较字符串
		System.out.println(s1.str3.equalsIgnoreCase(s1.str4));
		//int类型，返回从头开始查找的字符串在 str1中存在的索引位置，若不存在则返回-1
		System.out.println(s1.str1.indexOf(s1.str2));
		System.out.println(s1.str1.indexOf(s1.str4));
		System.out.println(s1.str1.indexOf('x'));
		//从末尾开始查找
		System.out.println(s1.str1.lastIndexOf(s1.str2));
		System.out.println(s1.str1.lastIndexOf(s1.str4));
		System.out.println("###############################");
		//int类型，返回字符串的长度
		System.out.println(s1.str1.length());
		//boolean类型， 判断开始的字符串是否为....判断结束的字符串是否为...
		System.out.println(s1.str1.startsWith("panj"));
		System.out.println(s1.str1.startsWith("paj"));
		System.out.println(s1.str1.endsWith("xiang"));
		System.out.println(s1.str1.endsWith("bng"));
		
	}


}
