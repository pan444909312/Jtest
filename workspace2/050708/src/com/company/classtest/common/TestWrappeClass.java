package com.company.classtest.common;

public class TestWrappeClass {
	//��������ת��ΪInteger���󣬳�Ϊװ��
	static Integer int1 = new Integer(50);
	static Integer int2 = Integer.valueOf(50);
	static Integer int3 = 50;//�Զ�װ�䣬�൱�ڱ������Զ�Ϊ�������µ��﷨���� Iteger.valueOf(50);
	
	/*
	 *   ���͡�char��������Ӧ�İ�װ�࣬���Զ�װ��ʱ
	 *   ����-128~127֮���ֵ����л��洦����Ŀ�������Ч�ʡ�
	 *   ��Щ�����ֵ��������һ������������������Χ�ڵ�ֵ��ͬ�����ͬһ���ط�ȡ���ֵ�����Զ���Ҳ��ͬ�����õ�ַ��ͬ��
	 *   ���������Χ����ͬ�Ķ�����Ȼֵ��ͬ���������õ�ַ��ͬ�����ԡ�==���Ľ��Ϊfalse
	 */
	static Integer int4 = new Integer(128);
	static Integer int5 = Integer.valueOf(128);
	static Integer int6 = 128;//�Զ�װ��
	static Integer int7 = Integer.valueOf(128);
	
	//���Խ�Integer����ת����6�л�������ֵ���� int float byte long double short
	int a = int7.intValue();
	float b = int7.floatValue();
	int c = int7;  //�Զ�����,�൱�� int c = int7.intValue()
	
	Integer int8 = null;//null��ʾint8û��ָ���κζ����ʵ��
	int d = int8;		//���Բ����ܵ���intValue�������ᱨ��      �൱��int d = int8.intValue()
	
	//�ַ���ת��ΪInteger����
	static Integer int9 = new Integer("16");
//	static Integer int9 = new Integer("asd");  //ExceptionInInitializerError,��ʼ���쳣
	static Integer int10 = Integer.parseInt("16");
	static Integer int11 = Integer.parseInt("16");
	//Integer����ת��Ϊ�ַ���
	String str1 = int11.toString();



	public static void main(String[] args) {

		System.out.println(int1==int2); //int1Ϊnew�� һ�����󣬵�ַ��int2��int3��ͬ
		System.out.println(int1==int3);
		System.out.println(int2==int3); //��ȡ��IntegerCache���е�cache�����б����ֵ�����Է���true
		System.out.println("##########################");
		System.out.println(int4==int5);
		System.out.println(int4==int6);
		System.out.println(int5==int6);
		System.out.println(int9==int10);//ͬ��һ��
		System.out.println(int11==int10);//ͬ������
		System.out.println(Integer.MAX_VALUE+"\t"+Integer.MIN_VALUE);
		

	}

}
