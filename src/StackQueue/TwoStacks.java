package StackQueue;

import java.util.ArrayList;

public class TwoStacks {
	
	public ArrayList<Integer> twoStacksSort(int[] numbers) {
		int len = numbers.length;
		int[] help = new int[len];
		int i =0, j = len;
		int temp;
		while(i < len){
			temp = numbers[i++];
			if (j==len) {
				help[--j] = temp;
			}else if(temp <= help[j]){
				help[--j] = temp;
			}else if(temp > help[j]){
				while(j < len && temp > help[j]){
					numbers[--i] = help[j++];
				}
				help[--j] = temp;
			}
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int m=0;m<len;m++){
			list.add(help[len-m-1]);
		}
		return list;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
