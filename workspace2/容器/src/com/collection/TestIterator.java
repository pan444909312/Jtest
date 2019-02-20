package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestIterator {
	public static void main(String[] args) {
//		testIteratorList();
//		testIteratorMap01();
		testIteratorMap02();
	}
	
	public static void testIteratorList(){
		List<Employee>  l1 = new ArrayList<>();
		l1.add(new Employee(11, "asd", 213));
		l1.add(new Employee(11231, "bb", 13));
		l1.add(new Employee(141, "ccd", 2213));
		l1.add(new Employee(4511, "ddd", 513));

		Iterator<Employee> iter = l1.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
	public static void testIteratorMap01(){
		Map<Employee, String> m1 = new HashMap<>();
		m1.put(new Employee(1000, "one", 1), "i'm one");
		m1.put(new Employee(100, "two", 2), "i'm two");
		m1.put(new Employee(10000, "three", 3), "i'm three");
		System.out.println(m1);
		Set<Entry<Employee, String>> s1 = m1.entrySet();
		for(Entry<Employee, String> e:m1.entrySet()/*s1*/){
			System.out.println("ForEach"+e.getKey()+"----"+e.getValue());
		}

		
		Iterator<Entry<Employee, String>> iter = s1.iterator();
		while(iter.hasNext()){
			Entry<Employee, String> entry = iter.next();
			System.out.println(entry.getKey()+"---"+entry.getValue());
		}
		
	}
	public static void testIteratorMap02(){
		Map<Employee, String> m1 = new HashMap<>();
		m1.put(new Employee(1000, "one", 1), "i'm one");
		m1.put(new Employee(100, "two", 2), "i'm two");
		m1.put(new Employee(10000, "three", 3), "i'm three");
		Set<Employee> s1 = m1.keySet();
		for(Employee e:s1){
			System.out.println("ForEach"+e+"----"+m1.get(e));
		}
		
		Iterator<Employee> iter = s1.iterator();
		while(iter.hasNext()){
			Employee e1 = iter.next();
			System.out.println(e1+"----"+m1.get(e1));
		}
	}
}
