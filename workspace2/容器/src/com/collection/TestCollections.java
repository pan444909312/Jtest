package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestCollections {
	public static void sortByScore(Map<Integer, Student> map ){
		Comparator<Entry<Integer, Student>> scoreComp = new Comparator<Map.Entry<Integer,Student>>() {

			@Override
			public int compare(Entry<Integer, Student> o1, Entry<Integer, Student> o2) {
				return o1.getValue().getScore()-o2.getValue().getScore();
			}
			
		};
		List<Entry<Integer, Student>> l1 = new ArrayList<>();
		l1.addAll(map.entrySet());
		Collections.sort(l1, scoreComp);	
		System.out.println("传入Map集合，输出对根据sroce的排序：");
		for(Entry<Integer, Student> e:l1){
			System.out.println(e.getKey()+"---"+e.getValue());
		}
		
	}
	public static void main(String[] args) {
		Student s1 = new Student(1001,"小小一",98);
		Student s2 = new Student(1003,"小小二",97);
		Student s3 = new Student(1002,"小小三",96);
		
		Map<Integer, Student> m1 = new HashMap<>();
		m1.put(s1.getId(), s1);
		m1.put(s2.getId(), s2);
		m1.put(s3.getId(), s3);
		sortByScore(m1);
		System.out.println("#########################");
		//遍历m1
		System.out.println("遍历Map：");
		for(Entry<Integer, Student> entry:m1.entrySet()){
			System.out.println(entry.getKey()+"---"+entry.getValue());
		}
		
		List<Student> l1 = new ArrayList<>(m1.values());
		Collections.sort(l1, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {

				return o1.getScore()-o2.getScore();
			}
		}); 
		System.out.println(l1);
		
	}
}
