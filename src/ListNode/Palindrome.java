package ListNode;

import java.util.Stack;

/**
 * @author Azreal
 *			给定一个链表ListNode* pHead，请返回一个bool，代表链表是否为回文。
 */
public class Palindrome {
	
	public boolean isPalindrome(ListNode pHead) {
		Stack<Integer> stack = new Stack<>();
		ListNode curNode = pHead;
		while(curNode != null){
			stack.push(curNode.val);
			curNode = curNode.next;
		}
		while(pHead != null){
			if (pHead.val != stack.pop()) {
				return false;
			}
			pHead = pHead.next;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome palindrome = new Palindrome();
		int[] arr = {1,2,3,2,2};
		ListNode pHead = ListNode.getListNode(arr);
		boolean flag = palindrome.isPalindrome(pHead);
		System.out.println(flag);
	}

}
