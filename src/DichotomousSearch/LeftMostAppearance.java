package DichotomousSearch;

/**
 * @author Azreal 对于一个有序数组arr，再给定一个整数num，
 * 			请在arr中找到num这个数出现的最左边的位置。 给定一个数组arr及它的大小n，
 * 			同时给定num。请返回所求位置。若该元素在数组中未出现，请返回-1。
 *			[1,2,3,3,4],5,3      返回：2
 */
public class LeftMostAppearance {
	
	public int findPos(int[] arr, int n, int num) {
		if(arr == null)
			return -1;
		int l = 0, h = n-1, res = -1;
		while(l <= h){
			int m = (l + h)/2;
			if(arr[m] > num)
				h = m-1;
			else if(arr[m] < num)
				l = m+1;
			else{
				res = m;
				h = m - 1;
			}
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,3,4};
		LeftMostAppearance leftMostAppearance = new LeftMostAppearance();
		System.out.println(leftMostAppearance.findPos(arr, 5, 3));
	}

}
