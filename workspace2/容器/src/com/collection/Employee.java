package com.collection;

public class Employee implements Comparable<Employee> {
	int salary;
	String name;
	int id;
	
	@Override
	public String toString() {
		
		return "[id="+id+",name="+name+",salary="+salary+"]";
	}
	public Employee(int salary, String name, int id) {
		super();
		this.salary = salary;
		this.name = name;
		this.id = id;
	}
	@Override
	public int compareTo(Employee o) {
		if(this.salary<o.salary){
			return -1;
		}else if (this.salary>o.salary){
			return 1;
		}else
		return 0;
	}
}
