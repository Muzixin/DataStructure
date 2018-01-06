package ListNode;

/**
 * @author Azreal 现在有一个单链表。链表中每个节点保存一个整数，再给定一个值val，
 * 			把所有等于val的节点删掉。 给定一个单链表的头结点head，同时给定一个值val，
 * 			请返回清除后的链表的头结点，保证链表中有不等于该值的其它值。请保证其他元素
 * 			的相对顺序。
 * 			{1,2,3,4,3,2,1},2   {1,3,4,3,1}
 */
public class ClearValue {

	public ListNode clear(ListNode head, int val) {

		ListNode cur = head;
		ListNode pre = cur;

		while (head != null && head.val == val) {
			head = head.next;
			cur = head;
			pre = cur;
		}

		while (cur.next != null) {
			cur = cur.next;
			if (cur.val == val) {
				if (cur.next == null)
					pre.next = null;
				else {
					pre.next = cur.next;
					cur = pre;
				}
			}
			pre = cur;
		}
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 3, 2, 1 };
		ListNode head = ListNode.getListNode(arr);
		ClearValue clearValue = new ClearValue();
		ListNode res = clearValue.clear(head, 2);
		ListNode.print(head);
	}

}
