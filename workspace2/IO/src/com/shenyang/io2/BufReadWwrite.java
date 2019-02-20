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
 * 使用缓冲字符流进行文件拷贝
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
		    //BufferedReader提供了更方便的readLine()方法，直接按行读取文本
            //readLine()方法的返回值是一个字符串对象（碰到\r或\n终止），即文本中的一行内容
			while((flushLine=bufReader.readLine())!=null){
				bufWriter.write(flushLine);
				 //下次写入之前先换行，否则会在上一行后边继续追加，而不是另起一行
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
