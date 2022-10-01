package com.vaishnav.sarthak.Queue;

public class MyQueue {

	int queue[]=new int[5];
	int front;
	int rear;
	int size=0;
	
	public void enQueue(int data) {		
		queue[rear]= data;
		rear++;
		size++;
	}
	
	public int deQueue() {
		int data=queue[front];
		front++;
		size--;
		return data;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;		
	}
		
	
	public void show() {
		System.out.print("ELemnts:");
		for(int i=0;i<size;i++) {
			System.out.print( "  "+queue[front+i]);		
		}	
	}
}