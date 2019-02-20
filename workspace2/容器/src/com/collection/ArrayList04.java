package com.collection;

import javax.lang.model.element.Element;

/**
 * 自定义实现ArrayList，体会一下底层原理
 * 增加add方法（重载了一个新的）
 * 增加set，get方法，
 * 增加容器范围检查方法
 * 增加remove方法
 * @author admin
 *
 */
public class ArrayList04 <E>{
	private Object[] elementDate;
	private int size = 0;
	
	private final static int DEFAULT_CAPACITY = 10;//默认容量为10
	public ArrayList04() {
		
		elementDate = new Object[DEFAULT_CAPACITY];
	}
	public ArrayList04(int capacity) {
		
		elementDate = new Object[capacity];
		
	}
	/**
	 * 为容器增加元素，增加到最后面，如果超过容器的容量，则自动扩容
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
	 * 在索引为index的位置增加element元素
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
	 * 移除索引为index的元素
	 * @param index
	 */
	public void remove(int index){
		rangeCheck(index);
		System.arraycopy(elementDate, index+1, elementDate, index, size-index-1);
		elementDate[--size] = null;
	}
	/**
	 * 移除所有值为element的元素
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
			throw new RuntimeException("索引超出容器的范围了");
		}
	}
	public void rangeCheckForAdd(int index){
		if(index<0||index>size){
			throw new RuntimeException("索引超出容器的范围了");
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
