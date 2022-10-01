
package com.vaishnav.sarthaak.array;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayConceptMain {
	
//	private static int[][] matrix = new int[][] { {1, 2, 3, 10},
//										 {4, 5, 6, 12},
//										{7, 8, 9, 14}};
// 
	public static void matrixAddition(int arrayOne[][],int arrayTwo[][]) {
		int result[][]=new int[3][3];
		for(int i=0;i<arrayOne.length;i++) {
			for(int j=0;j<arrayOne[i].length;j++) {
				result[i][j]=arrayOne[i][j]+arrayTwo[i][j];

				System.out.print(+result[i][j]+" " );
			}
			System.out.println();
		}

	}

	public static void matrixTranspose(int arrayOne[][]) {
		
		if(arrayOne==null) 
			return;
		
		int transposedMatrix[][]=new int[arrayOne.length][arrayOne.length];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				transposedMatrix[i][j]=arrayOne[j][i];
			}					  
		}

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(+transposedMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}	
	
	public static void matrixMultiplication(int arrayOne[][],int arrayTwo[][]) {
		int result[][]=new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					 result[i][j]=0;
					 result[i][j]+=arrayOne[i][k]*arrayTwo[k][j];
				}
				
				System.out.print(+result[i][j]+" ");
			}
			System.out.println();
		}		
	}
	
	public static void sahilLoveGoodScore() {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the size of columns");
		int sizeOne=sc.nextInt();
		int sizeTwo=sc.nextInt();
	//	System.out.println("Enter the scores of individual");
		int arrayFirst[]=new int[sizeOne];
		
		for(int i=0;i<sizeOne;i++) {
			arrayFirst[i]=sc.nextInt();			
		}
		//System.out.println("Enter the size of the second column");
		
	//	System.out.println("Enter the scores of individual");
		int arrayTwo[]=new int [sizeTwo];
		for(int i=0;i<sizeTwo;i++) {
			arrayTwo[i]=sc.nextInt();			
		}
		int sumOne=0,sumTwo=0;
		
		for(int j=0;j<sizeOne;j++) {
			sumOne+=arrayFirst[j];
		}
		
		for(int j=0;j<sizeTwo;j++) {
			sumTwo+=arrayTwo[j];
		}
		if(sumOne>sumTwo) {
			System.out.println("C1");			
		}
		else {
			System.out.println("C2");		
		}
	}
	

		public static int kThFactor(int N,int K) {
			ArrayList <Integer>list=new ArrayList<>();			
			for(int i=1;i<=N;i++) {
				if(N%i==0) {
					list.add(i);				
				}				
			}
			if(K<list.size()) {
				int index=list.size()-K;
				return list.get(index);
			}
			else {
				return 1;				
			}
		} 
		
		public static int candies(int array[],int numOfBoxes) {
			//Scanner sc=new Scanner(System.in);
			//System.out.println("lkjlk");
			//int numOfBoxes=sc.nextInt();
			
			//int array[]=new int[numOfBoxes];
		
		//	System.out.println("jsKs");
			//for(int i=0;i<numOfBoxes;i++) {
				//array[i]=sc.nextInt();				
		//	}

		  int sum[]=new int[numOfBoxes];
////		  
////		  for(int i=0;i<numOfBoxes;i++){ ///int temp=array[i];
////		 //	sum[i]=array[i]+array[i+1];
					
				
			int seconds=array[0]+array[1];
			for( int i=1;i<numOfBoxes;i++) {
				sum[i]=seconds+array[i];;								
			}	
			int totalSeconds=0;
			for(int i=0;i<numOfBoxes;i++) {
				totalSeconds+=sum[i];
			}
			
			return totalSeconds;
		}
	public static int maxProductTriplet(int numbers[]) {
		int i=0,k=0;
		int max=Integer.MIN_VALUE;
		if(numbers.length<=2)
			return 0;
		
		if(numbers.length==3)
			return numbers[0]*numbers[1]*numbers[2];
		
		if(numbers.length>=4) {
			while(i<numbers.length-1 && k!=3) {
				if(numbers[i]>max)
					max=numbers[i];
			}
		}
		return k;
		
	}
		
		
		
	public static void main(String arg[]) {
//		int arrayOne[][]= {{1,2,3},{4,5,6},{7,8,9}};
//		int arrayTwo[][]= {{1,3,4},{7,8,0},{11,22,67}};
//		matrixAddition( arrayOne,arrayTwo);
//		matrixTranspose(arrayOne);
//		/matrixMultiplication(arrayOne,arrayTwo4);
		//sahilLoveGoodScore();
		//int n=7;
		//sumPrime(n);
		//int N=64,k=2;
	//System.out.println(kThFactor(N,k));	;
	//	int array[]= {1,2,3,4};		
		//System.out.println(candies(array,4));
		
		int numbers[]= {5,6,1,0,3,2};
		
	}
}