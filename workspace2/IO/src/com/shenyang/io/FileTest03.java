package com.shenyang.io;

import java.io.File;
import java.io.IOException;
/**
 * length �����ļ��ĳ��ȣ������ڷ���0�����·�����ļ��У�����ֵ��ȷ��
 * createNewFile,ϵͳ�ؼ����޷����� �� con
 * 
 * @author Administrator
 *
 */
public class FileTest03 {
	public static void main(String[] args) throws IOException {
		File src = new File("D:/JavaProject/workspace2/IO/iotest.txt");
		File src2 = new File("D:/JavaProject/workspace2/IO.rw");
		File src3 = new File("con");
		src3.createNewFile();//conΪϵͳ�����ؼ��֣����ⴴ���ļ�ʧ��
		
		System.out.println(src.length());
		System.out.println(src2.length());
		

	}
}
