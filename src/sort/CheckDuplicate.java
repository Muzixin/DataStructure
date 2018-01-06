package sort;

public class CheckDuplicate {
	
	public boolean chechDuplicate(int[] A, int n){
		int min = A[0];
		int max = A[0];
		for(int a : A){
			min = Math.min(a, min);
			max = Math.max(a, max);
		}
		int len = max - min + 1;
		int[] count = new int[len];
		for(int a : A){
			count[a-min]++;
			if (count[a-min] > 1) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args){
		CheckDuplicate checkDuplicate = new CheckDuplicate();
		int A[] = {1,2,3,4,5,5,6};
		System.out.println(checkDuplicate.chechDuplicate(A, 7));
	}

}
