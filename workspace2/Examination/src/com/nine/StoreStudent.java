package com.nine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class StoreStudent {
	public void listToMap(List<Student> l) {
		Map<Integer, Student> m1 = new HashMap<>();
		for (int i = 0; i < l.size(); i++) {
			m1.put(new Integer(l.get(i).getId()), l.get(i));
		}
		for (Entry<Integer, Student> e : m1.entrySet()) {
			System.out.println(e.getKey() + "---" + e.getValue());
		}
	}

	public void mapToList(Map m) {
		List<StudentEntry02> l1 = new ArrayList<>();
		StudentEntry02<Integer,Student> en = new StudentEntry02(m);
		l1.add(en);
		Iterator<StudentEntry02> iter = l1.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
	}

	public static void main(String[] args) {
		Student s1 = new Student(1001, "小一", 14, "男");
		Student s2 = new Student(1002, "小三", 44, "男");
		Student s3 = new Student(1003, "小二", 34, "女");
		StoreStudent store1 = new StoreStudent();
		
		//Map保存
		Map<Integer, Student> m1 = new HashMap<>();
		m1.put(new Integer(s1.getId()), s1);
		m1.put(new Integer(s2.getId()), s2);
		m1.put(new Integer(s3.getId()), s3);
		
		
		
		store1.mapToList(m1);


		//list保存
		List<Student> l1 = new ArrayList<>();
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
//		Collections.sort(l1, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				
//				return o1.getAge()-o2.getAge();
//			}
//		});

		System.out.println(l1);
		store1.listToMap(l1);
		
	}
}

class StudentEntry<K,V> {

	Set<Entry<K, V>> sEntry;
	List<Entry<K, V>> l1;

	public  StudentEntry(Map<K,V> m) {
		sEntry = m.entrySet();
		l1 = new ArrayList<>(sEntry);
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Iterator<Entry<K, V>> iter = l1.iterator();
		while(iter.hasNext()){
			sb.append(iter.next());
		}

		return sb.toString();
	}

	
}