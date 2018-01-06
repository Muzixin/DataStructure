package sort;

public class MergeSort {
	public int[] mergeSort(int[] A, int n) {
 		Sort(A, 0, n-1);
		return A;
	}
	
	public void Sort(int[] data, int l, int h){
		if (l < h) {
			int m = (l + h)/2;
			Sort(data, l, m);
			Sort(data, m+1, h);
			merge(data, l, m, h);
		}
		
	}
	
	public int[] merge(int[] data, int l,int m, int h){
		
		int[] tempArr = new int[h-l+1];
		int lindex = l;
		int hindex = m+1;
		int tempindex = 0;
		
		while(lindex <= m && hindex <= h){
			if (data[lindex] > data[hindex]) {
				tempArr[tempindex++] = data[hindex++];
			}else {
				tempArr[tempindex++] = data[lindex++];
			}
		}
		
		while(lindex <= m){
			tempArr[tempindex++] = data[lindex++];
		}
		
		while(hindex <= h){
			tempArr[tempindex++] = data[hindex++];
		}
		
		int temp = 0;
		while((l+temp) <= h){
			data[l+temp] = tempArr[temp];
			temp++;
		}
				
		return data;
		
	} 
 	
	public static void main(String[] args) {
		MergeSort sort = new MergeSort();
		int A[] = {8, 5, 7, 3, 6};
//		int A[] = {4, 2, 5, 6, 7};
		int B[] = sort.mergeSort(A, 5);
		for (int i = 0; i < B.length; i++) {
			System.out.println(B[i]);
		}
	}

}
