package arrays;

import java.util.Arrays;

public class ReverseArrays {
	
	public static void main(String[] args) {
		int[] test = new int[10];
		for(int i=0;i<test.length;i++) {
			test[i] = i+1;
		}
		System.out.println(Arrays.toString(test));
		for(int i=0;i<test.length/2;i++) {
			int temp = test[i];
			test[i] = test[test.length-i-1];
			test[test.length-i-1] = temp;
		}
		for(int temp : test) {
			System.out.printf(temp+" ");
		}
	}
}
