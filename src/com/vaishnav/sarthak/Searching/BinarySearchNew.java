package com.vaishnav.sarthak.Searching;

public class BinarySearchNew {

	public static int binarySearch(int arr[],int element) {
		int start=0, end=arr.length-1;
		int middle=(start+end)/2;
		
		while(start<=end) {
			if(arr[middle]==element)
				return middle;
			
			if(element>arr[middle]) 
				start=middle+1;
							
			else
				end=middle-1;
			
			middle=(start+end)/2;
		}
		return -1;
	}
	
	
	
	public static void main(String[] args) {		
		int even[]= {2,4,6,8,12,18};
		System.out.println(binarySearch(even,18));;
		

	}

}
