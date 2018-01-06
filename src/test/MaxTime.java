package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxTime {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		int pt=0;
		ArrayList<Integer> ar = new  ArrayList<Integer>();
		for(int i=0;i<n;i++){
			ar.add(new Integer(sc.nextInt()));
		}
		Collections.sort(ar);
		//System.out.println(ar);
		int i;
		for(i=0;i<ar.size()&&t-ar.get(i)>0;i++){
			t-=ar.get(i);
			pt+=ar.get(i);
		}
		if(i<ar.size()){
			pt+=ar.get(n-1);
		}
		System.out.println(pt);
	}
}