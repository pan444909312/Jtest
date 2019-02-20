package com.collection;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		Set<Employee> s1 = new TreeSet<>();
		s1.add(new Employee(66331, "qq", 11));
		s1.add(new Employee(22331, "zz", 33));
		s1.add(new Employee(5531, "xx", 22));

		System.out.println(s1);
	}

}
