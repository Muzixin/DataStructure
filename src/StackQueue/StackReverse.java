package StackQueue;

import java.util.Stack;

public class StackReverse {
	
	public int[] reverseStack(int[] A, int n) {
        // write code here
		if (A == null) {
			return A;
		}
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = n-1; i >= 0; i--){
			stack.push(A[i]);
		}
		reverse(stack);
		int[] result = new int[n];
		int i = 0;
		while(i < n){
			result[i++] = stack.pop();
		}
		return result;
    }
	
	public static int getlast(Stack<Integer> stack){
		int result = stack.pop();
		if (stack.empty()) {
			return result;
		}else {
			int last = getlast(stack);
			stack.push(result);
			return last;
		}
	}
	
	public static void reverse(Stack<Integer> stack){
		if (stack.empty()) {
			return;
		}
		int i = getlast(stack);
		reverse(stack);
		stack.push(i);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackReverse stackReverse = new StackReverse();
		int[] A = {4,3,2,1};
		int[] result = stackReverse.reverseStack(A, 4);
		for (int i : result) {
			System.out.println(i);
		}
	}

}
