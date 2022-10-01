package com.vaishav.sarthak.stack;

import java.util.Stack;

public class InsertElementAtBottom {



	
	static void  print(Stack<Integer> s) {
		for(int i:s) {
			System.out.println(s.peek());
		}
	}
	
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(4);
		s.push(2);
		s.push(9);
		s.push(5);
		s.push(3);
		int element =0, count=0;
		solve(s,element,count);
		print(s);
		
		
	}

}
