package DichotomousSearch;

/**
 * @author Azreal
 * 			有一个有序数组arr，其中不含有重复元素，请找到满足arr[i]==i条件的最左的位置。
 * 			如果所有位置上的数都不满足条件，返回-1。 给定有序数组arr及它的大小n，请返回所求值。
 *			[-1,0,2,3],4   返回：2
 */
public class FindLef {
	
	public int findPos(int[] arr, int n) {
        if(arr == null || arr[0]>0 || arr[n-1] < n-1)
        	return -1;
        int l = 0, h = n-1, res = -1;
        while(l <= h){        	
        	int m = (l+h)/2;
        	if(arr[m] < m)
        		l = m+1;
        	else if(arr[m] > m)
        		h = m-1;
        	else{
        		res = m;
        		h = m-1;
        	}
        }
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
