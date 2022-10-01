package com.vaishnav.sarthak.Searching;

public class SquareRoot {

	public static int  squareRoot(int num) {
		int start=0;
		int end=num;
		int middle=start+(end-start)/2;
		int ans=-1;
		//|| num-(middle*middle)==1 ||num-(middle*middle)==2
		while(start<end) {
			if((middle*middle)==num  )
				return middle;
			
			if(num>(middle*middle)) {
				ans=middle;
				start=middle+1;
			}
			
			else if(num<(middle*middle))
				end=middle-1;
			
			middle=start+(end-start)/2;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int num=8;	
		System.out.println(squareRoot(num));;
	}

}
