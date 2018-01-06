package String;

/**
 * @author Azreal 
 * 			对于一个给定的字符串数组，请找到一种拼接顺序， 
 * 			使所有小字符串拼接成的大字符串是所有可能的拼接中字典序最小的。
 *         	给定一个字符串数组strs，同时给定它的大小，请返回拼接成的串。
 */
public class Prior {
	
	public String findSmallest(String[] strs, int n) {
		
		for(int i=n-1; i>0;i--){
			for(int j=0; i<i;j++){
				if (compare(strs[j], strs[j+1]) > 0) {
					String temp = strs[j];
					strs[j] = strs[j+1];
					strs[j+1] = temp;
				}
			}
			
		}
		
		StringBuffer str = new StringBuffer();
		for(String string : strs){
			str.append(string);
		}
		
		return str.toString();
    }
	
	private int compare(String a, String b){
		return (a+b).compareTo(b+a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
