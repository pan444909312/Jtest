package com.io.utils;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * 测试FileUtils的读取
 * @author Administrator
 *
 */
public class CommonIO02 {
	public static void main(String[] args) {
		File src = new File("IOtest.txt");
		
		try {
			//读取为字符串
			String msg = FileUtils.readFileToString(src, "UTF-8");
			System.out.println(msg);
			System.out.println("--------------------");
			//读取为字节数组
			byte[] datas = FileUtils.readFileToByteArray(src);
			String msg2 = new String(datas,0,datas.length);
			System.out.println(msg2);
			System.out.println("--------------------");
			//逐行读取
			List<String> l1 = FileUtils.readLines(src, "utf-8");
			for (String string : l1) {
				System.out.println(string); 
			}
			System.out.println("--------------------");
			//读取为迭代器
			Iterator iter = FileUtils.lineIterator(src, "utf-8");
			while(iter.hasNext()) {
				System.out.println(iter.next());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
