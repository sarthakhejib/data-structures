package com.vaishav.sarthak.Heap;

import java.util.PriorityQueue;

public class KSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,1,4,6,7,5,8,9};
		int k=2;
		
		PriorityQueue<Integer> pr=new PriorityQueue<>();
		
		for(int i=0;i<=k;i++) {
			pr.add(arr[i]);
		}		
		for(int i=k+1;i<arr.length;i++) {
			System.out.println(pr.remove());
			pr.add(arr[i]);
		}
		
		while(!pr.isEmpty()) {
			System.out.println(pr.remove());
		}
	}
}
