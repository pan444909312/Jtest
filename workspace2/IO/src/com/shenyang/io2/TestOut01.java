package com.shenyang.io2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestOut01 {
	public static void main(String[] args) {
		//1������Դ
		File dest = new File("write.txt");
		//2��ѡ����
		OutputStream os = null;
		try {
			//3������
			//д���ݣ��ļ������ڿ����Զ�����
//			os = new FileOutputStream(dest);//�ӿ�ͷ��ʼд
			os = new FileOutputStream(dest,true);//true��ʾ��ĩβ׷�ӣ�false�ӿ�ͷ��ʼд
			String str = "2134\n";
			//�ַ���-->�ֽ����飬��ν����
			byte[] datas = str.getBytes();
			os.write(datas,0,datas.length);
			//ˢ��������֤��ǰд�������ֽڴ��ݵ�����ϵͳ����д��
			os.flush();//ÿ��д��ˢ��
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(os!=null){
					os.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
