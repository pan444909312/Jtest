package com.shenyang.io2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectStream {
	public static void main(String[] args) {
		try(ObjectOutputStream oos = new ObjectOutputStream(
				new BufferedOutputStream(
						new FileOutputStream("Obj.txt")));) {
			oos.writeInt(123);
			oos.writeUTF("xix");
			oos.writeObject("zdwqqxc");
			oos.writeObject(new Employee("����", 1231));
			oos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream("Obj.txt")));) {
			int o1 = ois.readInt();
			Object o2 = ois.readUTF();
			Object o3 = ois.readObject();
			Object o4 = ois.readObject();
			if(o2 instanceof String){
				String obj = (String)o2;
				System.out.println(obj);
			}
			if(o3 instanceof String){
				String obj = (String)o3;
				System.out.println(obj);
			}
			if(o4 instanceof Employee){
				Employee obj = (Employee)o4;
				System.out.println(obj);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		

	}
}
class Employee implements java.io.Serializable{
	private String name;
	private double salary;
	public Employee() {
	}
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "������"+"name"+"\t"+"нˮ:"+salary;
	}
	
}