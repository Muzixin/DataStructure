package String;

/**
 * @author Azreal 对于一个字符串，请设计一个算法，将字符串的长度为len的前缀平移到字符串的最后。
 *         给定一个字符串A和它的长度，同时给定len，请返回平移后的字符串。
 */
public class Translation {
	
	public String stringTranslation(String A, int n, int len) {
		
		char[] c = A.toCharArray();
		reverse(c, 0, n-1);
		reverse(c, 0, n-len-1);
		reverse(c, n-len, n-1);
		return String.valueOf(c);
    }
	
	private void reverse(char[] c, int l, int h){
		while(l < h){
			char temp = c[l];
			c[l++] = c[h];
			c[h--] = temp;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Translation translation = new Translation();
		String A = "ABCDE";
		System.out.println(translation.stringTranslation(A, 5, 3));
	}

}
