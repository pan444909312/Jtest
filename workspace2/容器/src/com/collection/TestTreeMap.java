package com.collection;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap<K,V> {
	public static void main(String[] args) {
		Map<Employee, String> m1 = new MyTreeMap<>();
		m1.put(new Employee(1000,"小徐",001), "aa");
		m1.put(new Employee(20000,"小张",007), "bb");
		m1.put(new Employee(3000,"小胡",003), "cc");

		System.out.println(m1);
	}
	
}
class MyTreeMap<K,V> extends TreeMap<K,V>{
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		
		for (Map.Entry<K,V> entry : entrySet())
		{	
			sb.append("key:"+entry.getKey()+",value:"+entry.getValue()+"\n");
		}
		return sb.toString();
	}
}

