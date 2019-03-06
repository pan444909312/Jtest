package com.ten.IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.rmi.server.ObjID;

public class Transform {
	public static void main(String[] args) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		byte[] datas = null;
		try(ObjectOutputStream oos = new ObjectOutputStream(baos);) {
			oos.writeInt(23);
			oos.writeLong(123);
			oos.writeUTF("阿斯顿123");
			oos.writeDouble(213.123);
			oos.writeObject(new employee("张三", 1000));
			oos.flush();
			datas = baos.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try(ByteArrayInputStream bais = new ByteArrayInputStream(datas); 
				ObjectInputStream ois = new ObjectInputStream(bais)) {
			int data1 = ois.readInt();
			long data2 = ois.readLong();
			String data3 = ois.readUTF();
			double data4 = ois.readDouble();
			Object data5 = ois.readObject();
			System.out.println(data1);
			System.out.println(data2);
			System.out.println(data3);
			System.out.println(data4);
			if(data5 instanceof employee){
				employee e = (employee)data5;
				System.out.println(e);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		
	}
}
class employee implements Serializable{
	private String name;
	private double salary;
	
	@Override
	public String toString() {
		return "姓名："+name+"-->"+"薪水："+salary;
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
	public employee(){
		
	}
	public employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
}
