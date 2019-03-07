package com.thread;


public class TestLambda02 {

	static class Testlam implements Sum {

		@Override
		public int sum(int a, int b) {
			return a + b;
		}

	}

	public static void main(String[] args) {
		// 当我们要使用函数式接口的方法时
		// 最麻烦的方法是写一个实现类，然后创建该实现类的实例
		// 最后通过该实例调用接口方法，如下（这里使用静态内部类）
		Testlam s1 = new Testlam();
		System.out.println(s1.sum(1, 10));

		// 通常我们会使用匿名内部类
		// 直接借助接口调用，（接口不能实例化，大括号里匿名内部类的实现体）
		Sum s2 = new Sum() {
			@Override
			public int sum(int a, int b) {
				return 0;
			}
		};
		// 使用lambda表达式代替匿名内部类
		// lambda表达式的类型必需是个函数式接口（即接口只有一个抽象方法）
		// 实例s3为实现接口Sum匿名内部类的实例，重写的sum方法内容为{}内
		Sum s3 = (int a, int b) -> {
			return a + 2 * b;
		};
		// lambda表达式的简化
		Sum s4 = (a, b) -> a + 3 * b;
		System.out.println(s2.sum(1, 10));
		System.out.println(s3.sum(1, 10));
		System.out.println(s4.sum(1, 10));
		//该方法传入了一个Sum接口的实现类，形参a,b，类体返回a*b
		printSum((a, b) -> a * b);
		printSum((a, b) ->{ 
			System.out.println("多行代码需要加{}");
			return a * b;
		});
	}

	//需要一个实现Sum接口的类
	static public void printSum(Sum s) {
		System.out.println(s.sum(12, 2));
	}
}

interface Sum {
	int sum(int a, int b);
}
