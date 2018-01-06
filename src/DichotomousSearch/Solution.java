package DichotomousSearch;

/**
 * @author Azreal
 *         定义局部最小的概念。arr长度为1时，arr[0]是局部最小。arr的长度为N(N>1)时，
 *         如果arr[0]<arr[1]，那么arr[0]是局部最小；如果arr[N-1]<arr[N-2]，
 *         那么arr[N-1]是局部最小；如果0<i<N-1，既有arr[i]<arr[i-1]又
 *         有arr[i]<arr[i+1]，那么arr[i]是局部最小。
 *         给定无序数组arr，已知arr中任意两个相邻的数都不相等，写一个函数，
 *         只需返回arr中任意一个局部最小出现的位置即可。
 *
 */
public class Solution {
	
	public int getLessIndex(int[] arr) {
		int len = arr.length;
		if(arr == null || len == 0)
			return -1;
		if(len == 1 || arr[0]<arr[1])
			return 0;
		if(arr[len-1] < arr[len-2])
			return len-1;
		int l = 1, h = len-2;
		while(l < h){
			int m = (l+h)/2;
			if(arr[m] > arr[m-1])
				h = m-1;
			else if(arr[m] > arr[m+1])
				l = m+1;
			else
				return m;
		}
		return l;
    }
	
	
	public static void main(String[] args) {
		int[] arr = {3,2,9,2,1,4,0,10,9,0,8,3,5,6,7,1,9,2,4,0,7};
		Solution solution = new Solution();
		System.out.println(solution.getLessIndex(arr));
	}
}
