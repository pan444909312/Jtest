package com.thread;



import java.text.SimpleDateFormat;
import java.util.Date;

public class CountDown{
	public void timeCountdown(){
		int ss = 10;
		Date endTime = new Date(System.currentTimeMillis()+1000*ss);//结束时间
		while(true){
			if(ss<0){
				break;
			}
			System.out.println(new SimpleDateFormat("HH:mm:ss").format(endTime));
			endTime = new Date(endTime.getTime()-1000);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			ss--;
		}
		
	}
	public void numCountdown(){
		new Thread(()-> {
			for(int i=10;i>=0;i--){
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("时间到，活动开始");
		}).start();
	}
	
	public static void main(String[] args) {
		CountDown cd1 = new CountDown();
//		cd1.numCountdown();
		cd1.timeCountdown();
	}
}	
