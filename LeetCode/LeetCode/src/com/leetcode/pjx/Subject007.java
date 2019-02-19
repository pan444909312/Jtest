package com.leetcode.pjx;

import java.math.*;
public class Subject007 {
    public int reverse(int x) {

    	int rev = 0;
    	int temp = x;
    	while(temp!=0){
        	rev = (temp%10)+10*rev;
        	temp/= 10;
        	//不能测到全部，需要优化
        	   if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && temp%10 > 7)) return 0;
               if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && temp%10 < -8)) return 0;
    	}
        return rev;

    }
    public static void main(String[] args) {
    	Subject007 s = new Subject007();
    	System.out.println(s.reverse(1122334412));
    	System.out.println(Integer.MAX_VALUE);
    	System.out.println(Integer.MIN_VALUE);
	}
}
