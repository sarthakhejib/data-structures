package com.vaishnav.sarthak.tree;
/*						1
 * 					2		3		(logn) 
 *				 4    5   6   7
 * 		3
 * 		  5	  O(n)   --AVL tree, red black tree
 * 			7
 * "HashMap internally maintain an AVL tree!"
 */

public class TreeNode {
	
	TreeNode leftNode;
	TreeNode rightNode;
	int data;
	int key;
	
	public TreeNode(int data) {
		this.data=data;
		leftNode=null;
		rightNode=null;
	}
	
}
