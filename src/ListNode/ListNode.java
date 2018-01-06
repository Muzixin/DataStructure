package ListNode;

public class ListNode {
	int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
    
    public static ListNode getListNode(int[] arr){
    	ListNode head = new ListNode(arr[0]);
    	ListNode tail = head;
    	for(int i = 1; i < arr.length; i++){
    		ListNode next = new ListNode(arr[i]);
    		tail.next = next;
    		tail = next;
    	}
    	return head;
    }
    
    public static void print(ListNode head){
    	while(head != null){
    		System.out.println(head.val);
    		head = head.next;
    	}
    }
}
