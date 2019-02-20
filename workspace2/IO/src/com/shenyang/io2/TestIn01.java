package com.shenyang.io2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestIn01 {
	public static void main(String[] args) {
		//创建源
		File src = new File("iotest.txt");
		//选择流
		InputStream is = null;
		try {
			//操作,读取
			is = new FileInputStream(src);
			int temp;
			while((temp=is.read())!=-1){
				System.out.print((char)temp);
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
