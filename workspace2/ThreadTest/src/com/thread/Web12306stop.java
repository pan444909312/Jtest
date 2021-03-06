package com.thread;
/**
 * 模拟抢票系统，一份资源，多个代理
 * 并发，需要解决线程安全
 * @author Administrator
 *
 */
public class Web12306stop implements Runnable{
	private static int ticket = 100;
	private boolean available = true;
	
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	@Override
	public void run() {
		while(this.isAvailable()){
//			try {
//				Thread.sleep(100);//模拟网络延迟
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			System.out.println(Thread.currentThread().getName()+"---->"+ticket--);
		}
	}
	public static void main(String[] args) {
		//一份资源
		Web12306stop w1 = new Web12306stop();
		//多个代理，方便共享同一份资源（模拟抢票系统）
		new Thread(w1,"一号").start();
//		new Thread(w1,"二号").start();
//		new Thread(w1,"三号").start();
		int i = 0;
		while(w1.isAvailable()){
			if(ticket<0){
				w1.setAvailable(false);
				System.out.println("票没了");
			}
		}
	}

}
