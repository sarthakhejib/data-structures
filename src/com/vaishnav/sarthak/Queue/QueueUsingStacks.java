package com.vaishnav.sarthak.Queue;
import java.util.Stack;

public class QueueUsingStacks {

	Stack<Integer> s1=new Stack<>();
	Stack<Integer> s2=new Stack<>();
	int size=0,data,top=0;
	
	public void enQueue(int data) {
		s1.push(data);		
		top++;
		size++;
	}
	
	public int deQueue() {
		if(s1.isEmpty())		{
			System.out.println("Under flow!");			
		}
		while(!s1.isEmpty()){
			top--;	
		s2.push(s1.pop());
		size--;
		}				
		
		
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
			
		}
		return s2.pop();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	QueueUsingStacks qs=new QueueUsingStacks();
		qs.enQueue(9);
		qs.enQueue(24);
		qs.enQueue(43);
		qs.enQueue(11);
		qs.enQueue(5);
		
		System.out.println(qs.deQueue());
		System.out.println(qs.deQueue());
		System.out.println(qs.deQueue());
		
		qs.enQueue(1);
		qs.enQueue(91);
		
		System.out.println(qs.deQueue());
		
		qs.enQueue(20);
		
		System.out.println(qs.deQueue());
		
	}

}
