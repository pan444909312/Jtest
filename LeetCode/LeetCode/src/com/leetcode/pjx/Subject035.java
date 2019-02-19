package com.leetcode.pjx;

public class Subject035 {

}
class Solution35 {
    public int searchInsert(int[] nums, int target) {
    	for(int i=0;i<nums.length;i++){
    		if(nums[i]==target){
    			return i;
    		}else if(nums[i]>target){
//    			int[]newNums = new int[nums.length+1];
//    			System.arraycopy(nums, 0, newNums, 0, nums.length);
//    			System.arraycopy(nums, i, nums, i+1, nums.length-i);
//    			newNums[i] = target;
    			return i;
    			
    		}
    	}
        return nums.length;
    }
}