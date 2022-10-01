package com.vaishnav.sarthaak.array;

public class SwapAlternateElements {
	static int temp;
	public static void swapElements(int array[]) {				
		for(int i=0;i<array.length;i+=2) {
			if(i+1<array.length-1) {
			temp=array[i];
			array[i]=array[i+1];
			array[i+1]=temp;		
			}
		}		
	}
	
	public static void printArray(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}		
	}
	
	public static void main(String[] args) {
		int array[]= {2,1,4,3,6};
		swapElements(array);
		printArray(array);
	}
}
