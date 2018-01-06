package StackQueue;

import java.util.Stack;

/**
 * @author Azreal 
 * 		       编写一个类,只能用两个栈结构实现队列,支持队列的基本操作(push，pop)。
 *         给定一个操作序列ope及它的长度n，其中元素为正数代表push操作，
 *         为0代表pop操作，保证操作序列合法且一定含pop操作，请返回pop的结果序列。
 */
public class TwoStack {

	public int[] twoStack(int[] ope, int n) {
		
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> temp = new Stack<Integer>(); 
		int count = 0;
		for(int x : ope){
			if(x > 0)
				stack.push(x);
			else
				count++;
		}
		while(!stack.empty()){
			temp.push(stack.pop());
		}
		int i = 0;
		int[] result = new int[count];
 		while(count > 0){
			result[i++] = (int)temp.pop();
			count--;
		}
 		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoStack stack = new TwoStack();
		int[] ope = {287,202,181,156,0};
		int[] result = stack.twoStack(ope, 5);
		for (int i : result) {
			System.out.println(i);
		}
	}

}
