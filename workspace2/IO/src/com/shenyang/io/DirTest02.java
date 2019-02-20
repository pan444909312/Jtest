package com.shenyang.io;

import java.io.File;
 
/**
 * 使用面向对象统计文件夹大小和文件个数
 * @author Administrator
 *
 */
public class DirTest02 {
	private long len;
	private String path;
	private File src;
	private int count;
	public DirTest02(String path){
		this.path = path;
		this.src = new File(this.path);
		getDirLenth(this.src);
	}
	private void getDirLenth(File src) {
		if (null == src || !src.exists()) {
			throw new RuntimeException("文件不存在");
		}
		for (File f : src.listFiles()) {
			if (f.isDirectory()) {
				getDirLenth(f);
			} else {
				len+= f.length();
				count++;
			}
		}
	}
	public long getLen() {
		return len;
	}
	public int getCount() {
		return count;
	}
	public static void main(String[] args) {
		DirTest02 f1 = new DirTest02("D:/JavaProject/workspace2/IO");
		System.out.println(f1.getLen());	
		System.out.println(f1.getCount());
		DirTest02 f2 = new DirTest02("D:/JavaProject/workspace2/IO/src");
		System.out.println(f2.getLen());	
		System.out.println(f2.getCount());
	}

}
