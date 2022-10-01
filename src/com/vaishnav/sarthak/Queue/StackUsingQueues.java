package com.vaishnav.sarthak.Queue;
import java.util.Queue;
import java.util.LinkedList;

public class StackUsingQueues {
	
	Queue<Integer> q1=new LinkedList<>();
	Queue<Integer> q2=new LinkedList<>();
	int size=0;
	
	public void push(int data) {
		
		size++;		
		while(!q1.isEmpty()) {
			q2.add(q1.remove());
		}
		q1.add(data);
		while(!q2.isEmpty()) {
			q1.add(q2.remove());
		}
				
	}
	
	
	public int pop() {
		size--;
		return q1.remove();
		
	}
	
	public static void main(String...ar) {
		
		StackUsingQueues sq=new StackUsingQueues();
		sq.push(1);
		sq.push(22);
		sq.push(45);
		sq.push(97);
		sq.push(0);
		
				
		System.out.println(sq.pop());
		System.out.println(sq.pop());
		
		sq.push(21);
		sq.push(76);
		
		System.out.println(sq.pop());
		sq.push(87);
		
		System.out.println(sq.pop());
		System.out.println(sq.pop());
		System.out.println(sq.pop());
		System.out.println(sq.pop());
	//	System.out.println(sq.pop());
		System.out.println(sq.pop());
		
		
	}
	
	
}
