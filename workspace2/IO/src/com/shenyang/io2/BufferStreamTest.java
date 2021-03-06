package com.shenyang.io2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/**
 * 缓冲区的大小和字节数组的大小的优化将决定最终的拷贝效率
 * 当一次性读取大量数据时，即byte[] flush = new byte[1024]容量过大时，缓冲字节流耗时还会大于普通字节流的耗时
 * @author Administrator
 *
 */
public class BufferStreamTest {
	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		copy1("E:/java/03_飞机小项目(java入门和对象练习)/095_容器或数组产生多发炮弹.mp4","copy1.mp4");
		long t2 = System.currentTimeMillis();
		System.out.println("缓冲字节流耗时"+(t2-t1));
		long t3 = System.currentTimeMillis();
		copy2("E:/java/03_飞机小项目(java入门和对象练习)/095_容器或数组产生多发炮弹.mp4","copy2.mp4");
		long t4 = System.currentTimeMillis();
		System.out.println("普通字节流耗时"+(t4-t3));
	}
	/**
	 * 使用缓冲字节流处理复制
	 */
	public static void copy1(String srcPath,String destPath){
		File src = new File(srcPath);
		File dest = new File(destPath);
		InputStream is = null;
		OutputStream os = null;
		BufferedInputStream bis= null;
		BufferedOutputStream bos = null;
		try {
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			bis = new BufferedInputStream(is);//缓存区默认大小8192
			bos = new BufferedOutputStream(os);
			int len=0;
			byte[] flush = new byte[1024];
			while((len=bis.read(flush))!=-1){
				bos.write(flush,0,len);
			}
			bos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(bos!=null)
					bos.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				if(bis!=null)
					bis.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				if(os!=null)
					os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(is!=null)
					is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	/**
	 * 直接使用字节流进行复制
	 */
	public static void copy2(String srcPath,String destPath){
		File src = new File(srcPath);
		File dest = new File(destPath);
		OutputStream os = null;
		InputStream is = null;
		try {
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			byte[] flush = new byte[1024];
			int len = 0;
			while((len=is.read(flush))!=-1){
				os.write(flush,0,len);
			}
			os.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//释放资源，分别关闭，先打开的后关闭
			try {
				if(null!=os){
					os.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				if(null!=is){
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
