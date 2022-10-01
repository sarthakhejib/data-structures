package com.vaishav.sarthak.Heap;

public class HeapNode {

	HeapNode leftNode;
	HeapNode rightNode;
	int array[];
	int heapType;
	int capacity;
	int count;
	
	public HeapNode(int data) {
		leftNode=null;
		rightNode=null;
		this.count=0;
		this.capacity=capacity;
		this.array=new int[capacity];	
	}
}
