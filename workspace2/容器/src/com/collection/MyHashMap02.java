package com.collection;

/**
 * 手写HashMap 
 * 定义基本属性，hash方法
 * HashMap构造方法,有参无参
 * 增加put方法 重写toString
 * 增加grow方法
 * 
 * @author Administrator
 *
 * @param <K>
 * @param <V>
 */
public class MyHashMap02<K, V> {
	private int size;
	Node<K, V>[] table;
	static final int DEFAULT_CAPACITY = 1 << 4;// 默认数组容量
	static final float DEFAULT_LOAD_FACTOR = 0.75f; // 默认负载系数

	public MyHashMap02() {
		super();
		table = new Node[DEFAULT_CAPACITY];
	}
	/**
	 * 输入一个自定义的容量，自动向上转化为2的整数幂
	 * @param capacity
	 */
	public MyHashMap02(int capacity) {
		super();
		if (capacity < 0) {
			throw new RuntimeException("Illegal capacity:" + capacity);
		}
		if ((Math.log(capacity) / Math.log(2)) % 1 == 0) {
			table = new Node[(int) (Math.log(capacity) / Math.log(2))];
		} else {
			table = new Node[(int) (Math.log(capacity) / Math.log(2)) + 1];
		}
	}

	/**
	 * 增加一个key,value键值对
	 * 
	 * @param key
	 * @param value
	 */
	public void put(K key, V value) {
		Node<K, V> newNode = new Node<>(0, key, value, null);
		newNode.hash = MyHash(key);
		boolean ifRepeat = false;
		Node<K, V> temp = table[newNode.hash];
		Node<K, V> last = null;
		if (table[newNode.hash] == null) {
			table[newNode.hash] = newNode;
			size++;
		} else {
			while (temp != null) {
				if (temp.key.equals(key)) {
					temp.value = value;
					ifRepeat = true;
					break;
				}
				last = temp;
				temp = temp.next;

			}
			if (!ifRepeat) {
				last.next = newNode;
				size++;
			}
		}
		grow();
	}

	/**
	 * 判断当size大于阈值的时候进行数组扩容（并重新计算hash值进行排列）
	 */
	public void grow() {
		if (size > DEFAULT_LOAD_FACTOR * table.length) {
			Node<K, V>[] newTable = new Node[table.length << 1];
			System.arraycopy(table, 0, newTable, 0, table.length);
			table = newTable;

			for (int i = 0; i < (table.length >> 1); i++) {
				Node<K, V> temp = table[i];
				Node<K, V> temp2 = null;
				Node<K, V> temp3 = null;
				Node<K, V> temp4 = null;
				boolean ifDelete = false;
				boolean ifFirst = true;
				while (temp != null) {
					int newHash = MyHash(temp.key);
					if (i != newHash) {
						// 元素重排
						temp2 = table[newHash];
						if (temp2 == null) {
							table[newHash] = new Node<>(newHash, temp.key, temp.value, null);

						} else {

							while (temp2 != null) {
								temp3 = temp2;
								temp2 = temp2.next;
							}
							temp3.next = temp;

						}
						// 删除被重排的元素原来所在位置

						if (ifFirst) {
							table[i] = temp.next;
						} else {

							temp4.next = temp.next;
							ifDelete = true;
						}

					}
					if (!ifDelete) {
						temp4 = temp;
					}
					ifDelete = false;
					temp = temp.next;
					ifFirst = false;
				}
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < table.length; i++) {
			if (table[i] != null) {
				sb.append("hash:" + i + " [");
				while (table[i] != null) {
					sb.append("key:" + table[i].key + " value:" + table[i].value + "->");
					table[i] = table[i].next;
				}
				sb.deleteCharAt(sb.length() - 1);
				sb.setCharAt(sb.length() - 1, ']');
				sb.append("\n");
			}
		}
		return sb.toString();
	}

	/**
	 * main方法
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		MyHashMap02<Integer, String> m1 = new MyHashMap02<>(4);
		MyHashMap02<Integer, String> m2 = new MyHashMap02<>(4);

		m1.put(1, "aa");
		m1.put(5, "bb");
		m1.put(9, "cc");
		m1.put(13, "dd");
		m1.put(4, "ff");
		m1.put(1, "重复");
		m1.put(13, "zz");
		m1.put(42, "ff");
		m1.put(12, "重复");
		m1.put(132, "zz");
		m1.put(112, "重复");
		m1.put(113, "zz");
		m1.put(114, "ff");
		m1.put(115, "重复");
		m1.put(116, "zz");
		System.out.print(m1);
		System.out.println(m1.size);

	}
/**
 * 数组每个节点的属性
 * @author Administrator
 *
 * @param <K>
 * @param <V>
 */
	static class Node<K, V> {
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
	/**
	 * 传入key计算hash值，key的hashcode & 数组容量-1
	 * @param key
	 * @return
	 */
	public int MyHash(K key) {
		// System.out.println(key.hashCode()&(table.length-1));
		return key.hashCode() & (table.length - 1);
	}
}
