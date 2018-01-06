package DichotomousSearch;

/**
 * @author Azreal
 *         对于一个有序循环数组arr，返回arr中的最小值。有序循环数组是指，
 *         有序数组左边任意长度的部分放到右边去，右边的部分拿到左边来。
 *         比如数组[1,2,3,3,4]，是有序循环数组，[4,1,2,3,3]也是。
 *         给定数组arr及它的大小n，请返回最小值
 *			[4,1,2,3,3],5   返回：1
 */
public class MinValue {
	
	public int getMin(int[] arr, int n) {
		if(arr == null || n == 0)
			return -1;
		int l = 0, h = n-1, m = 0;
		while(l < h){
			if(l == h-1)
				break;
			if(arr[l] < arr[h])
				return arr[l];
			m = (l+h)/2;
			if(arr[l] > arr[m]){
				h = m;
				continue;
			}
			if(arr[l] < arr[m]){
				l = m;
				continue;
			}
			while(l < h){
				if(arr[l] == arr[m])
					l++;
				else if(arr[l] < arr[m])
					return arr[l];
				else{
					h = m;
					break;
				}
			}
		}
		return Math.min(arr[l], arr[h]);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinValue minValue = new MinValue();
		int[] arr = {230,365,486,508,101};
		System.out.println(minValue.getMin(arr, 5));
	}

}
