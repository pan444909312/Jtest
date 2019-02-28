package com.shenyang.io2;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
/**
 * �ֽ�����������ByteArrayInputStream
 * 1������Դ���ֽ����� ��Ҫ̫��
 * 2��ѡ����
 * 3������
 * 4���ͷ���Դ�����Բ���close��Ϊ�˸�ʽͳһ��close
 * @author Administrator
 *
 */
public class TestIO03_ByteArrayInputStream {

	public static void main(String[] args) {
		byte[] src = "213ninfoenf".getBytes();
		InputStream bais = null;
		
		
		try {
			bais = new ByteArrayInputStream(src);
			byte[] flush = new byte[5];
			int len = 0;
			while((len=bais.read(flush))!=-1) {
				String str = new String(flush, 0, len);
				System.out.println(str);
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bais!=null) {
					bais.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
