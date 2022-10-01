package com.vaishnav.sarthak.Queue;

public class RunnerQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	MyQueue mq=new MyQueue();
		//mq.enQueue(5);
	//	mq.enQueue(2);
//		mq.enQueue(7);
//		mq.enQueue(9);
//		mq.enQueue(12);
//		
//		System.out.println(mq.size());
//		System.out.println(mq.isEmpty());
//		
//		//mq.deQueue();
//	//	mq.deQueue();
//		mq.show();
//		
//		StackFromQueue s=new StackFromQueue();
//		s.push(6);
//		s.push(3);
//		s.push(20);
//		s.push(43);
//		
//		
//		s.showElements();
//		s.pop();
//		s.show();
		
		StackUsingQueues sq=new StackUsingQueues();
		sq.push(1);
		sq.push(22);
		sq.push(45);
		sq.push(97);
		sq.push(3);
				
		System.out.println(sq.pop());
		System.out.println(sq.pop());
		
	}

}
