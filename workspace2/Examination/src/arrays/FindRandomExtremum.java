package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FindRandomExtremum {
	public static void main(String[] args) {
		int n = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("����n");
		n = s.nextInt();
		int num[] = new int[50];
		//��50���������ֵ
		for(int i=0;i<num.length;i++) {
			num[i]=(int)(n*Math.random());
		}
		Arrays.sort(num);
		boolean flag = true;
		for(int i=0;i<num.length;i++) {
			if(num[i]>=60) {
				System.out.println("���ڵ���60����: "+(num.length-i-1)+"��");
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("�����ڴ��ڵ���60����");
		}
		System.out.println("���ֵΪ:"+num[49]);
		System.out.println("��СֵΪ:"+num[0]);
	}

}
