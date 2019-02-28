package com.shenyang.io2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * 字节数组输出流ByteArrayOutputStream
 * 1、创建源：内部维护，数据保存在内存中
 * 2、选择流：不关联源
 * 3、操作：需要通过toByteArray从内存中获取数据
 * 4、释放资源，可以不用close，为了格式统一加close
 * @author Administrator
 *
 */
public class TestIO04_ByteArrayOutputStream {

	public static void main(String[] args) {
		byte[] dest = null;
		
		//因为使用新增方法，所以不要使用多态，直接使用ByteArrayOutputStream类 
		ByteArrayOutputStream baos = null;  
		
		
		try {

			baos = new ByteArrayOutputStream();//流不关联源，源内部维护
			String str = new String("23231");
			byte[] datas = str.getBytes(); //编码
			baos.write(datas, 0, datas.length);
			baos.flush();
			dest = baos.toByteArray(); //从内存中获取数据（字节 数组）
			System.out.println(new String(dest));//解码
 
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(baos!=null) {
					baos.close();
				} 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
