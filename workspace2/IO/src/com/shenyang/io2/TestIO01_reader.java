package com.shenyang.io2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
/**
 * 文件字符输入流 reader
 * @author Administrator
 *
 */
public class TestIO01_reader {

	public static void main(String[] args) {
		File src = new File("iotest.txt");
		Reader reader = null;
		
		try {
			reader = new FileReader(src);
			char[] flush = new char[11];
			int len = 0;
			//分段读取
			while((len=reader.read(flush))!=-1) {
				String str = new String(flush, 0, len);
				System.out.print(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(reader!=null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
