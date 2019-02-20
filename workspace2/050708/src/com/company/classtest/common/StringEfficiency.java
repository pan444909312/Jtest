package com.company.classtest.common;

public class StringEfficiency {
	public static void main(String[] args) {
		String str1 = "";
		long num1 = Runtime.getRuntime().freeMemory();//获取系统剩余内存空间
		long time1 = System.currentTimeMillis();//获取系统现在的时间
		/*
		 * 因为String为不可变字符序列，str1 = str1 +i  i会转换成字符串进行连接，生成一个字符串，str1经过连接后又会生成一个新的字符串
		 * 所以以下下算法相当于产生了20000个对象
		 */
		for(int i=0;i<10000;i++) {
			str1 = str1 + i;
		}
		long num2 = Runtime.getRuntime().freeMemory();
		long time2 = System.currentTimeMillis();
        System.out.println("String占用内存 : " + (num1 - num2));
        System.out.println("String占用时间 : " + (time2 - time1));
        
        StringBuilder str2 = new StringBuilder();
        
       long num3 = Runtime.getRuntime().freeMemory();
       long time3 = System.currentTimeMillis();
       for(int i=0;i<10000;i++) {
    	   str2.append(i);
       }
       long num4 = Runtime.getRuntime().freeMemory();
       long time4 = System.currentTimeMillis();
       System.out.println("StringBuilder占用内存："+(num3-num4));
       System.out.println("StringBuilder占有时间："+(time4-time3));
	}

}
