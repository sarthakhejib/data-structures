package com.vaishnav.sarthak.tree;

public class Runner {

	public static void main(String[] args) {

		TreeNode rootNode = createBinaryTree();

		Traversals t = new Traversals();
		
		  t.recurPreOrder(rootNode);
		  t.preOrder(rootNode); 
		  System.out.println("Max:"+t.maxInBinaryTreeRecur(rootNode));
		  
		   t.recurInOrder(rootNode); 
		    t.inOrder(rootNode); 
		  t.levelOrderTraversal(rootNode); 
		  System.out.println(t.heightOfBinaryTree(rootNode)); 
		  t.preOrderAgain(rootNode); 
		   System.out.println(t.inOrderAgain(rootNode));
		   System.out.println(t.postOrder(rootNode));
	
		  t.levelOrderAgain(rootNode); 
		  System.out.println( t.ifExistsRecur(rootNode, 171)); 
		   System.out.println(t.ifExists(rootNode,6235));
		   System.out.println(t.sizeOfBinaryTree(rootNode)); 
		  System.out.println("InOrder:"); 
		  t.traverseInorder(rootNode); 
		  int key=13; 
		  t.insertionInBT(rootNode, 672); 
		  t.insertionInBinaryTree(rootNode,13);
		   System.out.println("After Insertion:"); 
		  t.traverseInorder(rootNode); 
		  System.out.println(t.size(rootNode)); 
		  System.out.println(t.sizeRecur(rootNode)); 
		  t.reverseLevelOrder(rootNode);
		   System.out.println( t.fullNode(rootNode)); 
		  System.out.println(t.halfNodes(rootNode)); 
		  System.out.println(t.diameterOfTree(rootNode));
		  t.recurPreOrder(rootNode);
		  t.size(rootNode); 
		  System.out.println(t.diameterOfTree(rootNode));
		  t.leftViewOfTree(rootNode, 0);
		   t.rightViewOfTree(rootNode, 0);
		  System.out.println(t.widthOfBinaryTree(rootNode));;
		  System.out.println(t.binaryTreePaths(rootNode));;
		  System.out.println(t.possibleSum(rootNode,78 ));
		  int sum=15;
		  sum-=rootNode.data;
		  System.out.println(t.depthFirstSearchForPathSum(rootNode, 15)); //int
		  int inOrder[]= {3,9,20,15,7};
		  int preOrder[]= {9,3,15,20,7};
		  System.out.println(t.buildTreeInPre(inOrder, preOrder)); int postOrder[]=
		  {9,1,2,12,7,5,3,11,4,8}; 
		  System.out.println(t.buildTreeInPost(inOrder, postOrder));
		  System.out.println(t.printAllAncestorsRecur( rootNode,11));
		  t.lowest(rootNode, 6); 
		  t.lowestCommonAncestor(rootNode, 7);
		  t.findLCA();
		  t.verticalSum(rootNode);
		 int preSequence[] = { 10, 12, 13, 14 };
		System.out.println(t.numberOfTreesPossibleFromPreOrderSquence(preSequence));
	}

	public static TreeNode createBinaryTree() {

		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(8);
		TreeNode node9 = new TreeNode(9);
		TreeNode node10 = new TreeNode(10);
		TreeNode node11 = new TreeNode(11);
		TreeNode node12 = new TreeNode(12);

		node1.leftNode = node2;
		node1.rightNode = node3;

		node2.leftNode = node4;
		node2.rightNode = node5;

		node3.leftNode = node6;
		node3.rightNode = node7;

		node4.leftNode = node8;

		node5.rightNode = node9;
		node5.leftNode = node10;

		node6.rightNode = node11;
		node6.leftNode = node12;

		return node1;
	}

}
