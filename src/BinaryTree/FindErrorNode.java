package BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Azreal 一棵二叉树原本是搜索二叉树，但是其中有两个节点调换了位置，
 *         使得这棵二叉树不再是搜索二叉树，请找到这两个错误节点并返回他们的值。 保证二叉树中结点的值各不相同。
 *
 */
public class FindErrorNode {
	public int[] findError(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		mid(root, list);
		int[] res = new int[2];
		int count = 0;
		for(int i=0; i<list.size()-1;i++){
			if(list.get(i) > list.get(i+1)){
				if(count == 0)
					res[0] = list.get(i);
				res[1] = list.get(i+1);
				count++;
			}
		}
//		for(int i = list.size()-1; i > 0; i--){
//			if (list.get(i) < list.get(i-1)) {
//				res[0] = list.get(i);
//				break;
//			}
//		}
//		for(int i=0; i<list.size()-1;i++){
//			if(list.get(i) > list.get(i+1)){
//				res[1] = list.get(i);
//				break;
//			}
//		}
		return res;
    }

	private void mid(TreeNode root, List<Integer> list) {
		if (root == null)
			return;
		mid(root.left, list);
		list.add(root.val);
		mid(root.right, list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
