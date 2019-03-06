package com.thread;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
/**
 * �����̵߳ķ���һ��
 * 1���������̳�thread����дrun����
 * 2������������������󣬵�����������start����
 * @author Administrator
 *
 */
public class ThreadDownload01 extends Thread{
	private String url;
	private String dest;
	
	public ThreadDownload01(String url, String dest) {
		super();
		this.url = url;
		this.dest = dest;
	}

	@Override
	public void run() {
		download(this.url, this.dest);
	}
	/*
	 * ����url
	 */
	public void download(String url,String dest){
		try {
			FileUtils.copyURLToFile(new URL(url), new File(dest));
		} catch (MalformedURLException e) {
			e.printStackTrace();
			System.out.println("���Ϸ���url");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("ͼƬ����ʧ��");
		}
		
	}
	public static void main(String[] args) {
		//�����߳��������
		ThreadDownload01 td1 = new ThreadDownload01("https://img1.gamersky.com/image2019/02/20190210_ddw_459_5/gamersky_04origin_07_20192101220F83.jpg", "copy1.jpg");
		ThreadDownload01 td2 = new ThreadDownload01("https://img1.gamersky.com/image2019/02/20190210_ddw_459_5/gamersky_13origin_25_20192101220C0C.jpg", "copy2.jpg");
		ThreadDownload01 td3 = new ThreadDownload01("https://img1.gamersky.com/image2019/02/20190210_ddw_459_11/gamersky_04origin_07_20192101422FC9.jpg", "copy3.jpg");
		//��������
		td1.start();
		td2.start();
		td3.start();
	}
}
