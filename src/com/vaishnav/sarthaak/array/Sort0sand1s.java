package com.vaishnav.sarthaak.array;

public class Sort0sand1s {

	public static void main(String ar[]) {
		int arr[]= {0,1,0,1,0,1,0,1,0,0,0,1};
		int i=0,j=arr.length-1;
		
		while(i<=j) {
			if(arr[i]==0)
				i++;
			
			if(arr[j]==1)
				j--;
			
			if(arr[i]==1 && arr[j]==0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
	}
}
