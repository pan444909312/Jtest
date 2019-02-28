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
 *������������ ��ͼƬ�ļ�ת��Ϊ�ֽ����飬�ֽ�����ת��ΪͼƬ�ļ�
 * @author Administrator
 *
 */
public class TestIO05 {

	public static void main(String[] args) {
		System.out.println(FileToByteArray("p1.jpg").length);
		ByteArrayToFile(FileToByteArray("p1.jpg"),"TestIO05.jpg");
	}
	/**
	 * ��������ļ���ͼƬ��ת��Ϊ�ֽ�����
	 * 1����ȡ�ļ���fileInputStream
	 * 2���������е�����������ֽ����� ByteArrayOutputStream
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
			//�ֶζ�д,������������flush�д������baos��
			while((len=is.read(flush))!=-1) {
				baos.write(flush,0,len);
	
			}
			baos.flush();
			//�ɹ������ֽ�����
			return baos.toByteArray();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//baos����Ҫ close
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
	 * ���ֽ�����ת��Ϊ�ļ�
	 * 1����ȡ�ֽ����鵽����ByteArrayInputString
	 * 2���������е��ֽ�����ת��Ϊ�ļ�fileOutputStream
	 */
	public static void ByteArrayToFile(byte[] datas,String destPath) {
		File dest = new File(destPath);
		InputStream bais = null;
		OutputStream os = null;
		try {
			//��ȡ�ֽ����鱣���������
			bais = new ByteArrayInputStream(datas);
			os = new FileOutputStream(dest);
			int len = 0;
			byte[] flush = new byte[1024]; 
			//�ӳ����зֶζ�ȡ���ݱ�������������flush�У��ٷֶ�д��os��
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
				//bais����Ҫclose
				if(os!=null) { 
					os.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
