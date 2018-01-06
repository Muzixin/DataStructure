package DichotomousSearch;

/**
 * @author Azreal 给定一棵完全二叉树的根节点root，返回这棵树的节点个数。
 * 				如果完全二叉树的节点数为N，请实现时间复杂度低于O(N)的解法。
 * 				给定树的根结点root，请返回树的大小。
 */
public class CountNodes {
	
	public int count(TreeNode root) {
		if(root == null)
			return 0;
		return bs(root, 1, mostLeftLevel(root, 1));
    }
	
	private int bs(TreeNode node, int l, int h){
		if(l==h){
			return l;
		}
		if(mostLeftLevel(node.right, l+1) == h){
			return (l << (h-l)) + bs(node.right, l+1, h);
		}else{
			return (l << (h-l-1)) + bs(node.left, l+1, h);
		}
	}
	
	private int mostLeftLevel(TreeNode node, int level){
		while(node != null){
			level++;
			node = node.left;
		}
		return level-1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
