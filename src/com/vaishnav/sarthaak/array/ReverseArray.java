package com.vaishnav.sarthaak.array;

public class ReverseArray {
	public static void main(String[] args) {		
		int arr[]= {1,2,3,4,5,6,7,8,9,0};
		int i=0,j=arr.length-1;
		int temp;

		while(i<j) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
	}
}
