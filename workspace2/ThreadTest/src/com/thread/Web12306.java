package com.thread;
/**
 * ģ����Ʊϵͳ��һ����Դ���������
 * ��������Ҫ����̰߳�ȫ
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
				Thread.sleep(200);//ģ�������ӳ�
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"---->"+ticket--);
		}
	}
	public static void main(String[] args) {
		//һ����Դ
		Web12306 w1 = new Web12306();
		//����������㹲��ͬһ����Դ��ģ����Ʊϵͳ��
		new Thread(w1,"һ��").start();
		new Thread(w1,"����").start();
		new Thread(w1,"����").start();
	}

}
