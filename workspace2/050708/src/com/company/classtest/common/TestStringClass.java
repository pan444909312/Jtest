package com.company.classtest.common;

import java.util.Date;

public class TestStringClass {
	/*
	 * String  �� private final char value[];  final���� ����Ϊ���ɱ��ַ���
	 * StringBuilder��StringBuffer��  char[] value   �ɱ��ַ���
	 * StringBuffer JDK1.0�汾�ṩ���࣬�̰߳�ȫ�����߳�ͬ����飬 Ч�ʽϵ͡�
	 * StringBuilder JDK1.5�汾�ṩ���࣬�̲߳���ȫ�������߳�ͬ����飬���Ч�ʽϸߡ� ������ø��ࡣ
	 */
	static StringBuilder s1 = new StringBuilder();
//	static StringBuffer s2 = new StringBuffer();
	static StringBuilder s3 = new StringBuilder("abc");

	
	
	
	public static void main(String[] args) {
		
        //�����������Ż�,ֱ���ڱ����ʱ���ַ�������ƴ��
        String str1 = "hello" + "123";//�൱��str1 = "hello123";
        String str2 = "hello123";
        System.out.println(str1 == str2);//true
        String str3 = "hello";
        String str4 = "java";
        //�����ʱ��֪�������д洢����ʲô,����û�취�ڱ����ʱ���Ż�
        String str5 = str3 + str4;
        System.out.println(str2 == str5);//false
        System.out.println("############################");
        //append�������ڿɱ��ַ�����׷������
    	for(int i=0;i<5;i++) {
    		s1.append((char)('a'+i));  
    	}
    	System.out.println(s1);
    	s1.append(",��ϲ��xxy~");
    	System.out.println(s1);
    	s1.append(12313.3123).append('e').append("������");//append����return this�������ر��������Կ��Լ������÷���
    	System.out.println(s1);
    	s1.insert(0,'s');
    	System.out.println(s1);
    	s1.insert(0, 'x').insert(1, 'y');//return this
    	System.out.println(s1);
    	System.out.println("##################");
    	System.out.println(s3);
//    	s3.insert(4, 1);//StringIndexOutOfBoundsException ����Խ��
    	s3.append(1).insert(4, 2);
    	System.out.println(s3);
    	s3.insert(s3.length(), "��βyb");//�൱��s3.append("��βy");
    	System.out.println(s3);
    	s3.insert(1, s1, 0, 2);//��s3����Ϊ1�ĵط�����s1�ַ���[0,2)��Ԫ��
    	System.out.println(s3);
    	s3.delete(0, 2);//ɾ��[0,2)��Ԫ��
    	System.out.println(s3);
    	s3.deleteCharAt(0);//ɾ����������Ԫ��
    	System.out.println(s3);
    	System.out.println(s3.charAt(5));//��ȡ��������Ԫ��
    	System.out.println(s3.reverse());//����
    	
	}
	
	

}
