package com.vaishav.sarthak.stack;

public class MyStack {

	int stack[]=new int[15];
	int top=0;
	public void push(int data) {		
		stack[top]=data;
		top++;		
	}
	
	public void show() {
		for(int a: stack) {
			System.out.println(a+" ");			
		}
	}
	
	public int pop() {
	int data;
		top--;
		data=stack[top];
		stack[top]=0;
	return data;		
	}
	
	public int peek() {
		int data;
		top--;
		data=stack[top-1];
		return data;		
	}

	public boolean checkPalindromeArray(String string[]) {
		int i=0;
		int j=string.length;

		while(i<j && string[i]==string[j] ) {
			i++;
			j--;			
		}
		if(i<j) {
			return false;
		}
		else {
			return true;
		}
	}

//	public boolean isPalindrome() {
//
//		String stack[]=new String[10];
//		while() {}
//
//
//		return true;
//	}
	
	public int size() {
		return top;
	}

	public boolean isEmpty() {
		if(top==0) {
			return  true;
		}
		else {
			return false;
		}		
	}
}


