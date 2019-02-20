package com.company.wrappe;

public class TestWrappeClass {
	//基本类型转化为Integer对象，称为装箱
	static Integer int1 = new Integer(50);
	static Integer int2 = Integer.valueOf(50);
	static Integer int3 = 50;//自动装箱，相当于编译器自动为您作以下的语法编译 Iteger.valueOf(50);
	
	/*
	 *   整型、char类型所对应的包装类，在自动装箱时
	 *   对于-128~127之间的值会进行缓存处理，其目的是提高效率。
	 *   这些缓存的值都保存在一个数组里，所以在这个范围内的值相同，会从同一个地方取这个值，所以对象也相同（引用地址相同）
	 *   超出这个范围，不同的对象虽然值相同，但是引用地址不同，所以“==”的结果为false
	 */
	static Integer int4 = new Integer(128);
	static Integer int5 = Integer.valueOf(128);
	static Integer int6 = 128;//自动装箱
	static Integer int7 = Integer.valueOf(128);
	
	//Integer对象转换为基本数据类型的数值型（不包括字符型和布尔型），称为拆箱
	int a = int7.intValue();
	float b = int7.floatValue();
	byte c = int7.byteValue();
	int d = int7;//自动拆箱，相当高于int7.intValue();
	
	
	//字符串转化为Integer对象
	static Integer int8 = Integer.parseInt("32131");
	static Integer int9 = new Integer("221");//默认调用下面方法，采用10进制
	static Integer int10 = Integer.parseInt("211", 10);//后面的参数表示进制
	// Integer对象转化成字符串
	String str1 = int8.toString();
	
	
	
	

	public static void main(String[] args) {
		
		System.out.println(Integer.MAX_VALUE+"\t"+Integer.MIN_VALUE);
		System.out.println(int1==int2);
		System.out.println(int1==int3);
		System.out.println(int2==int3);
		System.out.println("##########################");
		System.out.println(int4==int5);
		System.out.println(int4==int6);
		System.out.println(int5==int6);
	}

}
