package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FindRandomExtremum {
	public static void main(String[] args) {
		int n = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("输入n");
		n = s.nextInt();
		int num[] = new int[50];
		//给50个数赋随机值
		for(int i=0;i<num.length;i++) {
			num[i]=(int)(n*Math.random());
		}
		Arrays.sort(num);
		boolean flag = true;
		for(int i=0;i<num.length;i++) {
			if(num[i]>=60) {
				System.out.println("大于等于60的有: "+(num.length-i-1)+"个");
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("不存在大于等于60的数");
		}
		System.out.println("最大值为:"+num[49]);
		System.out.println("最小值为:"+num[0]);
	}

}
