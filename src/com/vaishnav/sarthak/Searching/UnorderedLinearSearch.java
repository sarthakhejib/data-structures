package com.vaishnav.sarthak.Searching;

public class UnorderedLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,12,121,56,76,56,8,0};
		int element=56;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==element)
				System.out.println("Found");
				
			else
				System.out.println("Does'nt Exists!");			
		}
	}
}
