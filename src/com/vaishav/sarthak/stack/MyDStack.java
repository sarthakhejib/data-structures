package com.vaishav.sarthak.stack;

public class MyDStack {

	int capacity=2;
	int stack[]=new int[capacity];
	int top=0;

	public void push(int data) {	
		if(size()==capacity)
			expand();
		stack[top]=data;
		top++;		
	}

	private void expand() {
		int size=size();
		int newStack[]=new int[capacity*2];
		System.arraycopy(stack, 0, newStack, 0, size);
		stack=newStack;
		capacity *=2;
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

		shrink();
		return data;		
	}

	private void shrink() {
		int size=size();
		if(size<=(capacity/2)/2)
			capacity=capacity/2;
		int newStack[]=new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, size);
		stack=newStack;


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







