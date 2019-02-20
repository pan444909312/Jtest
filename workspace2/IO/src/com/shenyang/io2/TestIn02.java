package com.shenyang.io2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestIn02 {
	public static void main(String[] args) {
		//����Դ
		File src = new File("iotest.txt");
		//ѡ����
		InputStream is = null;
		try {
			//�������ֶζ�ȡ
			is = new FileInputStream(src);
			byte[] flush = new byte[3];//ͨ����һ�ֽ�һ�ֽڵĶ� 1024
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
