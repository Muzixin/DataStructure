package String;

/**
 * @author Azreal
 *         对于一个字符串，请设计一个算法，只在字符串的单词间做逆序调整，
 *         也就是说，字符串由一些由空格分隔的部分组成，你需要将这些部分逆序。
 *         给定一个原字符串A和他的长度，请返回逆序后的字符串。
 */
public class Reverse {

	public String reverseSentence(String A, int n) {
		
		if (n == 0 || A == null) {
			return A;
		}
		char[] c = A.toCharArray();
		reverse(c, 0, n-1);
		reverseWord(c);
		return String.valueOf(c);
	}
	
	private static void reverseWord(char[] c){
		int start = -1, end = -1;
		for(int i = 0; i < c.length; i++){
			if(c[i] != ' '){
				start = i==0 || c[i-1]==' ' ? i : start;
				end = i == c.length-1 || c[i+1]==' ' ? i : end;
			}
			if (start != -1 && end != -1) {
				reverse(c, start, end);
				start = -1;
                end = -1;
				
			}
		}
	}
	
	private static void reverse(char[] c, int l, int h){
		while(l < h){
			char temp = c[l];
			c[l++] = c[h];
			c[h--] = temp;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "dog loves pig";
		Reverse reverse = new Reverse();
		System.out.println(reverse.reverseSentence(A, 13));

	}

}
