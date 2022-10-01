package com.vaishnav.sarthak.DynamicProgramming;

public class DPRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DynamicProgramming dp=new DynamicProgramming();
		int array[]=new int [100];
		for(int i=0;i<100;i++) {
			array[i]=-1;
		}
		//System.out.println(dp.fibonacciTopDown(5, array));;
		
		int steps[]=new int[100];
		for(int i=0;i<100;i++) {
			steps[i]=-1;
		}
	//	System.out.println(dp.ladderBottomUp(4, steps));;
		
		int coins[]= {1,2,5,10,50 };
		int paise=13;
		int n=5;
		
		//System.out.println(dp.coinChangeProblem(coins, paise, n));
		
		int arr[]= {10,22,9,33,21,50,41,60,80};
		int num=arr.length;
		System.out.println(dp.longestIncreasingSubsquence(arr, num));
	}
	
	

}
