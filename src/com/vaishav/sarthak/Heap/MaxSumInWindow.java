package com.vaishav.sarthak.Heap;
import java.util.PriorityQueue;

public class MaxSumInWindow {	

	public static void main(String[] args) {
		int windowSize=3,sum=0;
		int array[]= {1,3,-1,-3,5,3,6,7};
		PriorityQueue<Integer> q=new PriorityQueue<>();
		for(int i=0;i<windowSize;i++) {
			q.add(array[i]);
			sum+=array[i];
		}
		
		for(int i=windowSize;i<array.length;i++) {
			if(q.peek()<array[i]) {
				sum-=q.peek();
				q.poll();
				q.add(array[i]);
				sum+=q.peek();
			}
			else {
				q.poll();
				q.add(array[i]);				
			}
		}
		System.out.println(sum);
	}
}
