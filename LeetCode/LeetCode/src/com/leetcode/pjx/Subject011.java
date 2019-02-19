package com.leetcode.pjx;

/**
 * ʢ���ˮ������
 * 
 * @author Administrator
 *
 */
public class Subject011 {

}
/**
 * ʱ�临�Ӷ�O(n)
 * �ռ临�Ӷ�O(1)
 * @author Administrator
 *
 */
class Solution11new {
	public int maxArea(int[] height) {
		if (height.length < 2) {
			throw new RuntimeException("n��ֵ����Ϊ2");
		}
		int max = 0;
		int first = 0;
		int last = height.length - 1;
		while (first < last) {
			int temp = 0;
			if (height[first] > height[last]) {
				temp = (last-first)*height[last];
				last--;
			}else{
				temp = (last-first)*height[first];
				first++;
			}
			if(temp>max){
				max = temp;
			}
		}
		return max;
	}
}
/**
 * �����㷨
 * ʱ�临�Ӷ�O(n^2)
 * �ռ临�Ӷ�O(1)
 * @author Administrator
 *
 */
class Solution11 {
	public int maxArea(int[] height) {
		if (height.length < 2) {
			throw new RuntimeException("n��ֵ����Ϊ2");
		}
		int max = 0;

		for (int i = 0; i < height.length; i++) {
			for (int j = i; j < height.length; j++) {
				int temp = 0;
				if (height[j] > height[i]) {
					temp = (j - i) * height[i];
				} else {
					temp = (j - i) * height[j];
				}
				if (temp > max) {
					max = temp;
				}
			}
		}
		return max;
	}
}