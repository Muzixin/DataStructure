package sort;

public class MaxGap {
	public int maxGap(int[] A, int n) {
		if (A == null || A.length <=1) {
			return 0;
		}
		int len = A.length;
		int min = A[0], max = A[0];
		for(int a : A){
			min = Math.min(a, min);
			max = Math.max(a, max);
		}
		if (min == max) {
			return 0;
		}
		boolean[] hasNum = new boolean[len + 1];
		int[] mins = new int[len + 1];
		int[] maxs = new int[len + 1];
		int bid = 0;
		for(int i=0; i < len ; i++){
			bid = bucket(A[i], len, min, max);
			mins[bid] = hasNum[bid] ? Math.min(mins[bid], A[i]) : A[i];
			maxs[bid] = hasNum[bid] ? Math.max(maxs[bid], A[i]) : A[i];
			hasNum[bid] = true;
		}
		int res = 0;
		int lastMax = 0, i=0;
		while(i <= len){
			if (hasNum[i++]) {
				lastMax = maxs[i-1];
				break;
			}
		}
		for(;i <= len; i++){
			if (hasNum[i]) {
				res = Math.max(res, mins[i] - lastMax);
				lastMax = maxs[i];
			}
		}
		
		
		return res;
        // write code here
    }
	
	public int bucket(int num, int len, int min, int max){
		return (int)((num-min)*len) / (max-min);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxGap maxGap = new MaxGap();
		int[] A = {1,2,5,4,6};
		System.out.println(maxGap.maxGap(A, 5));

	}

}
