package ListNode;

/**
 * @author Azreal 有一个整数val，如何在节点值有序的环形链表中插入一个节点值为val的节点，
 * 				并且保证这个环形单链表依然有序。定链表的信息，及元素的值A及对应的nxt指向
 * 				的元素编号同时给定val，请构造出这个环形链表，并插入该值。
 * 				[1,3,4,5,7],[1,2,3,4,0],2  返回：{1,2,3,4,5,7}
 */
public class InsertValue {

	public ListNode insert(int[] A, int[] nxt, int val) {
		if (A.length == 0) {
			ListNode curNode = new ListNode(val);
			return curNode;
		}

		// 构造环形链表
		int len = A.length;
		ListNode head = new ListNode(A[0]);
		ListNode tail = head;
		for (int i = 0; i < len - 1; i++) {
			ListNode curNode = new ListNode(A[nxt[i]]);
			tail.next = curNode;
			tail = curNode;
		}

		ListNode preNode = head;
		ListNode nextNode = preNode.next;
		if (head.val >= val) {
			ListNode curNode = new ListNode(val);
			curNode.next = head;
			return curNode;
		}
		while (nextNode != null && val > nextNode.val) {
			preNode = nextNode;
			nextNode = preNode.next;
		}
		ListNode curNode = new ListNode(val);
		curNode.next = nextNode;
		preNode.next = curNode;

		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertValue insertValue = new InsertValue();
		int[] A = { 1, 3, 5, 6, 7 }, nxt = { 1, 2, 3, 4, 0 };
		ListNode res = insertValue.insert(A, nxt, 4);
		while (res != null) {
			System.out.println(res.val);
			res = res.next;
		}
	}

}
