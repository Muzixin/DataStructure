package BinaryTree;

/**
 * @author Azreal 有一棵二叉树，请设计一个算法判断这棵二叉树是否为平衡二叉树。
 *         给定二叉树的根结点root，请返回一个bool值，代表这棵树是否为平衡二叉树。
 *
 */
public class CheckBalance {

	public boolean check(TreeNode root) {
		boolean[] res = new boolean[1];
		res[0] = true;
		getHeight(root, 1, res);
		return res[0];
	}

	private int getHeight(TreeNode root, int level, boolean[] res) {
		if (root == null)
			return level;
		int lH = getHeight(root.left, level + 1, res);
		if (!res[0])
			return level;
		int rH = getHeight(root.right, level + 1, res);
		if (!res[0])
			return level;
		if (Math.abs(lH - rH) > 1)
			res[0] = false;
		return Math.max(lH, rH);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
