package com.shenyang.io2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *两个方法发： 将图片文件转化为字节数组，字节数组转化为图片文件
 * @author Administrator
 *
 */
public class TestIO05 {

	public static void main(String[] args) {
		System.out.println(FileToByteArray("p1.jpg").length);
		ByteArrayToFile(FileToByteArray("p1.jpg"),"TestIO05.jpg");
	}
	/**
	 * 将传入的文件（图片）转化为字节数组
	 * 1、读取文件，fileInputStream
	 * 2、将程序中的内容输出成字节数组 ByteArrayOutputStream
	 */
	public static byte[] FileToByteArray(String srcPath) {
		File src = new File(srcPath);
		InputStream is = null;
		ByteArrayOutputStream baos = null;
		try {
			is = new FileInputStream(src);
			baos = new ByteArrayOutputStream();
			
			byte[] flush = new byte[1024];
			int len = 0;
			//分段读写,读到缓冲容器flush里，写到程序baos里
			while((len=is.read(flush))!=-1) {
				baos.write(flush,0,len);
	
			}
			baos.flush();
			//成功返回字节数组
			return baos.toByteArray();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//baos不需要 close
				if(is!=null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
		
		
	}
	/**
	 * 将字节数组转化为文件
	 * 1、读取字节数组到程序，ByteArrayInputString
	 * 2、将程序中的字节数组转化为文件fileOutputStream
	 */
	public static void ByteArrayToFile(byte[] datas,String destPath) {
		File dest = new File(destPath);
		InputStream bais = null;
		OutputStream os = null;
		try {
			//读取字节数组保存进程序中
			bais = new ByteArrayInputStream(datas);
			os = new FileOutputStream(dest);
			int len = 0;
			byte[] flush = new byte[1024]; 
			//从程序中分段读取内容保存至缓冲容器flush中，再分段写入os中
			while((len=bais.read(flush))!=-1) {
				os.write(flush,0,len);
			}
			os.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//bais不需要close
				if(os!=null) { 
					os.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
