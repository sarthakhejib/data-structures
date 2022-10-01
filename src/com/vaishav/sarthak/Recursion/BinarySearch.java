package com.vaishav.sarthak.Recursion;

public class BinarySearch {
public static boolean bol=false;
 private static boolean binarySearch(int arr[],int element,int start, int end) {
	 
	 int mid=start+(end-start)/2;
	 if(arr.length==0)
		 return false;
	 
	 if(start>end)
		 return false;
	
	 
	 if(arr[mid]==element) {
		 bol=true;
		 return bol;
	 } 
	 
	 if(arr[mid]<element) {
		 binarySearch(arr,element,mid+1,end);
	 }
	 else {
		 binarySearch(arr,element,start,mid-1);
	 }
	return bol;	 
		 
 }
	public static void main(String[] args) {
		int arr[]= {2,3,4,8,10};
		int start=0;
		int end=arr.length-1;
		int element=2;
		
		boolean  ans=binarySearch(arr,element,start, end);
		System.out.println(ans);
	}
}
