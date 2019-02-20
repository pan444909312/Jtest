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
 * 测试转化流 InputStreamReader和OutputStreamWriter
 * @author Administrator
 *
 */
public class TestConvert {
	public static void getSystemIn(){
		//从键盘输入的内容因为是纯字符的，所以使用InputStreamReader转化为reader，然后通过writer输出
		try(BufferedReader isr = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter osr = new BufferedWriter(new OutputStreamWriter(System.out));
				) {
			String msg = "";
			while(!msg.equals("exit")){
				msg = isr.readLine();
				osr.write(msg);
				osr.newLine();
				//强制刷新在循环里，每次输入内容后强制刷新输出内容
				//否则内容没有到达缓冲的字节数，不会输出
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
