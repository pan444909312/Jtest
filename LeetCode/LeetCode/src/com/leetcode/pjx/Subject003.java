package com.leetcode.pjx;


public class Subject003 {
	
    public int lengthOfLongestSubstring(String s) {
    	char[] c = s.toCharArray(); //字符串转化为字符数组
    	int count = 1;
    	if(c.length==0){
    		return 0;
    	}
for1:    for(int i=0,temp=0;i<c.length-1;i++){
    		for(int j=i+1;j<c.length;j++){
    			for(int k=i;k<j;k++){
    				if(c[j]==c[k]){
    					temp = j-i;
    		    		if(temp>count){
    		    			count = temp;
    		    		}
    					continue for1;
    				}
    			}
    			temp = j-i+1;
    		}
    		if(temp>count){
    			count = temp;
    		}
    	}
    	
        return count;
    }
    
    
    public static void main(String[] args) {
		int a;
    	Subject003 s3 = new Subject003();
    	a = s3.lengthOfLongestSubstring("123");
    	System.out.println(a);
    }
}
