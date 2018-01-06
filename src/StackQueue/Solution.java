package StackQueue;

import java.util.Stack;

/**
 * @author Azreal
 *			定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 */
public class Solution {
	
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();
	
	public void push(int node){
		stack.push(node);
		if (minStack.empty() || minStack.peek() >= node) {
			minStack.push(node);
		}else{
			minStack.push(minStack.peek());
		}
	}
	
	public void pop(){
		if(stack.empty()){
			throw new RuntimeException("Your stack is empty!");
		}
		minStack.pop();
		stack.pop();
	}
	
	public int top(){
		return stack.peek();
	}
	
	public int min(){
		if (minStack.empty()) {
			throw new RuntimeException("Your stack is empty!");
		}
		return minStack.peek();
	}
 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
