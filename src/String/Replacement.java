package String;

/**
 * @author Azreal
 *         请编写一个方法，将字符串中的空格全部替换为“%20”。
 *         假定该字符串有足够的空间存放新增的字符，并且知道字符串的真实长度(小于等于1000)，
 *         同时保证字符串由大小写的英文字母组成。
 *         给定一个string iniString 为原始的串，以及串的长度 int len, 返回替换后的string。
 */
public class Replacement {
	
	private String replaceSpace(String iniString, int length){
		char[] cs = iniString.toCharArray();
		int count = 0;
		for(char c : cs){
			if(c == ' ')
				count ++;
		}
		char[] cs2 = new char[length+count*2];
		for(int i = length+count*2-1, j = length-1; i >= 0 && j >= 0;i--, j--){
			if(cs[j] != ' '){
				cs2[i] = cs[j];
			}
			else {
				cs2[i--] = '0';
				cs2[i--] = '2';
				cs2[i] = '%';
			}
		}
		return String.valueOf(cs2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Replacement replacement = new Replacement();
		String str = "Mr John Smith";
		System.out.println(replacement.replaceSpace(str, 13));
	}

}
