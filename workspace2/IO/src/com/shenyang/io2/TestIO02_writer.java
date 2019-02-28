package com.shenyang.io2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
/**
 * 文件字符输出流 writer
 * @author Administrator
 *
 */
public class TestIO02_writer {

	public static void main(String[] args) {
		File dest = new File("writer.txt");
		Writer writer = null;
		
		
		try {
			writer = new FileWriter(dest);
			String datas = new String("231asd");
			writer.write(datas);
			writer.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(writer!=null) {
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
