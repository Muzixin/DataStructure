package sort;

public class QuiSort {

	public int[] quickSort(int[] A, int n) {
        // write code here
        quick(A, 0, n - 1);
        return A;
    }
 
    private static int[] quick(int[] A, int low, int high) {
        // TODO Auto-generated method stub
        if (low < high) {
            int mid = sort(A, low, high);
            quick(A, low, mid-1);
            quick(A, mid + 1, high);
        }
        return A;
    }
 
    private static int sort(int[] A, int low, int high) {
        // TODO Auto-generated method stub
        int key = A[low];
        int i = low;
        int j = high;
        if (low < high) { //从右向左找到第一个比key小的值，从左向右找到第一个比key大的值，
            while (i < j) {
                while (i < j && key <= A[j]) {
                    j--;  //从右向左找到第一个比key小的值A[j]
                }
                if (i < j) {
                    A[i] = A[j];//交换值
                }
                while (i < j && A[i] <= key) {
                    i++;  //从左向右找到第一个比key大的值A[i]
                }
                if (i < j) {
                    A[j] = A[i];
                }
            }
            A[i] = key;
        }
        return i;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuiSort sort = new QuiSort();
		int A[] = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
//		int A[] = {4, 2, 5, 6, 7};
		int B[] = sort.quickSort(A, 15);
		for (int i = 0; i < B.length; i++) {
			System.out.println(B[i]);
		}
	}

}
