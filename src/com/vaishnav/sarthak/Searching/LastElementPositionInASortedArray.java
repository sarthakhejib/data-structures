package com.vaishnav.sarthak.Searching;

public class LastElementPositionInASortedArray {
	static int searchPosition(int arr[],int key) {
		int start=0,end=arr.length-1,ans=-1;
		int middle=start+(end-start)/2;
		
		while(start<=end) {
			if(arr[middle]==key) {
				ans=middle;
				end=middle-1;				
			}
			
			else if(key>arr[middle]) 
				start=middle+1;
			
			else if (key<arr[middle])
				end=middle-1;
				
			middle=start+(end-start)/2;					
		}
		return ans;
	
	}
	
	public static void main(String[] args) {	
		int arr[]= {1,2,3,3,3,3,3,3,4,5};
		System.out.println(searchPosition(arr,3));
		
	}
}
