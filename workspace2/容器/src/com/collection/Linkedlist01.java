package com.collection;

import java.util.Collection;
import java.util.LinkedList;

/**
 * 手写Linkedlist 体会底层原理
 * 定义Node内容类，包含每个节点对象的属性
 * add方法，重写tostring
 * @author admin
 *
 * @param <E>
 */
public class Linkedlist01<E> {
	Node<E> first;
	Node<E> last;
	private int size;
	
	public void add(E element) {
		Node<E> temp = last;
		Node<E> newNode = new Node<E>(temp, element, null);
		last = newNode;
		if(first==null) {
			first = newNode;
		}else {
			temp.next = newNode;
		}
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		Node<E> temp = first;
		while(temp!=null) {
			sb.append(temp.element+",");
			temp = temp.next;
		}
		sb.setCharAt(sb.length()-1, ']');
		return sb.toString();
	}


	public static void main(String[] args) {
		Linkedlist01<String> l1 = new Linkedlist01<>();
		l1.add("a");
		l1.add("b");
		l1.add("cc");
		l1.add("a");
		l1.add("sadas");
		l1.add("cqwqc");
		System.out.println(l1);

	}
	private static class Node<E>{
		E element;
		Node<E> next;
		Node<E> previous;
		public Node(Node<E> previous,E element, Node<E> next) {
			super();
			this.element = element;
			this.next = next;
			this.previous = previous;
		}
		
	}
}
