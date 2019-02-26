package com.shenyang.io2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.URL;

/**
 * ����ת���� InputStreamReader��OutputStreamWriter
 * @author Administrator
 *
 */
public class TestConvert {
	public static void getSystemIn(){
		//�Ӽ��������������Ϊ�Ǵ��ַ��ģ�����ʹ��InputStreamReaderת��Ϊreader��Ȼ��ͨ��writer���
		try(BufferedReader isr = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter osr = new BufferedWriter(new OutputStreamWriter(System.out));
				) {
			String msg = "";
			while(!msg.equals("exit")){
				msg = isr.readLine();
				osr.write(msg);
				osr.newLine();
				//ǿ��ˢ����ѭ���ÿ���������ݺ�ǿ��ˢ���������
				//��������û�е��ﻺ����ֽ������������
				osr.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void getUrlInfo(){
		try(BufferedReader is = new BufferedReader(new InputStreamReader(new URL("http://www.baidu.com").openStream()));
				){
			String str = "";

			while((str=is.readLine())!=null){
				System.out.print(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
//		getSystemIn();
		getUrlInfo();
	}
}