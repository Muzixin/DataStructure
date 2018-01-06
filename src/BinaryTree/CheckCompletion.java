package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Azreal 有一棵二叉树,请设计一个算法判断它是否是完全二叉树。
 *         给定二叉树的根结点root，请返回一个bool值代表它是否为完全二叉树。 树的结点个数小于等于500。
 */
public class CheckCompletion {

	public boolean chk(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        boolean leaf = false;
        TreeNode left, right;
        queue.add(root);
        while(!queue.isEmpty()){
        	TreeNode current = queue.poll();
        	if (!leaf) {
				if(current.left == null || current.right == null){
					if(current.right != null && current.left == null)
						return false;
					else
						leaf = true;
				}
			}else{
				if(current.left != null || current.right != null)
					return false;
			}
        	if(current.left != null)
        		queue.offer(current.left);
        	if(current.right != null)
        		queue.offer(current.right);
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
