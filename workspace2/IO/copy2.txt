package com.shenyang.io2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Practice {
	public static void main(String[] args) {
		File src = new File("iotest.txt");
		InputStream is = null;
		try {
			is = new FileInputStream(src);
			byte[] flush = new byte[3];
			int len=0;
			while((len=is.read(flush))!=-1){
				String str = new String(flush,0,len);
				System.out.println(str);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(null!=is){
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
