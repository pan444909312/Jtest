package com.company.arrays;
/**
 * 遍历数组、数组插入元素、数组删除元素
 * @author Administrator
 *
 */
public class ArraysTest {


	
	public void showArrays(Object obj[]){
		//遍历数组的for-each循环
		for(Object temp : obj){
			System.out.println(temp);
			
		}
	}
	/**
	 * 在数组索引为num的位置插入temp
	 * @param str
	 * @param num
	 * @param temp
	 * @return
	 */
	public String[] insertArrayElement(String str[],int num,String temp){
		
		String[] str2 = new String[str.length+1];
		System.arraycopy(str, 0, str2, 0, num);
		System.arraycopy(str, num, str2, num+1, str2.length-num-1);
		str2[num] = temp;
		return str2;
	}
	
	/**
	 * 删除数组中索引为num的元素
	 * @param str
	 * @param num
	 * @return
	 */
	public String[] deleteArrayElement(String str[],int num){
		if(num<str.length){
			System.arraycopy(str, num+1, str, num, str.length-num-1);
		}
		str[str.length-1] = null;
		return str;
	}
	
	public static void main(String[] args) {
		String[] str1 = {"11","22","33","ss"};
		String[] str2 = new String[4];
		
		System.arraycopy(str1, 0, str2, 0, 4);//复制数组
		ArraysTest a1 = new ArraysTest();
		a1.showArrays(str2);
		System.out.println("###########");
		a1.showArrays(a1.deleteArrayElement(str1, 2));
		System.out.println("###################");
		a1.showArrays(a1.insertArrayElement(str2, 3, "kk"));
	}
}
