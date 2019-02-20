package com.collection;


/**
 * �Զ���ʵ��ArrayList�����һ�µײ�ԭ��
 * @author admin
 *
 */
public class ArrayList01 <E>{
	private Object[] elementDate;
	private int size = 0;
	
	private final static int DEFAULT_CAPACITY = 10;//Ĭ������Ϊ10
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

