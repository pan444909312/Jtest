package com.thread;


public class TestLambda02 {

	static class Testlam implements Sum {

		@Override
		public int sum(int a, int b) {
			return a + b;
		}

	}

	public static void main(String[] args) {
		// ������Ҫʹ�ú���ʽ�ӿڵķ���ʱ
		// ���鷳�ķ�����дһ��ʵ���࣬Ȼ�󴴽���ʵ�����ʵ��
		// ���ͨ����ʵ�����ýӿڷ��������£�����ʹ�þ�̬�ڲ��ࣩ
		Testlam s1 = new Testlam();
		System.out.println(s1.sum(1, 10));

		// ͨ�����ǻ�ʹ�������ڲ���
		// ֱ�ӽ����ӿڵ��ã����ӿڲ���ʵ�������������������ڲ����ʵ���壩
		Sum s2 = new Sum() {
			@Override
			public int sum(int a, int b) {
				return 0;
			}
		};
		// ʹ��lambda���ʽ���������ڲ���
		// lambda���ʽ�����ͱ����Ǹ�����ʽ�ӿڣ����ӿ�ֻ��һ�����󷽷���
		// ʵ��s3Ϊʵ�ֽӿ�Sum�����ڲ����ʵ������д��sum��������Ϊ{}��
		Sum s3 = (int a, int b) -> {
			return a + 2 * b;
		};
		// lambda���ʽ�ļ�
		Sum s4 = (a, b) -> a + 3 * b;
		System.out.println(s2.sum(1, 10));
		System.out.println(s3.sum(1, 10));
		System.out.println(s4.sum(1, 10));
		//�÷���������һ��Sum�ӿڵ�ʵ���࣬�β�a,b�����巵��a*b
		printSum((a, b) -> a * b);
		printSum((a, b) ->{ 
			System.out.println("���д�����Ҫ��{}");
			return a * b;
		});
	}

	//��Ҫһ��ʵ��Sum�ӿڵ���
	static public void printSum(Sum s) {
		System.out.println(s.sum(12, 2));
	}
}

interface Sum {
	int sum(int a, int b);
}
