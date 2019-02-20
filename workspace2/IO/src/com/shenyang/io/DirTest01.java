package com.shenyang.io;

import java.io.File;

public class DirTest01 {

	public static long getDirLenth(File src) {
		if (null == src || !src.exists()) {
			throw new RuntimeException("�ļ�������");
		}
		long lenth = 0;  //���������ⶨ�壬�ݹ�ᶨ�������������ܲ���
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
