package com.pjx.arrays;
/**
 * �����������
 * @author admin
 *
 */
public class Arrays {
	public static void main(String[] args) {
		int[] a = new int[5];
		for(int i=0;i<a.length;i++) {
			a[i] = i;
		}
		//foreachѭ�������ڶ�ȡ����Ԫ�ص�ֵ�������޸�Ԫ�ص�ֵ
		for(int m:a) {
			System.out.println(m);
		}
//		for(int i=0;i<a.length;i++) {
//			System.err.println(a[i]);
//		}
	}

}
