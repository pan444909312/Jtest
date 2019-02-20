package com.shenyang.io;

import java.io.File;
import java.io.IOException;
/**
 * length 返回文件的长度，不存在返回0，如果路径是文件夹，返回值不确定
 * createNewFile,系统关键字无法创建 如 con
 * 
 * @author Administrator
 *
 */
public class FileTest03 {
	public static void main(String[] args) throws IOException {
		File src = new File("D:/JavaProject/workspace2/IO/iotest.txt");
		File src2 = new File("D:/JavaProject/workspace2/IO.rw");
		File src3 = new File("con");
		src3.createNewFile();//con为系统保留关键字，随意创建文件失败
		
		System.out.println(src.length());
		System.out.println(src2.length());
		

	}
}
