package com.shenyang.io2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * ʹ�û����ַ��������ļ�����
 * @author Administrator
 *
 */
public class BufReadWwrite {
	public static void bufCopy(String srcPath,String destPath){
		
		File src = new File(srcPath);
		File dest = new File(destPath);
		
		Reader reader = null;
		Writer writer = null;
		BufferedReader bufReader = null;
		BufferedWriter bufWriter = null;
		try {
			reader = new FileReader(src);
			writer = new FileWriter(dest);
			bufReader = new BufferedReader(reader);
			bufWriter = new BufferedWriter(writer);
			String flushLine = "";
		    //BufferedReader�ṩ�˸������readLine()������ֱ�Ӱ��ж�ȡ�ı�
            //readLine()�����ķ���ֵ��һ���ַ�����������\r��\n��ֹ�������ı��е�һ������
			while((flushLine=bufReader.readLine())!=null){
				bufWriter.write(flushLine);
				 //�´�д��֮ǰ�Ȼ��У����������һ�к�߼���׷�ӣ�����������һ��
				bufWriter.newLine();
			}
			bufWriter.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(bufWriter!=null)
					bufWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(bufReader!=null)
					bufReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(writer!=null)
					writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				if(reader!=null)
					reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		
	}
	public static void main(String[] args) {
		bufCopy("write.txt","bufCopy.txt");
	}
}
