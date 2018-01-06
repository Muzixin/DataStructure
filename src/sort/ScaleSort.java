package sort;

import java.util.Arrays;

public class ScaleSort {
	
	 public int[] sortElement(int[] A, int n, int k) {
	        if (n == 0 || n < k)
	            return A;
	        int[] heap = Arrays.copyOf(A, k);
	 
	        //建堆操作
	        for (int i = k / 2 - 1; i >= 0; i--) {
	            // i用于找子元素，len 代表长度,防止子元素越界
	            heapAdjust(heap, i, k);
	        }
	 
	        //当i 到 n-1的时候，后面还剩下 倒数第k 个到末尾这k 个元素没有排序
	        //需要在后面继续排序
	        for(int i=k;i<n;i++){
	            A[i-k] = heap[0];
	            heap[0] = A[i];
	            heapAdjust(heap, 0, k);
	        }
	         
	        //n-1-k+1
	        //最后剩一个堆了，就是普通的堆排序思想往外输出
	        //每次拿最后一个元素和0位置交换。
	        for(int i=n-k;i<n;i++){
	            A[i] = heap[0];//heap[0] 仍然是最小数
	            int temp = heap[0];
	            heap[0] = heap[k-1];
	            heap[k-1] = temp;
	            heapAdjust(heap, 0, --k);//k的长度不断减小
	        }
	        return A;
	 
	    }
	     
	    //调整为小顶堆
	    private void heapAdjust(int[] heap, int parent, int len) {
	         int child = 2*parent+1;
	            while(child<len){
	                //这个 if 判断注意一下，首先子元素不能越界
	                if((child+1)<len && heap[child]>heap[child+1]){
	                    child = child+1;
	                }
	                 
	                if(heap[parent]<heap[child]){
	                    break;
	                }else{
	                    int temp = heap[parent];
	                    heap[parent] = heap[child];
	                    heap[child] = temp;
	                }
	                parent = child;
	                child = 2*parent+1;
	            }
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScaleSort sort = new ScaleSort();
		int A[] = {2,1,4,3,6,5,8,7,10,9};
		int B[] = sort.sortElement(A, 10, 2);
		for (int i = 0; i < B.length; i++) {
			System.out.println(B[i]);
		}
	}

}
