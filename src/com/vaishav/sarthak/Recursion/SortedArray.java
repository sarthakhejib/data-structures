package com.vaishav.sarthak.Recursion;

public class SortedArray {
	private static boolean bol=true;


	public static  boolean isSorted(int arr[],int size, int i) {
		if(size==0||size==1)
			return true;
		if(i==size-1 && bol==true)
			return true;
		
		if(arr[i]>arr[i+1])
			return false;
		else {
			  bol = isSorted(arr,size,i+1);
			  return bol;
		}
	}
	
	
	public static void main(String[] args) {
		int arr[]= {2,4,6,1222,111};
		int size=arr.length;
		int i=0;
		boolean s=isSorted(arr,size,i);
		System.out.println(s);
	}

}
