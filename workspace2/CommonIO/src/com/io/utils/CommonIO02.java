package com.io.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

/**
 * 测试FileUtils的读写
 * @author Administrator
 *
 */
public class CommonIO02 {
	public static void main(String[] args) {
		File dest = new File("IOtest.txt");
		try {
			FileUtils.write(dest, "123","UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
