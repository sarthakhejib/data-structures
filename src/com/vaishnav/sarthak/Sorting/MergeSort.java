package com.vaishnav.sarthak.Sorting;

public class MergeSort {

	public static void mergeSort(int arr[],int n) {
		if(n<2)
			return;

		int	middleIndex=n/2;
		int right[]=new int[n-middleIndex];
		int left[]=new int[middleIndex];

		for(int i=0;i<middleIndex;i++) {
			left[i]=arr[i];
		}
		
		for(int i=middleIndex;i<n;i++){
			right[i-middleIndex]=arr[i];
		}
		
		mergeSort(left,middleIndex);
		mergeSort(right,n-middleIndex);
		
		merge(arr,left,right,middleIndex,n-middleIndex);
	}
	
	public static void merge(int arr[],int left[],int right[],int leftLength,int rightLength) {
		int i=0,j=0,k=0;
		while(i<leftLength && j<rightLength) {
			if(left[i]>=right[j])
				arr[k++]=right[j++];
			
			else 
				arr[k++]=left[i++];
		}
		while(i<leftLength) {
			arr[k++]=left[i++];
		}
		while(j<rightLength) {
			arr[k++]=right[j++];
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {5,1,6,2,3,4};
		int n= arr.length;
		mergeSort(arr,n);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}
}
