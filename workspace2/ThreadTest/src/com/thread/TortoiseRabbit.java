package com.thread;

public class TortoiseRabbit implements Runnable{
	private String winner = "";
	private static boolean gameOver = false;
	@Override
	public void run() {
		int dist = 0;
		for(dist=0;dist<100;dist++){
			if(gameOver){
				break;
			}else{
		
				
				System.out.println(Thread.currentThread().getName()+"-->"+dist);							
			}
		}
		if(dist==100){
			winner = Thread.currentThread().getName();
			gameOver = true;
			System.out.println("ʤ���ߣ�"+winner);
		}


	}
	
	
	public static void main(String[] args) {
		//һ����Դ
		TortoiseRabbit tr = new TortoiseRabbit();
		//���������
		new Thread(tr,"�ڹ�").start();
		new Thread(tr,"����").start();
		
		
	}

}
