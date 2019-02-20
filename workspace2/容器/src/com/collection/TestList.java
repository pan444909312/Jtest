package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
/**
 * 测试collection接口中的方法
 * @author admin
 *
 */
public class TestList {
	
	public void test01() {

		Collection<String> c = new ArrayList<>();
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		c.add("张一");
		c.add("张二");
		c.add("张三");
		System.out.println(c);
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		System.out.println(c.contains("张三"));
		
		Object o[] = c.toArray();		//容器转换数组
		System.out.println(Arrays.toString(o));
		
		c.remove("张二");
		System.out.println(c);
		c.removeAll(c);
		System.out.println(c.size());
		System.out.println(c.contains("张三"));
	
	}
	
	public void test02() {
		List<String> l1 = new ArrayList<>();
		
		l1.add("aa");
		l1.add("bb");
		l1.add("cc");
		List<String> l2 = new ArrayList<>();
		l2.add("aa");
		l2.add("ee");
		l2.add("ff");
		System.out.println(l1.contains(l2));//l1中是否包含l2中的所有元素
		l1.retainAll(l2); //保留两个list中相同的元素
		System.out.println(l1);
		l1.addAll(l2);
		System.out.println(l1);
		l1.removeAll(l2);//l1 中删除和l2中相同的元素
		System.out.println(l1);

		
	}
	
	public static void main(String[] args) {

		TestList t1 = new TestList();
		t1.test02();
	}
	
}
