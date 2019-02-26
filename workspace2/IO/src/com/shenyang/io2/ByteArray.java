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

public class ByteArray {
	public static void byteArrayToFile(byte[] datas,String destPath){
		File dest = new File(destPath);
		ByteArrayInputStream bais = null;
		OutputStream os = null;
		try {
			bais = new ByteArrayInputStream(datas);
			os = new FileOutputStream(dest); 
			int len=0;
			byte[] flush = new byte[5];
			while((len=bais.read(flush))!=-1){
				os.write(flush, 0, len);
			}
			os.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(os!=null){
					os.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static byte[] fieToByteArray(String filePath){
		//����Դ
		File src = new File(filePath);
		//ѡ����
		ByteArrayOutputStream baos = null;
		InputStream is = null;
		try {
			is = new FileInputStream(src);
			baos = new ByteArrayOutputStream();
			byte[] flush = new byte[1024];
			int len = 0;
			//�ֶζ�ȡ������ȡ�������ݷֶ�д��baos��
			while((len=is.read(flush))!=-1){
				baos.write(flush, 0, len);
			}
			return baos.toByteArray();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(is!=null){
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		byte[] temp = fieToByteArray("cat.jpg");
		byteArrayToFile(temp,"ttbb.jpg");
	}
}