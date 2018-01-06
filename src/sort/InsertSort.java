package sort;

public class InsertSort {
	public int[] Sort(int[] A, int n){
		int j;
		for(int i=1;i<n;i++){
			int temp = A[i];
			for(j=i-1; j>=0 && temp<A[j]; j--){
				A[j+1] = A[j];
			}
			A[j+1] = temp;
		}
		
		return A;
		
	}
	
	public static void main(String[] args) {
		InsertSort sort = new InsertSort();
		//int A[] = {8, 5, 7, 3, 6};
		int A[] = {4, 3, 5, 6, 7};
		int B[] = sort.Sort(A, 5);
		for (int i = 0; i < B.length; i++) {
			System.out.println(B[i]);
		}
	}

}
