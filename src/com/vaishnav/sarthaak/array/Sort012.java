package com.vaishnav.sarthaak.array;

public class Sort012 {

	public static void main(String[] args) {
		//int arr[]={0,2,1,2,0};
		int arr[]= {0,1,0};
		int i=0,j=arr.length-1,temp;
		//arr[i]==1 ||
		while(i<j) {
			if((arr[i]==2) && arr[j]==0) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					i++;
					j--;
			}
			if(arr[i]==0)
				i++;
			
			if(arr[j]==2)
				j--;
			
			if(arr[j]==0) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		
		for(int l=0;l<arr.length;l++) {
			System.out.println(arr[l]);
		}
		
	}

}
