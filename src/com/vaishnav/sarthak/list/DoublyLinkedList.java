package com.vaishnav.sarthak.list;

public class DoublyLinkedList {
	DoublyLLNode head;
	

	public void print(DoublyLLNode head) {
		DoublyLLNode temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public void insertAtHead(int data) {
		DoublyLLNode temp= new DoublyLLNode(data);
		
		temp.next=head;
		temp.prev=null;
		
		if(head!=null)
		head.prev=temp;
		head=temp;
	}
	
	public static void main(String[] args) {
		DoublyLLNode node=new DoublyLLNode(12);
		DoublyLLNode head=node;
		DoublyLinkedList dl=new DoublyLinkedList();
		//dl.print(head);
		DoublyLLNode node1=new DoublyLLNode(1);

		dl.insertAtHead(2);
		dl.print(node);
	}
}
