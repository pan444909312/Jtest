package com.leetcode.pjx;

import java.util.LinkedList;
import java.util.List;

/**
 * �������
 * 
 * @author Administrator
 *
 */
public class Subject002 {

}

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode sum = null;
		ListNode newNode = sum;

		while (l1 != null || l2 != null) {
			if(newNode==null){
				newNode = new ListNode(0);
			}
			int x = (l1 == null) ? 0 : l1.val;
			int y = (l2 == null) ? 0 : l2.val;
			newNode.val += x;
			newNode.val += y;
			
			if (newNode.val >= 10) {
				newNode.val = newNode.val % 10;
				newNode.next = new ListNode(1);
			} 
			
			if(l1!=null){
				l1 = l1.next;
			}
			if(l2!=null){
				l2 = l2.next;
			}

			newNode = newNode.next;
		}

		return sum;
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}