package com.collection;

import javax.lang.model.element.Element;

/**
 * �Զ���ʵ��ArrayList�����һ�µײ�ԭ��
 * ����add������������һ���µģ�
 * ����set��get������
 * ����������Χ��鷽��
 * ����remove����
 * @author admin
 *
 */
public class ArrayList04 <E>{
	private Object[] elementDate;
	private int size = 0;
	
	private final static int DEFAULT_CAPACITY = 10;//Ĭ������Ϊ10
	public ArrayList04() {
		
		elementDate = new Object[DEFAULT_CAPACITY];
	}
	public ArrayList04(int capacity) {
		
		elementDate = new Object[capacity];
		
	}
	/**
	 * Ϊ��������Ԫ�أ����ӵ�����棬����������������������Զ�����
	 * @param element
	 */
	public void add(E element) {
		if(size == elementDate.length) {
			Object[] newArray = new Object[elementDate.length+(elementDate.length>>1)];
			System.arraycopy(elementDate, 0, newArray, 0, elementDate.length);
			elementDate = newArray;
		}
		elementDate[size++] = element;
	}
	/**
	 * ������Ϊindex��λ������elementԪ��
	 * @param index
	 * @param element
	 */
	public void add(int index,E element){
		rangeCheckForAdd(index);
		if(size == elementDate.length) {
			Object[] newArray = new Object[elementDate.length+(elementDate.length>>1)];
			System.arraycopy(elementDate, 0, newArray, 0, elementDate.length);
			elementDate = newArray;
			}
		System.arraycopy(elementDate, index, elementDate, index+1, size-index);
		elementDate[index] = element;
		size++;
		
	}
	/**
	 * �Ƴ�����Ϊindex��Ԫ��
	 * @param index
	 */
	public void remove(int index){
		rangeCheck(index);
		System.arraycopy(elementDate, index+1, elementDate, index, size-index-1);
		elementDate[--size] = null;
	}
	/**
	 * �Ƴ�����ֵΪelement��Ԫ��
	 * @param element
	 */
	public void remove(E element){
		for(int i=0;i<size;i++){
			if(element.equals(elementDate[i])){
				remove(i);
			}
		}
	}
	@SuppressWarnings("unchecked")
	public E get(int index){
		rangeCheck(index);
		return (E) elementDate[index];
	}
	public void set(int index,E element){
		rangeCheck(index);
		elementDate[index] = element;
	}
	public void rangeCheck(int index){
		if(index<0||index>size-1){
			throw new RuntimeException("�������������ķ�Χ��");
		}
	}
	public void rangeCheckForAdd(int index){
		if(index<0||index>size){
			throw new RuntimeException("�������������ķ�Χ��");
		}
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
		ArrayList04<String> a1 = new ArrayList04<>(20);
		
		for(int i=0;i<10;i++) {
//			a1.add(""+i);
			a1.add(String.valueOf(i)); 
		}
		System.out.println(a1.size);
		System.out.println(a1);
		a1.set(9, "123");
		System.out.println(a1.get(9));
		a1.add(0, "s");
		System.out.println(a1);
		a1.remove(1);
		a1.set(0, "4");
		System.out.println(a1);
		a1.remove("4");
		System.out.println(a1);
	}
	
}
