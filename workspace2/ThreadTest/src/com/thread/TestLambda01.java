package com.thread;

public class TestLambda01 {
	// 静态内部类
	static class FactRun1 implements Runnable {

		@Override
		public void run() {
			System.out.println("1、静态内部类");
		}

	}

	public static void main(String[] args) {
		// 静态内部类调用
		new Thread(new FactRun1()).start();
		// 局部内部类
		class FactRun2 implements Runnable {
			@Override
			public void run() {
				System.out.println("2、局部内部类");
			}
		}
		// 局部内部类调用
		new Thread(new FactRun2()).start();

		// 匿名内部类 必需借助接口或者父类
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("3、匿名内部类");
			}
		}).start();


		
		// lambda，接口只有一个方法的时候，忽略方法名直接复制形参和代码
	
		Runnable r = ()->{
			System.out.println("4、lambda");
		};
		new Thread(r).start();;
		//简化，同上，   相当于一个实现了Runnable接口的类，
		new Thread(() -> {
			System.out.println("5、lambda");
		}).start();


	}
}

