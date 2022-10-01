package com.vaishnav.sarthak.Searching;

public class BookAllocationProblem {
	
	boolean isPossible(int arr[], int mid, int k) {
		int studentCount=1;
		int pageSum=0;
		
		for(int i=0;i<arr.length;i++) {
			if(pageSum+arr[i]<=mid)
				pageSum+=arr[i];
			else {
				studentCount++;
			if(studentCount>k)
				return false;
			
			pageSum=arr[i];
			
			}
		}
		return true;
		
	}

	public static int allocateBooks(int arr[], int k) {
		int start=0;				
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		int end=sum;
		int ans=-1;
		int mid= start+(end-start)/2;
		return 0;
	}
		
//		while(start<=end) {
//			if(isPossible(arr,mid,k)) {
//				ans=mid;
//				end=mid-1;
//			}
//			else
//				start=mid+1;
//			
//			mid= start+(end-start)/2;
//		}
//		return ans;
		
	
	
	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		int k=2;
	}

}
