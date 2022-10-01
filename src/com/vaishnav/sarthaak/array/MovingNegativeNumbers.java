package com.vaishnav.sarthaak.array;

public class MovingNegativeNumbers {
	public static void main(String[] args) {
		int arr[]= {12, 11, -13, -5, 6, -7, 5, -3, -6};		
		int i=0,j=arr.length-1;

		while(i<=j) {
			if(arr[i]<0 && arr[j]<0)
				i++;

			else if(arr[j]>0 && arr[i]>0)
				j--;

			else if(arr[j]<0 && arr[i]>0) {
				int  temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
			else {
				i++;
				j--;
			} 
		}	

		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
	}
}
