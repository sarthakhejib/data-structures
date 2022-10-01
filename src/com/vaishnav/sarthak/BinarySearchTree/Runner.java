package com.vaishnav.sarthak.BinarySearchTree;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTreeOperation bst=new BinarySearchTreeOperation(); //8,3,6,10,4,7,1,14,13
		Node root=null;
 		root=bst.insert(root, 8);
 		root=bst.insert(root, 3);
 		root=bst.insert(root, 6);
 		root=bst.insert(root, 10);
 		root=bst.insert(root, 4);
 		root=bst.insert(root, 7);
 		root=bst.insert(root, 1);
 		root=bst.insert(root, 14);
 		root=bst.insert(root, 13);
 		root=bst.deleteRec(root, 10);
	}
}
