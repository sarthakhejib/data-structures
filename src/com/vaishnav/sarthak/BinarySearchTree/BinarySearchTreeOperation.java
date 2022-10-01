package com.vaishnav.sarthak.BinarySearchTree;

/*   					8
				3	 			10
			1		6	   13 		 14
				 4
*/

public class BinarySearchTreeOperation {
	
	public Node createNewNode(int k) {
		Node a=new Node();
		a.data=k;
		a.left=null;
		a.right=null;
	
		return a;
	}
	
	public Node insert(Node node,int val) {
		if(node==null) 
			return createNewNode(val);
		
		if(val<node.data)
			node.left=insert(node.left,val);
		
		else if(val>node.data)
			node.right=insert(node.right,val);
				
		return node;
	}
	Node root;
	BinarySearchTreeOperation(){
		root=null;		
	}
	
/*//	/*
//	 * public void delete(int val, int key) { //Node root=null; Node
//	 * root=deleteRec(root,key); }
//	 */
	
	public int miniValue(Node root) {
		int minimum=root.key;
		 while(root.left!=null) {
			 minimum=root.left.key;
			 root=root.left;
		 }
		return minimum;		
	}
	
	public Node deleteRec(Node root,int key) {
		if(root==null)
			return root;
		
		if(key<root.data) 
			root.left=deleteRec(root.left,key);
			
		else if(key>root.data)	
			root.right=deleteRec(root.right,key);	
		
		else {
			
			if(root.left==null)
				return root.right;
			
			else if(root.right==null)
				return root.left;
			
			root.key=miniValue(root.right);
			
			root=deleteRec(root.right,root.key);
		
		}
		
		return root;
	}
	
}
 