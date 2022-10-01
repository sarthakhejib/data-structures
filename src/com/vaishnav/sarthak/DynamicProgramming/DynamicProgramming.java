package com.vaishnav.sarthak.DynamicProgramming;

public class DynamicProgramming {
	
	public int fibonacciTopDown(int num,int array[]) {
		if(num==0||num==1) {
			array[num]=num;
			return num;
		}
		
		if(array[num]!=-1) 
			return array[num];
			
		else {
			array[num]=fibonacciTopDown(num-1,array)+fibonacciTopDown(num-2,array);
			return array[num];
		}		
	}
	
	public int ladderBottomUp(int num,int steps[]) {
		/*
		 * steps[0]=1; steps[1]=1; steps[2]=2;
		 */
		steps[0]=1;
		if(num==1||num==2) {
			steps[num]=num;
			return num;
		}
		
		if(steps[num]!=-1) 
			return steps[num];
		else{
			steps[num]=ladderBottomUp(num-1,steps)+ladderBottomUp(num-2,steps)+ladderBottomUp(num-3,steps);
			return steps[num];
		}		
	}
	
	public int coinChangeProblem(int coins[],int amount,int n) {
		int dp[]=new int[amount+1];
		int smallerAns=0;
		for(int i=0;i<amount;i++) {
			dp[i]=Integer.MAX_VALUE;
		}
		dp[0]=0;
		for(int rupay=0;rupay<amount;rupay++) {
			
			//Iterating over coins
			for(int i=0;i<n;i++) {
				if(coins[i]<=rupay) {
					 smallerAns=dp[rupay-coins[i]];
				}
				if(smallerAns!=Integer.MAX_VALUE) {
					dp[rupay]=Math.min(dp[rupay], smallerAns+1);
				}				
			}			
		}
		return dp[amount];		
	}
	
	public int longestIncreasingSubsquence(int arr[], int n) {
		int max=0;
		int list[]=new int[n];
		for(int i=0;i<n;i++)
			list[i]=1;
		
		for(int i=0;i<n;i++)
			for(int j=1;j<i;j++)
				if(arr[i]>arr[j]&& list[i]<list[j]+1)
					list[i]=list[j]+1;
		
		for(int i=0;i<n;i++) {
			if(max<list[i])
				max=list[i];
		}		
		return max;
	}
	
}
