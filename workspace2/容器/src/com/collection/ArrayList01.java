package com.collection;


/**
 * 自定义实现ArrayList，体会一下底层原理
 * @author admin
 *
 */
public class ArrayList01 <E>{
	private Object[] elementDate;
	private int size = 0;
	
	private final static int DEFAULT_CAPACITY = 10;//默认容量为10
	public ArrayList01() {
		
		elementDate = new Object[DEFAULT_CAPACITY];
	}
	public ArrayList01(int capacity) {
		
		elementDate = new Object[capacity];
		
	}
	public void add(Object obj) {
		elementDate[size++] = obj;
	}
	@Override
	public String toString() {
		StringBuilder s1 = new StringBuilder();
		s1.append('[');
		for(int i=0;i<size;i++) {
			s1.append(elementDate[i]+",");
		}
		s1.setCharAt(s1.length()-1, ']');
		return s1.toString();
	}
	public static void main(String[] args) {
		ArrayList01<String> a1 = new ArrayList01<>();
		
		a1.add("aa");
		a1.add("bb");
		System.out.println(a1);
	}
	
}

