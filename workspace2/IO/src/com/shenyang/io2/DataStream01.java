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
			//��ͬ��������д��baos
			dos.writeInt(123); 
			dos.writeUTF("wmi");
			dos.writeChar('a');
			dos.writeBoolean(true);
			dos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

		//��ȡ
		
		try(DataInputStream dis = new DataInputStream(
				new BufferedInputStream(
						new FileInputStream("dataStream.txt")));) {
			//ֱ�Ӷ�ȡ���ݣ���ȡ��˳��Ҫ��д���˳��һ�£���������ȷ��ȡ����
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