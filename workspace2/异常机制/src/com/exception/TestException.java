package com.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestException {
	public static void main(String[] args) {
		FileReader reader = null;
		try {
			// 当以下语句发生异常，异常处理的代码执行结束以后，不会回到try语句去执行尚未执行的代码。
			System.out.println("step1");
			reader = new FileReader("D:/JavaProject/workspace2/PleaseRead.txt");
			//FileReader中的read()返回文档中第一个字符的ASCLL码值 int类型， 强制转换为char输入对应字符
			System.out.println((char)reader.read());
			System.out.println("step2");
		} catch (FileNotFoundException e) {  /* 多个catch子类在前，父类在后  */
			e.printStackTrace();
			System.out.println("step3");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("step4");
		}finally {/* 不管是否发生了异常，都必须要执行
					  通常在finally中关闭程序块已打开的资源，比如：关闭文件流、释放数据库连接等
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
