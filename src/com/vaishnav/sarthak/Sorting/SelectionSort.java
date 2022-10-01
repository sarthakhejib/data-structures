package com.vaishnav.sarthak.Sorting;

public class SelectionSort {
	public static void main(String...ar) {
		
		int arr[]= {5,1,6,2,4,3};
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int j=i;
			while(j>0 && arr[j-1]>temp) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
		}



	}
}