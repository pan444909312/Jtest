package com.thread;
/**
 * 模拟抢票系统，一份资源，多个代理
 * 并发，需要解决线程安全
 * @author Administrator
 *
 */
public class Web12306 implements Runnable{
	private int ticket = 100;
	
	@Override
	public void run() {
		while(true){
			
			if(ticket<0){
				break;
			}
			try {
				Thread.sleep(200);//模拟网络延迟
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"---->"+ticket--);
		}
	}
	public static void main(String[] args) {
		//一份资源
		Web12306 w1 = new Web12306();
		//多个代理，方便共享同一份资源（模拟抢票系统）
		new Thread(w1,"一号").start();
		new Thread(w1,"二号").start();
		new Thread(w1,"三号").start();
	}

}
