package com.vaishnav.sarthak.Searching;

public class OrderedLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sortedArr[] = {5,11,13,23,41,45};
		int element=4;
		for(int i=0;i<sortedArr.length;i++) {
			if(element>=sortedArr[i]) {
				if(element==sortedArr[i]) {
					System.out.println("Found it!");
					break;
				}
				
			}else 
				System.out.println("Not Found!");
				break;
		}
	}
}
