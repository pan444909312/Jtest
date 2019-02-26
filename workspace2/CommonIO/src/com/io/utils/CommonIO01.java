package com.io.utils;

import java.io.File;
import java.io.FileFilter;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.FileFilterUtils;

public class CommonIO01 {
	public static void main(String[] args) {
		File d1 = new File("D:/JavaStudy/workspace2/CommonIO");
		//计算文件或文件夹的大小
		long s1 = FileUtils.sizeOf(new File("src/com/io/utils/CommonIO01.java"));
		System.out.println(s1);
		long s2 = FileUtils.sizeOf(d1);
		System.out.println(s2);
		System.out.println("------------------------------------------------");
		/*
		 * File，文件过滤器，文件夹过滤器
		 * EmptyFileFilter.NOT_EMPTY读取非空文件，常用的文件过滤器
		 * DirectoryFileFilter.DIRECTORY表示读取子孙级
		 */
		Collection<File> c1 = FileUtils.listFiles(
				d1, EmptyFileFilter.NOT_EMPTY, DirectoryFileFilter.DIRECTORY);
		for (File file : c1) {
			System.out.println(file.getAbsolutePath());
		}
		System.out.println("------------------------------------------------");
		Collection<File> c2 = FileUtils.listFiles(
				d1, FileFilterUtils.sizeFileFilter(0),null);//文件过滤器null则仅读取该文件子孙级
		for (File file : c2) {
			System.out.println(file.getAbsolutePath());
		}
		System.out.println("------------------------------------------------");
	
	
	
	
	
	}
}
