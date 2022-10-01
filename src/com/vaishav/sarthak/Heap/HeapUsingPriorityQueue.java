package com.vaishav.sarthak.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class HeapUsingPriorityQueue {

	public static void minHeap(int array[]) {
		PriorityQueue<Integer> heap=new PriorityQueue<>();
		
		for(int i=0;i<array.length;i++) {
			heap.add(array[i]);
			System.out.print(heap.peek()+"  ");			
		}
		System.out.println();
		
		for(int i=0;i<array.length;i++) {
			heap.poll();
			System.out.print(heap.peek()+"  ");
		}		
	}

	public static void maxHeap(int array[]) {
		PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0;i<array.length;i++) {
			heap.add(array[i]);
			System.out.print(heap.peek()+"  ");			
		}
		System.out.println();
		
		for(int i=0;i<array.length;i++) {
			heap.poll();
			System.out.print(heap.peek()+"  ");
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {10,7,11,5,2,13,1,45};
		//minHeap(array);
		maxHeap(array);		
	}
}
