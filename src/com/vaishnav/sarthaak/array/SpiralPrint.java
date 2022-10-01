package com.vaishnav.sarthaak.array;

import java.util.Scanner;

public class SpiralPrint {

	
	public static void main(String[] args) {
		int m=3,n=3;
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int [m][n];

		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();				
			}
		}
		int row=0,col=0;
		while(row<m) {
			for(int j=0;j<n;j++) {
				System.out.println(arr[row][j]);
				col=j;
			}
			row++;
			
			for(col=0;col<n;col++) {
				System.out.println(arr[row][col]);
			}
			col--;
			
		}
	}

}
