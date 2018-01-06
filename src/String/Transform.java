package String;

/**
 * @author Azreal
 *         对于两个字符串A和B，如果A和B中出现的字符种类相同且每种字符出现的次数相同，
 *         则A和B互为变形词，请设计一个高效算法，检查两给定串是否互为变形词。
 *         给定两个字符串A和B及他们的长度，请返回一个bool值，代表他们是否互为变形词。
 */
public class Transform {

	public boolean chkTransform(String A, int lena, String B, int lenb) {

		if (A == null || B == null || lena != lenb) {
			return false;
		}

		char[] str1 = A.toCharArray();
		char[] str2 = B.toCharArray();

		int[] map = new int[256];

		for (char a : str1) {
			map[a]++;
		}
		for (char b : str2) {
			if (map[b]-- == 0) { // str中找到一个字符，在map[]中已经不存在该字符了
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transform transform = new Transform();
		String A = "abc";
		String B = "baa";
		System.out.println(transform.chkTransform(A, 3, B, 3));
	}

}
