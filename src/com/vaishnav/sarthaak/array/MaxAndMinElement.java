package com.vaishnav.sarthaak.array;

public class MaxAndMinElement {
	public static void main(String[] args) {
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int arr[]= {22,0,11,4,5,67};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		for(int i=0;i<arr.length;i++) {
		 if(arr[i]<min)
				min=arr[i];
		}
		
		
		System.out.println("Minimum "+min+"  Maximum "+max);
		
								
	}

}
