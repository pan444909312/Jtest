package com.shenyang.io;

import java.io.File;

public class DirTest01 {

	public static long getDirLenth(File src) {
		if (null == src || !src.exists()) {
			throw new RuntimeException("文件不存在");
		}
		long lenth = 0;  //不建议在这定义，递归会定义多个变量，性能不好
		for (File f : src.listFiles()) {
			if (f.isDirectory()) {
				lenth+= getDirLenth(f);
			} else {
				lenth+= f.length();
			}
		}
		return lenth;
	}

	public static void main(String[] args) {
		File src = new File("D:/JavaProject/workspace2/IO");
		File src2 = new File("D:/JavaProject/workspace2/IO/iotest.txt");
		UtilIO.printSubCatalog(src);
		System.out.println(src2.length());
		System.out.println(getDirLenth(src));
	}
}
