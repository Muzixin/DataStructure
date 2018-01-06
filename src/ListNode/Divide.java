package ListNode;

/**
 * @author Azreal
 *         对于一个链表，我们需要用一个特定阈值完成对它的分化，使得小于等于这个值的结点移到前面，
 *         大于该值的结点在后面，同时保证两类结点内部的位置关系不变。 给定一个链表的头结点head，
 *         同时给定阈值val，请返回一个链表，使小于等于它的结点在前，大于等于它的在后，保证结点
 *         值不重复。
 *			{1,4,2,5},3      {1,2,4,5}
 */
public class Divide {

	public ListNode listDivide(ListNode head, int val) {
		ListNode lH = null;
		ListNode lT = null;
		ListNode rH = null;
		ListNode rT = null;
		ListNode next = null;

		while (head != null) {
			next = head.next;
			head.next = null;
			if (head.val <= val) {
				if (lH == null) {
					lH = head;
					lT = head;
				} else {
					lT.next = head;
					lT = head;
				}
			} else {
				if (rH == null) {
					rH = head;
					rT = head;
				} else {
					rT.next = head;
					rT = head;
				}
			}
			head = next;
		}
		if (lT != null) {
			lT.next = rH;
		}

		return lH != null ? lH : rH;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divide divide = new Divide();
		ListNode head = new ListNode(1);
		head.next = new ListNode(4);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(5);
		ListNode res = divide.listDivide(head, 3);
		while (res != null) {
			System.out.println(res.val);
			res = res.next;
		}

	}

}
