package String;

/**
 * @author Azreal
 * 
 * 			旋转词	
 * 
 *         如果对于一个字符串A，将A的前面任意一部分挪到后边去形成的字符串称为A的旋转词。
 *         比如A="12345",A的旋转词有"12345","23451","34512","45123"和"51234"。
 *         对于两个字符串A和B，请判断A和B是否互为旋转词。
 *         给定两个字符串A和B及他们的长度lena，lenb，请返回一个bool值，代表他们是否互为旋转词。
 */
public class Rotation {
	
	private boolean chkRotation(String A, int lena, String B, int lenb) {
        // write code here
        if (lena != lenb) {
			return false;
		}
		 
		 String C = A + A;
		 return getIndexOf(C, B) != -1;
	    
	}
	
	private int getIndexOf(String A, String B){
		if (A == null || B == null || A.length() < 1|| A.length() < B.length()) {
			return -1;
		}
		
		char[] a = A.toCharArray();
		char[] b = B.toCharArray();
		int[] nextArr = getNextArr(B);
		int indexa = 0, indexb = 0;
		while(indexa < A.length() && indexb < B.length()){
			if(a[indexa] == b[indexb]){
				indexa++;
				indexb++;
			}else if(nextArr[indexb] == -1){
				indexa++;
			}else{
				indexb = nextArr[indexb];
			}
		}
		
		return indexb == B.length() ? indexa - indexb : -1;
		
	}
	
	private static int[] getNextArr(String A){
		
		if (A.length() == 1) {
			return new int[]{-1};
		}
		char[] str = A.toCharArray();
		int[] nextArr = new int[A.length()];
		nextArr[0] = -1;
		nextArr[1] = 0;
		int p = 2, cn = 0;
		while(p < str.length){
			if (str[p-1] == str[cn]) {
				nextArr[p++] = ++cn;
			}else if (cn > 0) {
				cn = nextArr[cn];
			}
			else {
				nextArr[p++] = 0;
			}
		}
		
		return nextArr;
		
	}
	
	public static void main(String[] args) {
		Rotation rotation = new Rotation();
		String A = "cdab", B = "abcd";
		System.out.println(rotation.chkRotation(A, 4, B, 4));
	}
	
}
