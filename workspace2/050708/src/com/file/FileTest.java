package com.file;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.dir"));
		
		//相对路径：默认放到user.dir目录下面,即project的路径下
		File f1 = new File("是.txt");
		f1.createNewFile();
		//绝对路径
		File f2 = new File("d:/JavaProject/workspace2/b.rar");
		f2.createNewFile();
		File f3 = new File("d:/JavaProject/workspace3/b.rar");
		System.out.println(f3.exists());
		System.out.println(f3.isDirectory());
		System.out.println(f3.isFile());
		//没有路径或者没有文件，delete不会报错
		f3.delete();
		//不存在路径，creatNewFile会报错
//		f3.createNewFile();
		File f4 = new File("d:/JavaProject/a1/asds");
		f4.mkdir();	//没有目录不会创建
		f4.mkdirs();//没有目录会创建
	}
}
