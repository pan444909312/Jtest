package com.pjx.arrays;
/**
 * 测试数组遍历
 * @author admin
 *
 */
public class Arrays {
	public static void main(String[] args) {
		int[] a = new int[5];
		for(int i=0;i<a.length;i++) {
			a[i] = i;
		}
		//foreach循环：用于读取数组元素的值，不能修改元素的值
		for(int m:a) {
			System.out.println(m);
		}
//		for(int i=0;i<a.length;i++) {
//			System.err.println(a[i]);
//		}
	}

}
