package com.leetcode.pjx;

public class Subject001 {
    public int[] twoSum(int[] nums, int target) {
    	for(int i=0;i<nums.length;i++){
    		for(int j=i+1;j<nums.length;j++){
    			if(target==nums[i]+nums[j]){
    				return new int[]{i,j};         //返回new一个{i,j}的数组
    			}
    		}
    	}
    	throw new IllegalArgumentException("No two sum solution");//不满足抛出异常

    }
    public static void main(String[] args) {
		int nums[] = {1,2,3,4,5,6,7,8,9};
		int target = 12; 
		int result[];
		Subject001 s1 = new Subject001();
		result = s1.twoSum(nums, target);
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}

	}
    
}

