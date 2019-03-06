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
			System.out.println("胜利者："+winner);
		}


	}
	
	
	public static void main(String[] args) {
		//一份资源
		TortoiseRabbit tr = new TortoiseRabbit();
		//多个代理共享
		new Thread(tr,"乌龟").start();
		new Thread(tr,"兔子").start();
		
		
	}

}
