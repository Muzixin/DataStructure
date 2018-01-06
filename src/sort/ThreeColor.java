package sort;

public class ThreeColor {
	
	public int[] sortThreeColor(int[] A, int n){
		
		int l = 0, h = n-1, temp = 0;
		for(int i=0; i<n; i++){
			if(h < i) break;
			if(A[i] < 1){
				temp = A[i];
				A[i] = A[l];
				A[l++] = temp; 
			}
			if (A[i] > 1) {
				temp = A[i];
				A[i] = A[h];
				A[h--] = temp;
				i--;
			}
			
		}
		
		return A;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeColor sort = new ThreeColor();
		int[] A = {0,1,1,0,2,2};
		int[] B = sort.sortThreeColor(A, 6);
		for(int b : B){
			System.out.println(b);
		}
		
	}

}
