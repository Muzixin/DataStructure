package ListNode;

/**
 * @author Azreal 实现一个算法，删除单向链表中间的某个结点，假定你只能访问该结点。给定带删除的
 * 				头节点和要删除的数字，请执行删除操作，返回删除后的头结点。链表中没有重复数字  
 */
public class Remove {

	public static ListNode removeNode(ListNode pNode, int delVal) {
	      if (pNode == null) {
	          return null;
	      }
	      if (pNode.val == delVal) {
	          return pNode.next;
	      }
	      ListNode node = pNode;
	      ListNode temp = pNode;
	      while (node != null) {
	          //这里就是复制后一个节点，然后删除后一个节点的做法
	          if (node.val == delVal && node.next != null) {
	              node.val = node.next.val;
	              node.next = node.next.next;
	              break;
	          }
	          //然而到尾节点还是不灵光的啦，一定需要前节点
	          else if (node.val == delVal && node.next == null) {
	              temp.next = null;
	              break;
	          }
	          temp = node;
	          node = node.next;
	 
	      }
	      return pNode;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remove remove = new Remove();
		ListNode pNode = new ListNode(1);
		pNode.next = new ListNode(2);
		pNode.next.next = new ListNode(3);
		pNode.next.next.next = new ListNode(4);
		ListNode res = remove.removeNode(pNode, 2);
		while(pNode != null){
			System.out.println(pNode.val);
			pNode = pNode.next;
		}
	}

}
