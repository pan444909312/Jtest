package com.shenyang.io2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class DataStream02 {
	public static void main(String[] args) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		byte[] datas = null;
		long t1 = System.nanoTime();
		try(DataOutputStream dos = new DataOutputStream(
				new BufferedOutputStream(baos));)	 
//		try(DataOutputStream dos = new DataOutputStream(baos))
		{
			//不同数据类型写入baos
			dos.writeInt(123); 
			dos.writeUTF("wmi");
			dos.writeChar('a');
			dos.writeBoolean(true);
			dos.flush();
			datas = baos.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		}
		long t2 = System.nanoTime();
		System.out.println(t2-t1);
		//读取
		
		try(DataInputStream dis = new DataInputStream(
				new BufferedInputStream(
						new ByteArrayInputStream(datas)) );) {
			//读取顺序和写入顺序 保持一致,否则无法正确读取
			int a = dis.readInt();
			String b = dis.readUTF();
			char c = dis.readChar();
			boolean d = dis.readBoolean();
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
