package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TestMap<K,V> {

	public static void main(String[] args) {
		Map<Integer, String> m1 = new HashMap<Integer, String>(10);
//		for(int i=0;i<20;i++){
//			m1.put(i, "µÚ"+i );
//		}
		m1.put(1, "12");
		m1.put(16, "12");
//		m1.put(16, "12");
//		m1.put(49, "12");
//		m1.put(16, "12");
//		m1.put(15, "12");
//		m1.put(32, "12");

		
		
		Set<Entry<Integer, String>> s1 = m1.entrySet();
		Iterator<Entry<Integer, String>> iter = s1.iterator();
		while(iter.hasNext()){
			Entry<Integer, String> e = iter.next();
			System.out.println(e.getKey()+"---"+e.getValue());
		}
	}


}

