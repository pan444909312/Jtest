package com.collection;

public class Alist<E> {
	private int size;
	private Object elementDate[];
	private final static int DEFAULT_CAPACITY = 10;

	public Alist() {
		elementDate = new Object[DEFAULT_CAPACITY];
	}

	public Alist(int capacity) {
		if (capacity == 0) {
			elementDate = null;
		} else if (capacity > 0) {
			elementDate = new Object[capacity];
		} else {
			throw new RuntimeException("Illegal capacity:" + capacity);
		}

	}

	public void add(E element) {
		if (size + 1 > elementDate.length) {
			capacityGrow();
		}
		elementDate[size++] = element;
	}

	public void add(int index, E element) {
		rangeCheckForAdd(index);
		if (size + 1 > elementDate.length) {
			capacityGrow();
		}
		System.arraycopy(elementDate, index, elementDate, index+1, size-index);
		elementDate[index] = element;
		size++;
	}
	public void set(int index,E element){
		rangeCheck(index);
		elementDate[index] = element;
		
	}
	public E get(int index){
		rangeCheck(index);
		return (E) elementDate[index];
	}
	
	
	public void rangeCheck(int index) {
		if (index < 0 || index > size - 1) {
			throw new RuntimeException("Illegal index" + index);
		}
	}

	public void rangeCheckForAdd(int index) {
		if (index < 0 || index > size) {
			throw new RuntimeException("Illegal index" + index);
		}
	}
	/**
	 * ÈÝÁ¿À©ÈÝ
	 */
	public void capacityGrow() {
		Object[] newArray = new Object[elementDate.length + (elementDate.length >> 1)];
		System.arraycopy(elementDate, 0, newArray, 0, elementDate.length);
		elementDate = newArray;

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size; i++) {
			sb.append(elementDate[i] + ",");
		}
		sb.setCharAt(sb.length() - 1, ']');
		return sb.toString();
	}

	public static void main(String[] args) {
		Alist<String> a1 = new Alist<String>(5);
		a1.add("aa");
		a1.add("bb");
		a1.add("cc");
		a1.add("bb");
		a1.add("cc");
		a1.add("cc");
		System.out.println(a1);
		a1.add(6, "ss");
		System.out.println(a1);
		a1.set(0, "z");
		System.out.println(a1.get(0));
		System.out.println(a1);
	}
}
