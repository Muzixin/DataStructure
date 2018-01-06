package ListNode;

/**
 * @author Azreal 复制一个复杂链表（每个节点中有节点值，以及两个指针，
 * 		 一个指向下一个节点，另一个特殊指针指向任意一个节点）。
 *
 */
public class Solution {
	
	public RandomListNode Clone(RandomListNode pHead) {
		
		if(pHead == null)
			return null;
		RandomListNode cur = pHead;
		RandomListNode next = null;
		while(cur != null){
			next = cur.next;
			cur.next = new RandomListNode(cur.label);
			cur.next.next = next;
			cur = next;
		}
		cur = pHead;
		RandomListNode curCopy = null;
		while(cur != null){
			next = cur.next.next;
			curCopy = cur.next;
			curCopy.random = cur.random != null ? cur.random.next : null;
			cur =  next;
		}
		RandomListNode res = pHead.next;
		cur = pHead;
		while(cur != null){
			next = cur.next.next;
			curCopy = cur.next;
			cur.next = next;
			curCopy.next = next != null ? next.next : null;
			cur = next;
		}
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
