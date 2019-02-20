package com.collection;

import java.util.Collection;
import java.util.LinkedList;

import javax.lang.model.element.Element;

/**
 * ��дLinkedlist ���ײ�ԭ��
 * ����Node�����࣬����ÿ���ڵ���������
 * add��������дtostring
 * ����add����
 * ����set��get����
 * ����rangeCheck����,����rangeCheck����
 * ����getNode����
 * @author admin
 *
 * @param <E>
 */
public class Linkedlist03<E> {
	Node<E> first;
	Node<E> last;
	private int size;
	/**
	 * �������������һ��elementԪ��
	 * @param element
	 */
	public void add(E element) {
		Node<E> temp = last;
		Node<E> newNode = new Node<E>(temp, element, null);
		last = newNode;
		if(first==null) {
			first = newNode;
		}else {
			temp.next = newNode;
		}
		size++;
	}
	/**
	 * ��index������λ������һ��elementԪ��
	 * @param index
	 * @param element
	 */
	public void add(int index,E element) {
		rangeCheckForAdd(index);
		Node<E> node = getNode(index);
		if(index == 0) {
			Node<E> newNode = new Node<E>(null, element, first);
			first.previous = newNode;
			first = newNode;
		}else if(index == size) {
			Node<E> newNode = new Node<E>(last, element, null);
			last.next = newNode;
			last = newNode;
		}else {
			Node<E> newNode = new Node<E>(node.previous, element, node);
			node.previous.next = newNode;
			node.previous = newNode;
		}
	}
	/**
	 * ����index������node���� ��������ΪNode<E>����
	 * @param index
	 * @return
	 */
	public Node<E> getNode(int index) {
		Node<E> node ;
		if(index>size>>1) {
			node = last;
			for(int i=size-1;i>index;i--) {
				node = node.previous;
			}
		}else {
			node = first;
			for(int i=0;i<index;i++) {
				node = node.next;
			}
		}
		return node;
	}
	public E get(int index) {
		rangeCheck(index);
		Node<E> node = getNode(index);
		return node.element;
	}
	public void set(int index,E element) {
		rangeCheck(index);
		Node<E> node = getNode(index);
		node.element = element;
	}
	public void rangeCheck(int index) {
		if(index<0||index>size-1) {
			throw new RuntimeException("��ΧԽ��");
		}
	}
	public void rangeCheckForAdd(int index) {
		if(index<0||index>size) {
			throw new RuntimeException("��ΧԽ��");
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
		Linkedlist03<String> l1 = new Linkedlist03<>();
		l1.add("a");
		l1.add("b");
		l1.add("cc");
		l1.add("a");
		l1.add("sadas");
		l1.add("cqwqc");
		System.out.println(l1);
		l1.set(5, "�Ұ�Ө��");
		System.out.println(l1.get(5));
		System.out.println(l1);
		System.out.println("#########################################");
		System.out.println(l1.size);
		l1.add(5, "02");
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
