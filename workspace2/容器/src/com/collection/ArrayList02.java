package com.collection;

/**
 * 自定义实现ArrayList，体会一下底层原理
 * 增加add方法
 * @author admin
 *
 */
public class ArrayList02 <E>{
	private Object[] elementDate;
	private int size = 0;
	
	private final static int DEFAULT_CAPACITY = 10;//默认容量为10
	public ArrayList02() {
		
		elementDate = new Object[DEFAULT_CAPACITY];
	}
	public ArrayList02(int capacity) {
		
		elementDate = new Object[capacity];
		
	}
	public void add(E element) {
		if(size == elementDate.length) {
			Object[] newArray = new Object[elementDate.length+(elementDate.length>>1)];
			System.arraycopy(elementDate, 0, newArray, 0, elementDate.length);
			elementDate = newArray;
		}
		elementDate[size++] = element;
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
		ArrayList02<String> a1 = new ArrayList02<>(20);
		for(int i=0;i<30;i++) {
//			a1.add(""+i);
			a1.add(String.valueOf(i)); 
		}
		System.out.println(a1.size);
		System.out.println(a1);
	}
	
}

