package com.shenyang.io2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Copy {
	public static void copy(String srcPath,String destPath){
		File src = new File(srcPath);
		File dest = new File(destPath);
		OutputStream os = null;
		InputStream is = null;
		try {
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			byte[] flush = new byte[1024];
			int len = 0;
			while((len=is.read(flush))!=-1){
				os.write(flush,0,len);
			}
			os.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//释放资源，分别关闭，先打开的后关闭
			try {
				if(null!=os){
					os.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				if(null!=is){
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		copy("cat.jpg", "copy3.jpg");
	}
}
