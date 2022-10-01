package com.vaishnav.sarthak.Searching;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,4,5,7,8,9};
		int lowerIndex=0;
		int element=7 ;		
		int higherIndex=arr.length-1;
		int middleIndex=(higherIndex+lowerIndex)/2;
		
		while(lowerIndex<=higherIndex) {
			
			if(arr[middleIndex]==element) {
				System.out.println("Element found at "+middleIndex+" index");
				break;			
			}
				
			else if(arr[middleIndex]<element)
				lowerIndex=middleIndex+1;
			
			else
				higherIndex=middleIndex-1;
			
			middleIndex=(lowerIndex+higherIndex)/2;
		}			
	}
}
