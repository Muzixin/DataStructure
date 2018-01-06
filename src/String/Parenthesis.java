package String;

public class Parenthesis {
	
	public boolean chkParenthesis(String A, int n) {
		
		char[] cs = A.toCharArray();
		int count = 0;
		for(int i = 0; i < n; i++){
			if(count < 0) 
				return false;
			else if(cs[i] == '(')
				count++;
			else if(cs[i] == ')')
				count--;
		}
		if (count == 0) {
			return true;
		}else
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
