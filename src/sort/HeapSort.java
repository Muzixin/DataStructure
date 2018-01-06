package sort;

import util.Swap;

public class HeapSort {//堆排序
	
	public int[] heapSort(int[] A, int n) {
        // write code here
        buildHeap(A, n);
        for (int i = n - 1; i >= 0; i--) {
            Swap.swap(A, 0, i);
            adjustHeap(A, 0, i);
        }
        return A;
    }
     
    public void buildHeap(int[] A, int length) {
        for (int i = length / 2; i >= 0; i--) {
            adjustHeap(A, i, length);
        }
    }
     
    public void adjustHeap(int[] A, int index, int length) {
        int temp = A[index];
        for(int j = 2 * index + 1; j < length; j = j * 2 + 1) {
            if(j < length - 1 && A[j] < A[j+1]) j++;
            if(temp > A[j]) break;
            A[index] = A[j];
            index = j;
        }
        A[index] = temp;
    }
     
//    public void swap(int[] A, int i, int j) {
//        int tmp = A[i];
//        A[i] = A[j];
//        A[j] = tmp;
//    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeapSort sort = new HeapSort();
		int A[] = {4, 3, 5, 6, 7};
		int B[] = sort.heapSort(A, 5);
		for (int i = 0; i < B.length; i++) {
			System.out.println(B[i]);
		}
	}

}
