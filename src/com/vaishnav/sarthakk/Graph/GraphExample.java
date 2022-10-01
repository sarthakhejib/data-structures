package com.vaishnav.sarthakk.Graph;
import java.util.*;
class Graph{
	class Edge{
		int v,w;
		public Edge(int v, int w) {
			this.v=v;
			this.w=w;
		}		
		@Override 
		public String toString() {
			return "("+v+","+w+")";
		}
	}
	List<Edge> G[];
	
	public Graph(int n){
		G=new LinkedList[n];
		for(int i =0;i<G.length;i++) 
			G[i]=new LinkedList<Edge>();			
	}
	@Override
	public String toString() {
		String result="";
		for(int i=0;i<G.length;i++)
			result+=i+"==>"+G[i]+"\n";
		return result;		
	}
	
	public void addEdges(int u, int v, int w) {
		G[u].add(0, new Edge(v,w));
	}
}
public class GraphExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph=new Graph(10);
		graph.addEdges(0, 2, 23);
		graph.addEdges(0, 4, 13);
		graph.addEdges(3, 5, 1);
		graph.addEdges(4, 3, 90);
		graph.addEdges(5, 7, 33);graph.addEdges(1, 6, 53);
		
		System.out.println(graph);
	}
}
