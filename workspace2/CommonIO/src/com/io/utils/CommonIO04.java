
package com.io.utils;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

/**
 * FileUtils的拷贝
 * @author Administrator
 *
 */
public class CommonIO04 {
	public static void main(String[] args) throws MalformedURLException {
		File src = new File("p1.jpg");
		File srcDir = new File("srcDir");
		File destDir = new File("destDir");

		try {
			FileUtils.copyFile(src, new File("copy.jpg"));
			FileUtils.copyFileToDirectory(src, srcDir);
			FileUtils.copyDirectory(srcDir, destDir);
			FileUtils.copyDirectoryToDirectory(srcDir, destDir);
			//可以拷贝图片URL网页URL，但是无法指定字符集
			FileUtils.copyURLToFile(new URL("https://game.qq.com"), new File("URL.txt"));
			String str = IOUtils.toString(new URL("https://game.qq.com/"), "gb2312");
			System.out.println(str);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
