package com.shenyang.io2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestIn02 {
	public static void main(String[] args) {
		//创建源
		File src = new File("iotest.txt");
		//选择流
		InputStream is = null;
		try {
			//操作，分段读取
			is = new FileInputStream(src);
			byte[] flush = new byte[3];//通常是一字节一字节的读 1024
			int len;
			while((len=is.read(flush))!=-1){
				String str = new String(flush,0,len);
				System.out.println(str);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				//释放资源
				if(null!=is){
					is.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
