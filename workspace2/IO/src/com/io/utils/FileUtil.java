package com.io.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileUtil {
	public static void main(String[] args) {
		byte[] datas = null;
		try (InputStream fis = new FileInputStream("iotest.txt");
				OutputStream fos = new FileOutputStream("utilcopy1.txt")) {
			copy(fis, fos);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		// �ļ�תΪ�ֽ�����
		try (InputStream fis = new FileInputStream("cat.jpg");
				ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
			copy(fis, baos);
			datas = baos.toByteArray();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		// �ֽ�����תΪ�ļ�
		try (
				ByteArrayInputStream bais = new ByteArrayInputStream(datas);
				OutputStream fos = new FileOutputStream("utilcopy2.jpg");) {
			copy(bais, fos);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

	/**
	 * �Խ����������
	 * 
	 * @param is
	 * @param os
	 */
	public static void copy(InputStream is, OutputStream os) {
		try {
			byte[] flush = new byte[1024];
			int len = 0;
			while ((len = is.read(flush)) != -1) {
				os.write(flush, 0, len);
			}
			os.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * �ر���Դ
	 * 
	 * @param is
	 * @param os
	 */
	public static void close(InputStream is, OutputStream os) {
		try {
			if (null != os) {
				os.close();
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			if (null != is) {
				is.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * �ر���Դ��ʹ�ÿɱ�����ķ���
	 * 
	 * @param ios
	 */
	public static void close(Closeable... ios) {
		for (Closeable io : ios) {
			try {
				if (null != io) {
					io.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}