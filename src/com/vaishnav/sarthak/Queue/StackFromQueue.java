package com.vaishnav.sarthak.Queue;

public class StackFromQueue {

	int queueOne[]=new int[15];	
	int rearOne;
	int frontOne;
	int sizeOne=0;
	
	int queueTwo[]=new int[15];
	int rearTwo;
	int frontTwo;
	int sizeTwo=0;
	
	public void push(int data) {
		queueOne[rearOne]=data;
		rearOne++;
		sizeOne++;
	}
	
	public int pop() {
	//	int count =1;
		while(frontOne!=rearOne) {
			int data=queueOne[frontOne];
			queueOne[frontOne]=queueTwo[rearTwo];
			queueTwo[rearTwo]= data;
			frontOne++;
			rearTwo++;
			sizeOne--;
			sizeTwo++;
		}
		int data =queueOne[frontOne];
		sizeOne--;
		//queueOne[frontOne]=0;
	
		return data;
	}
	
	public void showElements() {
		System.out.print("Elements in queueOne:"); 
		for(int i=0;i<sizeOne;i++) {
			System.out.print( "  "+queueOne[frontOne+i]);	
		}		
	}
	
	public void show() {
		System.out.println("Elements of queueTwo:"); 
		for(int i=0;i<sizeTwo;i++) {
			System.out.print( "  "+queueTwo[frontTwo+i]);			
		}
		
		
	}
}
