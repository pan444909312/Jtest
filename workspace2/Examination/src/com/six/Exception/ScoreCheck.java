package com.six.Exception;

import java.util.Scanner;

public class ScoreCheck {
	public static void main(String[] args){
		int score = 0;
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		if (score >= 0 && score <= 100) {
			System.out.println("成绩为：" + score);
		} else {
			try {
				throw new IllegalScoreException("成绩不在范围内");
			} catch (IllegalScoreException e) {
				e.printStackTrace();
			}finally {
				scanner.close();
			}
		}
		scanner.close();
	}

}

class IllegalScoreException extends Exception {
	public IllegalScoreException() {
		// TODO Auto-generated constructor stub
	}

	public IllegalScoreException(String msg) {
		super(msg);
	}
}