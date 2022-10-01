package com.vaishnav.sarthak.list;

public class MyLinkedList {

	Node head;
	int size;
		
	public void add(int data) {
		
		Node newNode = new Node(data);
		
		if (head == null) {
			head = newNode;
		}else {
			Node temp = head;
			while(temp.next!=null) {
				temp =temp.next;
			}
			temp.next = newNode;
		}
		size++;
		  
	}
				    //x 
	// 0 -> 1 -> 2 -> 3 -> 4 -> 5
	
	public void add(int index, int data) {
		
		if(index < 0 || index >size-1)
			throw new IndexOutOfBoundsException("The index value passed is incorrect");
		
		Node newNode = new Node(data);
		if(index == 0) {
			head = newNode;
		} else {
			Node temp = head;
			for(int i=0;i<index-1 && temp.next!=null;i++) {
				temp = temp.next;
			}
			
			newNode.next = temp.next;
			temp.next = newNode;
		}
		size++;
		
	}
	
	public void delete(int index) {
		
		if(index<0 || index>size-1)
			throw new IndexOutOfBoundsException("The index value entered is incorrect! ");
		
		if(index==0) {
			head=head.next;
		}else {
			Node temp=head;
			Node newTemp =null;
			for(int i=0;i<index-1 && temp.next!=null;i++) {
				temp=temp.next;
			}
			
				newTemp=temp.next;
			temp.next=newTemp.next;
			
		}
		size--;
		
	}
	public void show()
	{
		Node node=head;
	
		while(node.next!=null)
		{
			System.out.println(node.data);
			node=node.next;			
		}
		System.out.println(node.data);
	}
	
	
	public int get(int index) throws IndexOutOfBoundsException{
		
		if(index < 0 || index >size-1)
			throw new IndexOutOfBoundsException("The index value passed is incorrect");
		
		Node temp = head;
		
		for (int i=0;i<index && temp.next!=null; i++ ) {
			temp = temp.next;
		}
		
		return temp.data;
	}
	
	//public Node reverse() {
		
		//Node node=new Node();
		
		//Node prev=null;
		//Node current=head;
	//	Node next=null;
		
	//	while(current!=null) {
			
		//	next=current.next;
			//current.next=prev;
			//prev=current;
			//current=next;
	//	}
		//node=prev;
		//return node;
	//}
	//Node element=new Node();
	
	public boolean search(int element){		
		Node current=head;
		
		while(current!=null) {
			if(current.data==element) {
				// System.out.println("True!");
				return true;
			}
			current = current.next;
		}
		return false;
	}
	 int length(){
		int count=0;		
		Node n=head;
		
		while(n.next!=null){
			n=n.next;
			count++;			
		}
		//System.out.println("the length of the linked list is: "+count);
		return count;
	}
	void findLoop(Node head) {
		Node slowptr=head;
		Node fastptr=head;
		
		while(fastptr!=null && fastptr.next!=null) {
			slowptr=slowptr.next;
			fastptr=fastptr.next.next;			
		}
		if(slowptr==fastptr) {
			System.out.println("Loop Found.");
		}
		else{
			System.out.println("No Loop Found.");
		}
	}
	
	void loopLength() {
		Node slowptr=head;
		Node fastptr=head;
		
		while(fastptr!=null && fastptr.next!=null) {
			slowptr=slowptr.next;
			fastptr=fastptr.next.next;			
		}
		if(slowptr==fastptr) {
			System.out.println("Loop Exists!");
		
			int	count=0;
		    do {
			 slowptr=slowptr.next;
			 count++;		 
	        }
	     	while(slowptr!=fastptr);
		    System.out.println("The length of the loop is:" +count);
	    }				
	} 
	
	void middleElement(){
		int count=0;
		Node n=head;
		
		while(n.next!=null){
			n=n.next;
			count++;					
		}
	//	MyLinkedList list=new MyLinkedList();
		if(count%2==0){
		    System.out.println("As the length is even, there will be TWO middle elements.");
			
		  //  int middleOne=count/2;
		//    int middleTwo= middleOne+1;
		    
		   
		}
	}
	// 1
	void middle() {
		Node slowptr=head;
		Node fastptr=head;
		
		while(fastptr!=null && fastptr.next!=null) {
			slowptr=slowptr.next;
			fastptr=fastptr.next.next;			
		}
		System.out.println("The middle element is:"+slowptr.data);
		
	}

	void nodeFromTheEnd(int n) {
		//	Node node;
		if(length()<n) {
			throw new IndexOutOfBoundsException("Enter valid value of n"); 
		}
		if(n==0) {
			throw new NullPointerException("Enter valid value of n");			
		}

		Node slowptr=head;
		Node fastptr=head;
		for(int i=0;i<n;i++) {
			fastptr=fastptr.next;
		}
		while(fastptr!=null) {
			slowptr=slowptr.next;
			fastptr=fastptr.next;			
		}

		System.out.println(slowptr.data);
	}
	
	void reverse() {
		if(head==null) {
		System.out.println( head.data);;
			
		}
		Node previous=null;
		Node current=head;
		Node next=null;
		
		while(current!=null) {
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
			
		}
		while(previous!=null) {
			System.out.println(previous.data); ;
			previous=previous.next;
		} 
	}
	
	void interchangeNodes()  {
		Node fastptr=head;
		fastptr=fastptr.next;
		Node slowptr=head;
		while(fastptr!=null) {
			System.out.println(fastptr.data );
			System.out.println(slowptr.data);
			fastptr=fastptr.next.next;
			slowptr=slowptr.next.next;
		} 
		
	}
	
	void printReverseLinkedList() {
		Node temp=head;
		Node prev=null;
		
	
		
		while(temp!=null) {
			temp=temp.next;
		}
	}
	
	
}



		
	 
		
		
	
