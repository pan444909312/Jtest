package com.thread;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
/**
 * �����̵߳ķ�������
 * 1��������ʵ��Runnable�ӿڣ���дrun����
 * 2������������������thread������󣬵��ô�������start����
 * 
 * �Ƽ�������ʹ�ýӿ�ʵ�ֶ��̣߳����ⵥ�̳еľ����ԣ��޷��̳ж���ࣩ
 * ���ҿ��Է�����Դ����
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
		//����ʵ�������
		ThreadDownload02 td1 = new ThreadDownload02("https://img1.gamersky.com/image2019/02/20190210_ddw_459_5/gamersky_04origin_07_20192101220F83.jpg", "copy1.jpg");
		ThreadDownload02 td2 = new ThreadDownload02("https://img1.gamersky.com/image2019/02/20190210_ddw_459_5/gamersky_13origin_25_20192101220C0C.jpg", "copy2.jpg");
		ThreadDownload02 td3 = new ThreadDownload02("https://img1.gamersky.com/image2019/02/20190210_ddw_459_11/gamersky_04origin_07_20192101422FC9.jpg", "copy3.jpg");
		//�������������
		Thread t1 = new Thread(td1);;
		Thread t2 = new Thread(td2);;
		Thread t3 = new Thread(td3);;
		//��������
		t1.start();
		t2.start();
		t3.start();
		/*�൱�ڣ�ֻ����һ�εĻ�����ʹ����������
		new Thread(new ThreadDownload02(url, dest)).start();
		new Thread(new ThreadDownload02(url, dest)).start();
		new Thread(new ThreadDownload02(url, dest)).start();
		*/
	}
}
