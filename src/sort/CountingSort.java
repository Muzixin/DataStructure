package sort;

public class CountingSort {
	
	public int[] countingSort(int[] A, int n) {
        // write code here
        //找最大最小值，建桶
        int min = A[0];
        int max = A[0];
        for(int a : A){
            min = Math.min(a,min);
            max = Math.max(a,max);
        }     
        int bucketLength = max-min+1;
        int[] bucket = new int[bucketLength];
        //放内容
        for(int a : A){
            bucket[a-min]++;// 对应的桶计数加一
        }
        //倒出内容
        int index = 0;
        for(int i = 0; i < bucketLength; i++){
            for(int j = 0; j < bucket[i]; j++){
                A[index++] = i+min;
            }
        }
        return A;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountingSort sort = new CountingSort();
//		int A[] = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
		int A[] = {4, 2, 5, 6, 7};
		int B[] = sort.countingSort(A, 15);
		for (int i = 0; i < B.length; i++) {
			System.out.println(B[i]);
		}
	}

}
