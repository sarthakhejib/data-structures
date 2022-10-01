package com.vaishav.sarthak.Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElementsFromEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {2,1,5,3,7,4,9,1,4,5};
		int k=3;
		
		PriorityQueue <Integer>pq=new PriorityQueue<>();

		for(int i=0;i<array.length;i++) {
			if(i<k)
				pq.add(array[i]);
			else {
				if(array[i]>pq.peek()) {
					pq.poll(); 
					pq.add(array[i]);
				}
			}
		}		
		ArrayList <Integer> list=new ArrayList<>(pq);
		Collections.sort(list,Collections.reverseOrder());
		
		for(int i:list) {
			System.out.println(i+" ");
		}
		System.out.println();
	}
}
