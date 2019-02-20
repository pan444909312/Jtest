package com.shenyang.io;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
	public static void main(String[] args) throws IOException {
		File src = new File("D:/JavaProject/workspace2/IO/iotest.txt");
		File src2 = new File("D:/JavaProject/workspace2");
		File src3 = new File("IO");
		src.createNewFile();
		System.out.println(src2.exists());
		System.out.println(src2.isFile());
		System.out.println(src2.isDirectory());
		
		System.out.println(src2.getName());
		System.out.println(src2.getAbsolutePath());
		System.out.println(src2.getPath());
		
		UtilIO.fileStatus(src);
		UtilIO.fileStatus(src2);
		UtilIO.fileStatus(src3);

	}
}
