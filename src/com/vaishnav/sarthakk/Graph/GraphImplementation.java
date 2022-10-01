package com.vaishnav.sarthakk.Graph;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class GraphImplementation {

	private LinkedList<Integer> adj[];

	public GraphImplementation(int v) {
		adj=new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i]=new LinkedList<Integer>();
		}
	}

	public void addEdge(int source ,int destination) {
		adj[source].add(destination);
		adj[destination].add(source);		
	}
	public int SSSPBreathFirstSearch(int source ,int destination) {
		boolean vis[]=new boolean[adj.length];
		int parent[]=new int [adj.length];
		Queue<Integer> q=new LinkedList<>();
		q.add(source);
		parent[source]=-1;
		vis[source]=true;
		while(!q.isEmpty()) {

			int cur=q.poll();
			if(cur==destination) break;
			//System.out.println(cur);

			for(int neighour: adj[cur]){
				if(!vis[neighour]) {
					vis[neighour]=true;
					q.add(neighour);
					parent[neighour]= cur;
				}

			}
		}

				int cur=destination;
				int distance=0;
				while(parent[cur]!=-1) {
					System.out.println(cur+"->");
					cur=parent[cur];
					distance++;
		}
				return distance;
	}

			public void breathFirstSearch(int source ) {
				boolean vis[]=new boolean[adj.length];
				//		int parent[]=new int[adj.length];

				Queue <Integer> q=new LinkedList<>();		
				q.add(source);
				//		parent[source]=-1;
				vis[source]=true;
				while(!q.isEmpty()) {

					int cur=q.poll();
					//			if(cur==destination) break;
					System.out.println(cur);

					for(int neighour: adj[cur]){
						if(!vis[neighour]) {
							vis[neighour]=true;
							q.add(neighour);
							//parent[neighour]= cur;
						}
					}
				}
				/*int cur=destination;
		int distance=0;
		while(parent[cur]!=-1) {
			System.out.println(cur+"->");
			cur=parent[cur];
			distance++;
		}*/
				//		return distance;
			}

			public void depthFirstSearch(int source ,int destination) {
				boolean visited[]=new boolean[adj.length];
				visited[source]=true;
				Stack<Integer> stack=new Stack<>();
				stack.push(source);

				//if(source==destination)
				//return true;
				while(!stack.isEmpty()) {
					int cur=stack.pop();
					System.out.println(cur);
					for(int neighour:adj[cur]) {
						if(!visited[neighour]) {
							visited[neighour]=true;
							stack.push(neighour);
						}
					}
				}
			}

			public void detectCycleInDirectedGraph(int source) {
				boolean visited[]=new boolean [adj.length];
				visited[source]=true;
				Stack <Integer>stack=new Stack<>();
				stack.push(source);

				while(!stack.isEmpty()) {
					int cur=stack.pop();
					for(int neighbour :adj[cur]) {
						if(visited[neighbour]) {
							visited[neighbour]=true;
							stack.push(neighbour);
						}
					}
				}		
			}


			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in );
				int v=sc.nextInt();
				int e=sc.nextInt();

				GraphImplementation g=new GraphImplementation(v);

				System.out.println("Enter "+e+" edges");
				for(int i =0;i<e;i++) {
					int source =sc.nextInt();
					int destination =sc.nextInt();
					g.addEdge(source, destination);
				}
				//g.breathFirstSearch(0);
				//		System.out.println(g.depthFirstSearch(0, 4));

			}

		}
