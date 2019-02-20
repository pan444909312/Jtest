package com.shenyang.io2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Copy2 {
	public static void copy(String srcPath,String destPath){
		File src = new File(srcPath);
		File dest = new File(destPath);

		try(OutputStream os= new FileOutputStream(dest);
				InputStream is = new FileInputStream(src)) {

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
		}
	}
	
	public static void main(String[] args) {
		copy("cat.jpg", "copy3.jpg");
	}
}
