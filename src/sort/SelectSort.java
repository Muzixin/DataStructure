package sort;

public class SelectSort {
	public int[] Sort(int[] A, int n){
		for(int i=0; i<n-1; i++){
			//int mix = A[i];
			for(int j=i+1; j<n-1; j++){
				if (A[i] > A[j]) {
					int temp = A[j];
					A[j] = A[i];
					A[i] = temp;
				}
			}
		}
		
		
		return A;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectSort sort = new SelectSort();
		int A[] = {4, 3, 5, 6, 7};
		int B[] = sort.Sort(A, 5);
		for (int i = 0; i < B.length; i++) {
			System.out.println(B[i]);
		}
	}

}
