package com.thread;

/**
 * �����̵߳ķ���һ��
 * 1���������̳�thread����дrun����
 * 2������������������󣬵�����������start����
 * @author Administrator
 *
 */
public class StartThread01 extends Thread{
	/*
	 * �߳����
	 */
	@Override
	public void run() {
		super.run();
		for(int i=0;i<30;i++) {
			System.out.println("����");
		}
	}

	public static void main(String[] args) {
		//�����������
		StartThread01 st = new StartThread01();
	
		//�����̣߳�����֤�������У�ֻ�Ǽ��뵽�������У���CPU�������
		st.start();
		//ֻ����ͨ�����ĵ���(��������)
//		st.run();
		for(int i=0;i<30;i++) {
			System.out.println("����");
		}
	}
}
