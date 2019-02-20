package com.collection;
/**
 * ��дHashMap
 * ����������ԣ�hash����
 * HashMap���췽��,�в��޲�
 * 
 * @author Administrator
 *
 * @param <K>
 * @param <V>
 */
public class MyHashMap01<K,V> {
	private int size;
	Node<K, V>[] table;
	static final int DEFAULT_CAPACITY = 1<<4;//Ĭ����������
	static final float DEFAULT_LOAD_FACTOR = 0.75f; //Ĭ�ϸ���ϵ��
	
	
	public MyHashMap01() {
		super();
		table = new Node[DEFAULT_CAPACITY];
	}
	
	public MyHashMap01(int capacity) {
		super();
		if((Math.log(capacity)/Math.log(2))%1==0){
			table = new Node[(int)(Math.log(capacity)/Math.log(2))];
		}else{
			table = new Node[(int)(Math.log(capacity)/Math.log(2))+1];
		}
	}
	
	public static void main(String[] args) {
		
	}
	static class Node<K,V>{
		int hash;
		K key;
		V value;
		Node<K, V> next;
		public Node(int hash, K key, V value, Node<K, V> next) {
			super();
			this.hash = hash;
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}
	public int MyHash(K key){
		return key.hashCode()*(table.length-1);
	}
}
