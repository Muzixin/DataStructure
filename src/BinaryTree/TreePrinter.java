package BinaryTree;

import java.util.*;

/**
 * @author Azreal 有一棵二叉树，请设计一个算法，按照层次打印这棵二叉树。
 *         给定二叉树的根结点root，请返回打印结果，结果按照每一层一个数组进行储存，
 *         所有数组的顺序按照层数从上往下，且每一层的数组内元素按照从左往右排列。
 *         保证结点数小于等于500。
 */
public class TreePrinter {

	public int[][] printTree(TreeNode root) {
        // write code here
        LinkedList<TreeNode> treeNodeList= new LinkedList<TreeNode>();
        TreeNode last = root;
        TreeNode nlast = root;
        treeNodeList.add(root);
         
        List<List<Integer>> outList = new ArrayList<List<Integer>>();
        List<Integer> inList = new ArrayList<Integer>();
         
         
        while(!treeNodeList.isEmpty()){
            TreeNode present = treeNodeList.getFirst();
            if(present.left != null){
                treeNodeList.addLast(present.left);
                nlast = present.left;
            }
            if(present.right != null){
                treeNodeList.addLast(present.right);
                nlast = present.right;
            }
             
            inList.add(present.val);
            treeNodeList.remove();
             
            if(present.equals(last)){
                last = nlast;
                outList.add(inList);
                inList = new ArrayList<Integer>();
            }
        }
         
        int[][] treeValue = new int[outList.size()][];
         
        for(int i=0; i < outList.size(); i++){
            treeValue[i] = new int[outList.get(i).size()];
            for(int j = 0; j < outList.get(i).size(); j++){
                treeValue[i][j] = outList.get(i).get(j).intValue();
            }
        }
        return treeValue;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
