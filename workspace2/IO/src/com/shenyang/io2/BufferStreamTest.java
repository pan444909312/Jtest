package com.shenyang.io2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/**
 * �������Ĵ�С���ֽ�����Ĵ�С���Ż����������յĿ���Ч��
 * ��һ���Զ�ȡ��������ʱ����byte[] flush = new byte[1024]��������ʱ�������ֽ�����ʱ���������ͨ�ֽ����ĺ�ʱ
 * @author Administrator
 *
 */
public class BufferStreamTest {
	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		copy1("E:/java/03_�ɻ�С��Ŀ(java���źͶ�����ϰ)/095_��������������෢�ڵ�.mp4","copy1.mp4");
		long t2 = System.currentTimeMillis();
		System.out.println("�����ֽ�����ʱ"+(t2-t1));
		long t3 = System.currentTimeMillis();
		copy2("E:/java/03_�ɻ�С��Ŀ(java���źͶ�����ϰ)/095_��������������෢�ڵ�.mp4","copy2.mp4");
		long t4 = System.currentTimeMillis();
		System.out.println("��ͨ�ֽ�����ʱ"+(t4-t3));
	}
	/**
	 * ʹ�û����ֽ�����������
	 */
	public static void copy1(String srcPath,String destPath){
		File src = new File(srcPath);
		File dest = new File(destPath);
		InputStream is = null;
		OutputStream os = null;
		BufferedInputStream bis= null;
		BufferedOutputStream bos = null;
		try {
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			bis = new BufferedInputStream(is);//������Ĭ�ϴ�С8192
			bos = new BufferedOutputStream(os);
			int len=0;
			byte[] flush = new byte[1024];
			while((len=bis.read(flush))!=-1){
				bos.write(flush,0,len);
			}
			bos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(bos!=null)
					bos.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				if(bis!=null)
					bis.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				if(os!=null)
					os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(is!=null)
					is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	/**
	 * ֱ��ʹ���ֽ������и���
	 */
	public static void copy2(String srcPath,String destPath){
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
			e.printStackTrace();
		}finally{
			//�ͷ���Դ���ֱ�رգ��ȴ򿪵ĺ�ر�
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
}