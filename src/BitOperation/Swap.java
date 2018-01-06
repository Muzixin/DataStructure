package BitOperation;

public class Swap {

	public int[] getSwap(int[] num) {
		
		num[0] = num[0] ^ num[1];
		num[1] = num[0] ^ num[1];
		num[0] = num[0] ^ num[1];
		
		return num;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
