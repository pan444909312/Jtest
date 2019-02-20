package com.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestException {
	public static void main(String[] args) {
		FileReader reader = null;
		try {
			// ��������䷢���쳣���쳣����Ĵ���ִ�н����Ժ󣬲���ص�try���ȥִ����δִ�еĴ��롣
			System.out.println("step1");
			reader = new FileReader("D:/JavaProject/workspace2/PleaseRead.txt");
			//FileReader�е�read()�����ĵ��е�һ���ַ���ASCLL��ֵ int���ͣ� ǿ��ת��Ϊchar�����Ӧ�ַ�
			System.out.println((char)reader.read());
			System.out.println("step2");
		} catch (FileNotFoundException e) {  /* ���catch������ǰ�������ں�  */
			e.printStackTrace();
			System.out.println("step3");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("step4");
		}finally {/* �����Ƿ������쳣��������Ҫִ��
					  ͨ����finally�йرճ�����Ѵ򿪵���Դ�����磺�ر��ļ������ͷ����ݿ����ӵ�
					  */
			System.out.println("step5");
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
