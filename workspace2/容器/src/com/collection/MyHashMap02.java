package com.collection;

/**
 * ��дHashMap 
 * ����������ԣ�hash����
 * HashMap���췽��,�в��޲�
 * ����put���� ��дtoString
 * ����grow����
 * 
 * @author Administrator
 *
 * @param <K>
 * @param <V>
 */
public class MyHashMap02<K, V> {
	private int size;
	Node<K, V>[] table;
	static final int DEFAULT_CAPACITY = 1 << 4;// Ĭ����������
	static final float DEFAULT_LOAD_FACTOR = 0.75f; // Ĭ�ϸ���ϵ��

	public MyHashMap02() {
		super();
		table = new Node[DEFAULT_CAPACITY];
	}
	/**
	 * ����һ���Զ�����������Զ�����ת��Ϊ2��������
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
	 * ����һ��key,value��ֵ��
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
	 * �жϵ�size������ֵ��ʱ������������ݣ������¼���hashֵ�������У�
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
						// Ԫ������
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
						// ɾ�������ŵ�Ԫ��ԭ������λ��

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
	 * main����
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
		m1.put(1, "�ظ�");
		m1.put(13, "zz");
		m1.put(42, "ff");
		m1.put(12, "�ظ�");
		m1.put(132, "zz");
		m1.put(112, "�ظ�");
		m1.put(113, "zz");
		m1.put(114, "ff");
		m1.put(115, "�ظ�");
		m1.put(116, "zz");
		System.out.print(m1);
		System.out.println(m1.size);

	}
/**
 * ����ÿ���ڵ������
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
	 * ����key����hashֵ��key��hashcode & ��������-1
	 * @param key
	 * @return
	 */
	public int MyHash(K key) {
		// System.out.println(key.hashCode()&(table.length-1));
		return key.hashCode() & (table.length - 1);
	}
}
