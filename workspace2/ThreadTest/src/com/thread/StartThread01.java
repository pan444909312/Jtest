package com.thread;

/**
 * 创建线程的方法一：
 * 1、创建：继承thread，重写run方法
 * 2、启动：创建子类对象，调用子类对象的start方法
 * @author Administrator
 *
 */
public class StartThread01 extends Thread{
	/*
	 * 线程入口
	 */
	@Override
	public void run() {
		super.run();
		for(int i=0;i<30;i++) {
			System.out.println("听歌");
		}
	}

	public static void main(String[] args) {
		//创建子类对象
		StartThread01 st = new StartThread01();
	
		//开启线程，不保证立即运行，只是加入到调度器中，由CPU分配调用
		st.start();
		//只是普通方法的调用(立即运行)
//		st.run();
		for(int i=0;i<30;i++) {
			System.out.println("工作");
		}
	}
}
