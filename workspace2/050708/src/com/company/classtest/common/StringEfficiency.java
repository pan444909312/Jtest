package com.company.classtest.common;

public class StringEfficiency {
	public static void main(String[] args) {
		String str1 = "";
		long num1 = Runtime.getRuntime().freeMemory();//��ȡϵͳʣ���ڴ�ռ�
		long time1 = System.currentTimeMillis();//��ȡϵͳ���ڵ�ʱ��
		/*
		 * ��ΪStringΪ���ɱ��ַ����У�str1 = str1 +i  i��ת�����ַ����������ӣ�����һ���ַ�����str1�������Ӻ��ֻ�����һ���µ��ַ���
		 * �����������㷨�൱�ڲ�����20000������
		 */
		for(int i=0;i<10000;i++) {
			str1 = str1 + i;
		}
		long num2 = Runtime.getRuntime().freeMemory();
		long time2 = System.currentTimeMillis();
        System.out.println("Stringռ���ڴ� : " + (num1 - num2));
        System.out.println("Stringռ��ʱ�� : " + (time2 - time1));
        
        StringBuilder str2 = new StringBuilder();
        
       long num3 = Runtime.getRuntime().freeMemory();
       long time3 = System.currentTimeMillis();
       for(int i=0;i<10000;i++) {
    	   str2.append(i);
       }
       long num4 = Runtime.getRuntime().freeMemory();
       long time4 = System.currentTimeMillis();
       System.out.println("StringBuilderռ���ڴ棺"+(num3-num4));
       System.out.println("StringBuilderռ��ʱ�䣺"+(time4-time3));
	}

}
