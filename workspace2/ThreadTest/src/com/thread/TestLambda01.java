package com.thread;

public class TestLambda01 {
	// ��̬�ڲ���
	static class FactRun1 implements Runnable {

		@Override
		public void run() {
			System.out.println("1����̬�ڲ���");
		}

	}

	public static void main(String[] args) {
		// ��̬�ڲ������
		new Thread(new FactRun1()).start();
		// �ֲ��ڲ���
		class FactRun2 implements Runnable {
			@Override
			public void run() {
				System.out.println("2���ֲ��ڲ���");
			}
		}
		// �ֲ��ڲ������
		new Thread(new FactRun2()).start();

		// �����ڲ��� ��������ӿڻ��߸���
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("3�������ڲ���");
			}
		}).start();


		
		// lambda���ӿ�ֻ��һ��������ʱ�򣬺��Է�����ֱ�Ӹ����βκʹ���
	
		Runnable r = ()->{
			System.out.println("4��lambda");
		};
		new Thread(r).start();;
		//�򻯣�ͬ�ϣ�   �൱��һ��ʵ����Runnable�ӿڵ��࣬
		new Thread(() -> {
			System.out.println("5��lambda");
		}).start();


	}
}

