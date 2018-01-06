package BinaryTree;

import java.util.*;

public class TreeToSequence {
	public int[][] convert(TreeNode root) {
        List<Integer> preList = new LinkedList<>();
        List<Integer> midList = new LinkedList<>();
        List<Integer> aftList = new LinkedList<>();
        pre1(preList, root);
        mid1(midList, root);
        aft1(aftList, root);
        int[][] res = new int[3][preList.size()];
        for(int i = 0; i < preList.size(); i++){
        	res[0][i] = preList.get(i);
        	res[1][i] = midList.get(i);
        	res[2][i] = aftList.get(i);
        }
        return res;
    }
	
	private void pre(List<Integer> list, TreeNode root){
		if(root == null)
			return;
		list.add(root.val);
		pre(list, root.left);
		pre(list, root.right);
	}
	
	private void pre1(List<Integer> list, TreeNode root){
		Stack<TreeNode> stack = new Stack<>();
		stack.add(root);
		while(! stack.empty()){
			root = stack.pop();
			list.add(root.val);
			if (root.right != null) {
				stack.push(root.right);
			}
			if (root.left != null) {
				stack.push(root.left);
			}
		}
	}
	
	private void mid(List<Integer> list, TreeNode root){
		if(root == null)
			return;
		mid(list, root.left);
		list.add(root.val);
		mid(list, root.right);
	}
	
	private void mid1(List<Integer> list, TreeNode root){
		Stack<TreeNode> stack = new Stack<>();
		while(!stack.empty() || root != null){
			if (root != null) {
				stack.push(root);
				root = root.left;
			}else {
				root = stack.pop();
				list.add(root.val);
				root = root.right;
			}
		}
	}
	
	private void aft(List<Integer> list, TreeNode root){
		if(root == null)
			return;
		aft(list, root.left);
		aft(list, root.right);
		list.add(root.val);
	}
	
	private void aft1(List<Integer> list, TreeNode root){
		Stack<TreeNode> stack1 = new Stack<>();
		Stack<TreeNode> stack2 = new Stack<>();
		stack1.add(root);
		while(!stack1.empty()){
			root = stack1.pop();
			stack2.push(root);
			if(root.left != null)
				stack1.push(root.left);
			if(root.right != null)
				stack1.push(root.right);
		}
		while(!stack2.empty()){
			list.add(stack2.pop().val);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
