package BinaryTree;

/**
 * @author Azreal
 *         从二叉树的节点A出发，可以向上或者向下走，但沿途的节点只能经过一次，
 *         当到达节点B时，路径上的节点数叫作A到B的距离。对于给定的一棵二叉树，
 *         求整棵树上节点间的最大距离。
 *
 */
public class LongestDistance {
	
	private int longest = 0;
	
	public int findLongest(TreeNode root) {
		findDist(root);
		return longest;
	}
	
	private int findDist(TreeNode root){
		if(root == null)
			return 0;
		int left = findDist(root.left);
		int right = findDist(root.right);
		longest = Math.max(left+right+1, longest);
		return Math.max(left, right)+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
