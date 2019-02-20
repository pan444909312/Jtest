package com.shenyang.io2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestOut01 {
	public static void main(String[] args) {
		//1、创建源
		File dest = new File("write.txt");
		//2、选择流
		OutputStream os = null;
		try {
			//3、操作
			//写内容，文件不存在可以自动创建
//			os = new FileOutputStream(dest);//从开头开始写
			os = new FileOutputStream(dest,true);//true表示从末尾追加，false从开头开始写
			String str = "2134\n";
			//字符串-->字节数组，所谓编码
			byte[] datas = str.getBytes();
			os.write(datas,0,datas.length);
			//刷新流仅保证先前写入流的字节传递到操作系统进行写入
			os.flush();//每次写后刷新
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(os!=null){
					os.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
