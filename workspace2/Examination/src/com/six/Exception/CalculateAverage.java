package com.six.Exception;

import java.util.Scanner;

public class CalculateAverage {
	public static void main(String[] args) {
		int n,sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("����ѧ������:");
		n = scanner.nextInt();
		int[] score = new int[n];
		for(int i=0;i<n;i++) {
			score[i] = scanner.nextInt();
			sum = sum +score[i];
			if(score[i]<0) {
				try {
					throw new Exception("����Ϊ��");
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					scanner.close();
				}
			}
		}
		System.out.println((double)sum/n);
		scanner.close();
	}

}
