package BinaryTree;

import java.util.*;
/**
 * @author Azreal 请把纸条竖着放在桌⼦上，然后从纸条的下边向上⽅对折，压出折痕后再展
 *         开。此时有1条折痕，突起的⽅向指向纸条的背⾯，这条折痕叫做“下”折痕 ；
 *         突起的⽅向指向纸条正⾯的折痕叫做“上”折痕。如果每次都从下边向上⽅
 *         对折，对折N次。请从上到下计算出所有折痕的⽅向。
 *		       给定折的次数n,请返回从上到下的折痕的数组，
 *		       若为下折痕则对应元素为"down",若为上折痕则为"up".
 */
public class FoldPaper {

	public String[] foldPaper(int n) {
		List<String> list = new ArrayList<>();
		fold(1, n, true, list);
		String[] res = new String[list.size()];
		for (int i = 0; i < res.length; i++) {
			res[i] = list.get(i);	
		}
		return res;
	}
	
	private void fold(int i, int n, boolean down, List<String> list){
		if(i > n)
			return;
		fold(i+1, n, true, list);
		list.add(down? "down" : "up");
		fold(i+1, n, false, list);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoldPaper foldPaper = new FoldPaper();
		String[] res = foldPaper.foldPaper(3);
		for (String string : res) {
			System.out.println(string + ",");
		}
	}

}
