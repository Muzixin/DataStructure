package sort;

public class BubbleSort {
	public int[] Sort(int[] A, int n){
		int last = n, count = 0;
		if (last != 1) {
			for(int i = 0; i<n; i++){
				for(int j=i+1; j<n;j++){
					if (A[i] > A[j]) {
						int temp = A[j];
						A[j] = A[i];
						A[i] = temp;
						count++;
						last = j;
					}
				}
			}
			System.out.println(count+"**********");
		}
		
		return A;
		
	}
	
	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
		//int A[] = {8, 5, 7, 3, 6};
		int A[] = {4, 3, 5, 6, 7};
		int B[] = sort.Sort(A, 5);
		for (int i = 0; i < B.length; i++) {
			System.out.println(B[i]);
		}
	}

}
