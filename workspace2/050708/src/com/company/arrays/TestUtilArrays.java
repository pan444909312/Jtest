package com.company.arrays;

import java.util.Arrays;

public class TestUtilArrays {
	
	

	public static void main(String[] args) {
		String[] str1 = {"12","213","5","9999","43"};
		int[] int1 = {1,3321,66,234,32,11,92,321,6};

		/*
		str1.length();//数组没有length方法，只有length属性
		int a = str1.length;
		str1[0].length();//string有length方法
		*/
		//打印数组的地址
		System.out.println(str1);
//		System.out.println(str1.toString());//与上相同
		//打印数组，该toString与上面的toString不同，上面的是Object的方法,这个是Arrys类的静态方法
		System.out.println(Arrays.toString(str1));
		//数组排序
		Arrays.sort(int1);  //全部排序
//		Arrays.sort(int1, 0, 3);	//仅排序索引[0,3)
		System.out.println(Arrays.toString(int1));
		//二分法查找,只能查找排序后的，所以使用该方法必须先排序,返回负数则没查找到
		System.out.println("该元素的索引为："+Arrays.binarySearch(int1, 11));
		//数据填充方法,
		Arrays.fill(int1, 0, 3, 100);//仅替换索引[0,3)
		Arrays.fill(int1, 8, 9,100);//替换索引8
//		Arrays.fill(int1, 100);//全部替换
		System.out.println(Arrays.toString(int1));
	}

}
