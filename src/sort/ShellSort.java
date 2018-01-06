package sort;

public class ShellSort {
	
	public int[] shellSort(int[] A, int n) {
        int h = 1, j = 0;
        while(h < n / 3) h = 3 * h + 1;
        while(h >= 1) {
            for(int i = h; i < n; i = i + h) {
                int temp = A[i];
                for(j = i; j >= h && temp < A[j - h]; j -= h)
                    A[j] = A[j - h];
                A[j] = temp;
            }
            h = h / 3;
        }
        return A;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShellSort sort = new ShellSort();
		int A[] = {1,2,3,5,2,3,6,9,4,2,6,7,5,1,9,3};
		int B[] = sort.shellSort(A, 16);
		for (int i = 0; i < B.length; i++) {
			System.out.println(B[i]);
		}
	}

}
