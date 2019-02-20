package com.nine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class BookList {
	public static void listStore(){
		List<Book> l1 = new ArrayList<>();
		l1.add(new Book(1001, "三国演义", 100d, "沈阳出版社"));
		l1.add(new Book(1002, "红楼梦", 150d, "北京出版社"));
		l1.add(new Book(1003, "水浒传", 103d, "浙江出版社"));
		for(Book b:l1){
			System.out.println(b);
		}
//		for(int i=0;i<l1.size();i++){
//			System.out.println(l1.get(i));
//		}
	}
	public static void mapStore(){
		Book b1 = new Book(1001, "三国演义", 100d, "沈阳出版社");
		Book b2 = new Book(1002, "红楼梦", 150d, "北京出版社");
		Book b3 = new Book(1003, "水浒传", 103d, "浙江出版社");
		Map<Integer, Book> m1 = new HashMap<>();
		m1.put(b1.getId(), b1);
		m1.put(b2.getId(), b2);
		m1.put(b3.getId(), b3);
//		for(Entry<Integer, Book> e:m1.entrySet()){
//			System.out.println(e.getKey()+"---"+e.getValue());
//		}
		Set<Entry<Integer, Book>> s1 = m1.entrySet();
		Iterator<Entry<Integer, Book>> iter = s1.iterator();
		while(iter.hasNext()){
			Entry<Integer, Book> e2 = iter.next();
			System.out.println(e2.getKey()+"---"+e2.getValue());
		}
		
	}
	public static void main(String[] args) {
//		listStore();
		mapStore();
	}

}

class Book {
	private Integer id;
	private String name;
	private double price;
	private String publisher;
	
	@Override
	public String toString() {
		return id+"\t"+name+"\t"+price+"\t"+publisher;
	}
	public Book() {
		super();
	}

	public Book(Integer id, String name, double price, String publisher) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.publisher = publisher;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
}
