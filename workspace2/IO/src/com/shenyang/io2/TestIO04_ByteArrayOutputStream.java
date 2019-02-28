package com.shenyang.io2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * �ֽ����������ByteArrayOutputStream
 * 1������Դ���ڲ�ά�������ݱ������ڴ���
 * 2��ѡ������������Դ
 * 3����������Ҫͨ��toByteArray���ڴ��л�ȡ����
 * 4���ͷ���Դ�����Բ���close��Ϊ�˸�ʽͳһ��close
 * @author Administrator
 *
 */
public class TestIO04_ByteArrayOutputStream {

	public static void main(String[] args) {
		byte[] dest = null;
		
		//��Ϊʹ���������������Բ�Ҫʹ�ö�̬��ֱ��ʹ��ByteArrayOutputStream�� 
		ByteArrayOutputStream baos = null;  
		
		
		try {

			baos = new ByteArrayOutputStream();//��������Դ��Դ�ڲ�ά��
			String str = new String("23231");
			byte[] datas = str.getBytes(); //����
			baos.write(datas, 0, datas.length);
			baos.flush();
			dest = baos.toByteArray(); //���ڴ��л�ȡ���ݣ��ֽ� ���飩
			System.out.println(new String(dest));//����
 
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(baos!=null) {
					baos.close();
				} 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
