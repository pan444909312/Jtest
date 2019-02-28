package com.shenyang.io2;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
/**
 * 字节数组输入流ByteArrayInputStream
 * 1、创建源：字节数组 不要太大
 * 2、选择流
 * 3、操作
 * 4、释放资源，可以不用close，为了格式统一加close
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
