package com.io.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.io.FileUtils;

/**
 * 测试FileUtils的写入
 * @author Administrator
 *
 */
public class CommonIO03 {
	public static void main(String[] args) {
		File dest = new File("utilsWrite.txt");
		Collection<String> c1 = new ArrayList<String>();
		c1.add("第一");
		c1.add("第二");
		try {
			//相当于将字符串写入文件
			FileUtils.write(dest, "杭州一切顺利吧\n","utf-8");
			//逐行写入，第三个参数为每个元素之间的分隔符不加默认为换行
			FileUtils.writeLines(dest, c1,"---\n",true);
			//字节数组写入
			FileUtils.writeByteArrayToFile(dest, new String("123").getBytes(), true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
