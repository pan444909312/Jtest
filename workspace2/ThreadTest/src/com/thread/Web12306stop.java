package com.thread;
/**
 * ģ����Ʊϵͳ��һ����Դ���������
 * ��������Ҫ����̰߳�ȫ
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
//				Thread.sleep(100);//ģ�������ӳ�
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			System.out.println(Thread.currentThread().getName()+"---->"+ticket--);
		}
	}
	public static void main(String[] args) {
		//һ����Դ
		Web12306stop w1 = new Web12306stop();
		//����������㹲��ͬһ����Դ��ģ����Ʊϵͳ��
		new Thread(w1,"һ��").start();
//		new Thread(w1,"����").start();
//		new Thread(w1,"����").start();
		int i = 0;
		while(w1.isAvailable()){
			if(ticket<0){
				w1.setAvailable(false);
				System.out.println("Ʊû��");
			}
		}
	}

}
