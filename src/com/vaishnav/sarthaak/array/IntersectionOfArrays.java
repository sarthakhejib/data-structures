package com.vaishnav.sarthaak.array;

import java.util.ArrayList;

public class IntersectionOfArrays {

	public static void main(String[] args) {
		int arr[]= {1,2,3,2,4,2,3};
		int arr1[]= {2,5,3,4};
		
		ArrayList<Integer> list=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			int element=arr[i];
			for(int j=0;j<arr1.length;j++) {
				if(element==arr1[j]) {
					list.add(arr[i]);
					arr1[j]=-1;
							break;
				}
			}
		}
		System.out.println(list);
	}

}
