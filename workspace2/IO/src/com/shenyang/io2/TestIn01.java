package com.shenyang.io2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestIn01 {
	public static void main(String[] args) {
		//����Դ
		File src = new File("iotest.txt");
		//ѡ����
		InputStream is = null;
		try {
			//����,��ȡ
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
				//�ͷ���Դ
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
