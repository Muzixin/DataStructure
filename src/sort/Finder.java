package sort;

public class Finder {
	
	public boolean findX(int[][] mat, int n, int m, int x){
		
		int i = n-1, j = 0;
		
		for(;i>=0 && j<m;){
			if (mat[i][j] == x) {
				return true;
			}
			if (mat[i][j] > x) {
				i--;
			}else {
				j++;
			}
			
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
