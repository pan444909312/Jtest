package com.thread;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
/**
 * 创建线程的方法二：
 * 1、创建：实现Runnable接口，重写run方法
 * 2、启动：创建类对象和thread代理对象，调用代理对象的start方法
 * 
 * 推荐和优先使用接口实现多线程，避免单继承的局限性（无法继承多个类）
 * 而且可以方便资源共享
 * 
 * @author Administrator
 *
 */
public class ThreadDownload02 implements Runnable{
	private String url;
	private String dest;
	
	public ThreadDownload02(String url, String dest) {
		super();
		this.url = url;
		this.dest = dest;
	}

	@Override
	public void run() {
		download(this.url, this.dest);
	}
	/*
	 * 下载url
	 */
	public void download(String url,String dest){
		try {
			FileUtils.copyURLToFile(new URL(url), new File(dest));
		} catch (MalformedURLException e) {
			e.printStackTrace();
			System.out.println("不合法的url");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("图片下载失败");
		}
		
	}
	public static void main(String[] args) {
		//创建实现类对象
		ThreadDownload02 td1 = new ThreadDownload02("https://img1.gamersky.com/image2019/02/20190210_ddw_459_5/gamersky_04origin_07_20192101220F83.jpg", "copy1.jpg");
		ThreadDownload02 td2 = new ThreadDownload02("https://img1.gamersky.com/image2019/02/20190210_ddw_459_5/gamersky_13origin_25_20192101220C0C.jpg", "copy2.jpg");
		ThreadDownload02 td3 = new ThreadDownload02("https://img1.gamersky.com/image2019/02/20190210_ddw_459_11/gamersky_04origin_07_20192101422FC9.jpg", "copy3.jpg");
		//创建代理类对象
		Thread t1 = new Thread(td1);;
		Thread t2 = new Thread(td2);;
		Thread t3 = new Thread(td3);;
		//启动进程
		t1.start();
		t2.start();
		t3.start();
		/*相当于，只是用一次的话可以使用匿名调用
		new Thread(new ThreadDownload02(url, dest)).start();
		new Thread(new ThreadDownload02(url, dest)).start();
		new Thread(new ThreadDownload02(url, dest)).start();
		*/
	}
}
