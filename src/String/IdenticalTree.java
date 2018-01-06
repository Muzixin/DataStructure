package String;

class TreeNode {
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;

	public TreeNode(int val) {
		this.val = val;
	}
}

/**
 * @author Azreal 
 * 			对于两棵彼此独立的二叉树A和B，请编写一个高效算法， 
 * 			检查A中是否存在一棵子树与B树的拓扑结构完全相同。
 *         给定两棵二叉树的头结点A和B，请返回一个bool值，代表A中是否存在一棵同构于B的子树。
 */
public class IdenticalTree {

	public boolean chkIdentical(TreeNode A, TreeNode B) {

		String str1 = serialByPre(A);
		String str2 = serialByPre(B);

		return getIndexOf(str1, str2) != -1;

	}

	private int getIndexOf(String s, String m) {
		if (s == null || m == null || m.length() < 1 || s.length() < m.length()) {
			return -1;
		}
		char[] ss = s.toCharArray();
		char[] ms = m.toCharArray();

		int[] nextArr = getNextArr(ms);
		int index = 0;
		int mi = 0;
		while (index < ss.length && mi < ms.length) {
			if (ss[index] == ms[mi]) {
				index++;
				mi++;
			} else if (nextArr[mi] == -1) {
				index++;
			} else {
				mi = nextArr[mi];
			}
		}
		return mi == ms.length ? index - mi : -1;
	}

	private static int[] getNextArr(char[] ms) {
		if (ms.length == 1) {
			return new int[] { -1 };
		}
		int[] nextArr = new int[ms.length];
		nextArr[0] = -1;
		nextArr[1] = 0;
		int pos = 2;
		int cn = 0;
		while (pos < nextArr.length) {
			if (ms[pos - 1] == ms[cn]) {
				nextArr[pos++] = ++cn;
			} else if (cn > 0) {
				cn = nextArr[cn];
			} else {
				nextArr[pos++] = 0;
			}
		}
		return nextArr;
	}

	private String serialByPre(TreeNode head) {
		if (head == null)
			return "#!";
		String res = head.val + "!";
		res += serialByPre(head.left);
		res += serialByPre(head.right);
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] cs = { 'c', 'h', 'i', 'n', 'c', 'h', 'i', 'l', 'l', 'a' };
//		System.out.println(getNextArr(cs));
		for(int a : getNextArr(cs)){
			System.out.println(a);
		}
	}

}
