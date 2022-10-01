package com.vaishnav.sarthaak.array;

import java.util.PriorityQueue;

public class KthSmallestElementUsingPQ {

	public static void main(String[] args) {
		int arr[] = {7 ,10 ,4 ,3,20,15};
		int k=3,n=0;
		
		PriorityQueue<Integer> q=new PriorityQueue<>();
		
		for(int i=0;i<arr.length;i++) {
			q.add(arr[i]);
		}
		
		while(n!=(k-1)) {
			q.poll();
			n++;
		}
		
		System.out.println(q.peek());
		
	}

}
