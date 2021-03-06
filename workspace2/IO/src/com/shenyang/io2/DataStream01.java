package com.shenyang.io2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream01 {
	public static void main(String[] args) {
		
		try(DataOutputStream dos = new DataOutputStream(
				new BufferedOutputStream(
						new FileOutputStream("dataStream.txt")));)	 
		{
			//不同数据类型写入baos
			dos.writeInt(123); 
			dos.writeUTF("wmi");
			dos.writeChar('a');
			dos.writeBoolean(true);
			dos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

		//读取
		
		try(DataInputStream dis = new DataInputStream(
				new BufferedInputStream(
						new FileInputStream("dataStream.txt")));) {
			//直接读取数据：读取的顺序要与写入的顺序一致，否则不能正确读取数据
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
