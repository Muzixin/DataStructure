package sort;

public class MergeAB {
	
	public int[] mergeAB(int[] A, int[] B, int n, int m){
		int i=n-1, j=m-1;
		for(; i>=0 && j>=0;){
			if (A[i] > B[j]) {
				A[i+j+1] = A[i];
				i--;
			}
			else {
				A[i+j+1] = B[j];
				j--;
			}
		}
		
		while(j >= 0){
			A[j] = B[j];
			j--;
		}
		
		return A;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeAB mergeAB = new MergeAB();
		int[] A = {3,5,7,9,0,0,0};
		int[] B = {2,4,6};
		int[] C = mergeAB.mergeAB(A, B, 4, 3);
		for (int i : C) {
			System.out.println(i);
		}
	}

}
