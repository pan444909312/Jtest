package com.file;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.dir"));
		
		//���·����Ĭ�Ϸŵ�user.dirĿ¼����,��project��·����
		File f1 = new File("��.txt");
		f1.createNewFile();
		//����·��
		File f2 = new File("d:/JavaProject/workspace2/b.rar");
		f2.createNewFile();
		File f3 = new File("d:/JavaProject/workspace3/b.rar");
		System.out.println(f3.exists());
		System.out.println(f3.isDirectory());
		System.out.println(f3.isFile());
		//û��·������û���ļ���delete���ᱨ��
		f3.delete();
		//������·����creatNewFile�ᱨ��
//		f3.createNewFile();
		File f4 = new File("d:/JavaProject/a1/asds");
		f4.mkdir();	//û��Ŀ¼���ᴴ��
		f4.mkdirs();//û��Ŀ¼�ᴴ��
	}
}
