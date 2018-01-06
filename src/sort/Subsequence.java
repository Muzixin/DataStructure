package sort;

public class Subsequence {
	
	public int shortestSubsequence(int[] A, int n) {
		int count1 = 0, count2 = 0;
		int max = A[0], min = A[n-1];
		for(int i = 0; i < n; i++){
			if (A[i] < max) {
				count1 = i;
			}else{
				max = A[i];
			}
		}
		for(int i = n-1; i >= 0; i--){
			if (A[i] > min) {
				count2 = i;
			}else{
				min = A[i];
			}
		}
		if (count1 == count2) {
			return 0;
		}
		else if (count1 < count2) {
			return count2 - count1 + 1;
		}else{
			return count1 - count2 + 1;
		}
		
        // write code here
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subsequence sort = new Subsequence();
		int[] A = {1,2,3,3,8,9};
		System.out.println(sort.shortestSubsequence(A, 6));

	}

}
