package com.vaishnav.sarthaak.array;

import java.util.HashMap;
import java.util.Set;

public class UniqueElements {

	public static void main(String[] args) {
		int arr[]= {2,4,7,2,7};

		//int arr[]= {11,2,2,1,1,2,76,3,5,6,76,};
//		HashMap<Integer,Integer> map=new HashMap<>();
//
//		for(int i:arr) {
//			if(map.containsKey(i))
//				map.put(i, map.get(i)+1);
//
//			else
//				map.put(i,1);
//		}
//		
//		Set<Integer> set=map.keySet();
//		for(Integer i:set) {
//			if(map.get(i)==1)
//				System.out.println("This is unique element"+i);
//		}
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			ans^=arr[i];
		}
		System.out.println(ans);

	}


}
