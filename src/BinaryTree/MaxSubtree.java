package BinaryTree;

/**
 * @author Azreal 有一棵二叉树，其中所有节点的值都不一样,找到含有节点最多 
 * 					的搜索二叉子树,并返回这棵子树的头节点.
 *
 */
public class MaxSubtree {

	public TreeNode getMax(TreeNode root) {
		if(root==null){
            return null;
        }
        int[]ret=new int[3];
        return postOrder(root,ret);
	}

	private TreeNode postOrder(TreeNode root, int[] ret){
		if (root == null) {
			ret[0] = Integer.MIN_VALUE;
			ret[1] = Integer.MAX_VALUE;
			ret[2] = 0;
			return null;
		}
		TreeNode lNode = postOrder(root.left, ret);
		int lmin = ret[0];
		int lmax = ret[1];
		int lnum = ret[2];
		TreeNode rNode = postOrder(root.right, ret);
		int rmin = ret[0];
		int rmax = ret[1];
		int rnum = ret[2];
		
		ret[0] = Math.max(rmax, root.val);
		ret[1] = Math.min(lmin, root.val);
		
		if(lNode == root.left && rNode == root.right
				&& lmax < root.val && rmin > root.val){
			ret[2] = rnum + lnum + 1;
			return root;
		}
		
		ret[2] = Math.max(lnum, rnum);
		return rnum > lnum ? rNode : lNode; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
