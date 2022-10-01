package com.vaishav.sarthak.Recursion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RatInAMaze {

	private static boolean isSafe(int x, int y, int n,ArrayList<String> ans,int[][] visited,int[][] m ) {
		if((x>=0 && x<n) &&(y>=0 && y<n)
				&& visited[x][y]==1)
			return true;

		else 
			return false;
	}

	private static void solve(int[][] m, int n, ArrayList<String> ans, int x, int y, int[][] visited,  ArrayList<String> path) {
		//base case
		if(x==n-1 && y==n-1) {
			ans.addAll(path);
			return ;
		}
		visited[x][y]=1;

		//down
		int newx=x+1;
		int newy=y;
		if(isSafe(newx,newy,n,ans,visited,m)) {
			path.add("D");
			solve(m,n,ans,newx,y,visited,path);
			path.remove(path.size()-1);			
		}

		//left
		newx=x;
		newy=y-1;
		if(isSafe(newx,newy,n,ans,visited,m)) {
			path.add("L");
			solve(m,n,ans,newx,y,visited,path);
			path.remove(path.size()-1);			
		}

		//Right
		newx=x;
		newy=y+1;
		if(isSafe(newx,newy,n,ans,visited,m)) {
			path.add("R");
			solve(m,n,ans,newx,y,visited,path);
			path.remove(path.size()-1);			
		}	

		//Up
		newx=x-1;
		newy=y;
		if(isSafe(newx,newy,n,ans,visited,m)) {
			path.add("U");
			solve(m,n,ans,newx,y,visited,path);
			path.remove(path.size()-1);			
		}	
		visited[x][y]=0;
	}
	public static List<String> findPath(int [][] m, int n){						
		int srcx=0;
		int srcy=0;

		int visited[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				visited[i][j]=0;
			}
		}
		ArrayList<String> ans=new ArrayList<>();
		ArrayList<String> path=new ArrayList<>();;
		if(m[0][0]==1)
			solve(m,n,ans,srcx,srcy,visited,path);
		Collections.sort(path);

		return path;

	}
	public static void main(String[] args) {
		int m[][]= {{1,0,0},
				{1,1,0,1},
				{1,1,0,0},
				{0,1,1,1}
				};
		System.out.println(findPath(m,4));;
		
	}

}
