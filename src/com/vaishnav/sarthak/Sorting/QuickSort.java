package com.vaishnav.sarthak.Sorting;

import java.util.Arrays;

public class QuickSort {

	public static int partition(int arr[],int s,int e) {
		int pivot=arr[s];
		int cnt=0;

		for(int i=s+1;i<arr.length;i++) {
			if(arr[i]<=pivot) {
				cnt++;
			}
		}
		//place pivot to right position
		int pivotIndex=s+cnt;
		int temp=arr[s];
		arr[s]=arr[pivotIndex];
		arr[pivotIndex]=temp;

		//Left aur right wla part
		int i=s, j=e;
		while(i<pivotIndex && j>pivotIndex) {
			while(pivot>arr[i]) {
				i++;
			}
			while(pivot<arr[j]) {
				j--;
			}

			if(i<pivotIndex && j>pivotIndex) {
				int temp1=arr[i];
				arr[i]=arr[j];
				arr[j]=temp1;

				i++;
				j--;
			}
		}		
		return pivotIndex;
	}

	public static void quickRecur(int arr[],int s,int e) {		
		if(s>=e)
			return;

		int pi=partition(arr,s, e);
		//Left part	
		quickRecur(arr,s,pi-1);
		//Right part	
		quickRecur(arr,pi+1,e);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {15,9,7,13,12,16,4,18,11};
		int s =0;
		int e=arr.length-1;
		quickRecur(arr,s,e);
		System.out.println(" "+Arrays.toString(arr)); 
	}

}
