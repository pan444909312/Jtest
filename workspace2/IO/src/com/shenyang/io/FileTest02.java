package com.shenyang.io;

import java.io.File;
import java.io.IOException;
/**
 * createNewFile、delete，成功返回true，失败返回false
 * 
 * @author Administrator
 *
 */
public class FileTest02 {
	public static void main(String[] args) throws IOException {
		File src = new File("D:/JavaProject/workspace2/IO/iotest.txt");
		File src2 = new File("D:/JavaProject/workspace2");
		File src3 = new File("ssaa");
		boolean flag = src.createNewFile();
//		boolean flag2 = src3.createNewFile();
		System.out.println(flag);
		System.out.println(src3.delete());
	}
}
