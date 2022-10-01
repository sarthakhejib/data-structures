package com.vaishnav.sarthak.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.ArrayList;
import java.util.HashMap; 

/*						1
 * 					2		3		(logn) 
 *				 4    5   6   7
 * 		3
 * 		  5	  O(n)   --AVL tree, red black tree
 * 			7
 */
/*	Pre-Order traversal: 1 2 4 5 3 6 7  (DLR)	
 *  In-order traversal: 4 2 5 1 6 3 7 (LDR)	
 *  Post order traversal: 7 6 3 5 4 2 1	 (RLD)
 *  Level order traversal: 1 2 3 4 5 6 7
 */ 
// Height of binary tree, LCA, root to leaf paths, etc.
// Construct trees using traversals
// Binary search tree, AVL and Red-Black
// Depth first search, breadth first search

public class Traversals {

	public void recurPreOrder(TreeNode root) {

		if(root==null)
			return;

		System.out.print(root.data+" ");
		recurPreOrder(root.leftNode);
		recurPreOrder(root.rightNode);
	}

	public void recurInOrder(TreeNode root) {

		if(root==null)
			return;

		recurInOrder(root.leftNode);
		System.out.print(root.data+" ");
		recurInOrder(root.rightNode);
	}

	public void preOrder(TreeNode root) {

		if(root==null)
			return;

		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);

		while(!stack.isEmpty()) {

			TreeNode node = stack.pop();
			System.out.print(node.data+ " ");

			if(node.rightNode!=null)
				stack.push(node.rightNode);

			if(node.leftNode!=null)
				stack.push(node.leftNode);
		}		
	}

	public void inOrder(TreeNode root) {

		if(root==null)
			return;

		Stack<TreeNode> stack=new Stack<>();

		while(true) {
			while(root!=null) {
				stack.push(root);
				root = root.leftNode;
			}

			if (stack.isEmpty()) return;

			root = stack.pop();
			System.out.println(root.data);
			root = root.rightNode;
		}	

	}

	public int maxInBinaryTreeRecur (TreeNode root) {

		int maxValue = Integer.MIN_VALUE;

		if(root!=null) {
			int maxLeftSide = maxInBinaryTreeRecur(root.leftNode);
			int maxRightSide = maxInBinaryTreeRecur(root.rightNode);

			if(maxLeftSide>maxValue)
				maxValue = maxLeftSide;

			if(maxRightSide>maxValue)
				maxValue = maxRightSide;

			if(root.data>maxValue)
				maxValue = root.data;
		}		
		return maxValue;
	}

	public  void preOrderAgain(TreeNode root) {
		Stack<TreeNode> stack=new Stack<>();
		stack.push(root);

		if(root==null)
			return;

		while(!stack.isEmpty()) {
			TreeNode node=stack.pop();
			System.out.println(node.data+" ");

			if(node.rightNode!=null)
				stack.push(node.rightNode);

			if(node.leftNode!=null)
				stack.push(node.leftNode);			
		}		
	} 

	public ArrayList<Integer> inOrderAgain(TreeNode root){

		if(root==null)
			return new ArrayList<>();

		ArrayList<Integer> list=new ArrayList<>();
		Stack <TreeNode>stack=new Stack<>();
		TreeNode current=root;

		while(current!=null||!stack.isEmpty()) {
			while(current!=null) {
				stack.push(current);
				current=current.leftNode;
			}

			current=stack.pop();
			list.add(current.data);
			current=current.rightNode;
		}
		return list;
	}

	//TO DO - Complete the program
	public LinkedList<Integer> postOrder(TreeNode root){
		LinkedList<TreeNode> stack= new LinkedList<>();
		LinkedList <Integer> list=new LinkedList<>();

		if(root==null)
			return list;
		stack.add(root);
		while(!stack.isEmpty()) {
			TreeNode node=stack.pollLast();
			list.addFirst(node.data);
			for(TreeNode child:stack) {}

		}
		return list;
	}

	public void levelOrderTraversal(TreeNode root) {

		if(root==null)
			return;

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		while(!queue.isEmpty()) {

			root = queue.remove();
			System.out.println(root.data);

			if(root.leftNode!=null)
				queue.add(root.leftNode);

			if(root.rightNode!=null)
				queue.add(root.rightNode);

		}

	}

	//	 //  1, null
	//	 *  null, 2, 3
	//	 *  2, 3, null 		height =1
	//	 *  3, null, 4, 5
	//	 *  null, 4, 5, 6, 7
	//	 *  4, 5, 6, 7, null		height =2
	//	 *  5, 6, 7, null
	//	 *  6, 7, null
	//	 *  7, null
	//	 *  null 	height =3
	//	 */ 
	//	
	public int heightOfBinaryTree (TreeNode root) {

		if(root==null)
			return -1;

		int height = 0;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		queue.add(null);

		while(!queue.isEmpty()) {

			root = queue.remove();
			if(root==null) {
				height++;
				if(!queue.isEmpty())
					queue.add(null);
			} else {
				if(root.leftNode!=null)
					queue.add(root.leftNode);

				if(root.rightNode!=null)
					queue.add(root.rightNode);
			}
		}

		return height;
	}

	/*	Pre-Order traversal: 1 2 4 5 3 6 7  (DLR)
	 *  In-order traversal: 4 2 5 1 6 3 7 (LDR)
	 *  Post order traversal: 7 6 3 5 4 2 1	 (RLD)
	 *  Level order traversal: 1 2 3 4 5 6 7
	 *  
	 *  root to leaf paths - 1,2,4
	 *  					1,2, 5
	 *  1,3,6
	 *  1,3,7
	 *  
	 */


	//TO do: Same as above problem but using recursion.
	public boolean ifExistsRecur(TreeNode root,int element) {
		if(root==null)
			return false;

		if(root.data==element)
			return true;

		return(ifExistsRecur(root.leftNode,element)||ifExistsRecur(root.rightNode,element));
		//return();
	}

	public boolean ifExists(TreeNode root,int element) {

		if(root==null)
			return false;

		if(root.data==element)
			return true;

		Queue <TreeNode > qt=new LinkedList<>();
		qt.add(root);
		while(!qt.isEmpty()) {
			root=qt.remove();
			if(root.data==element)
				return true;
			if(root!=null) {  
				if(root.leftNode!=null)
					qt.add(root.leftNode);

				if(root.rightNode!=null)
					qt.add(root.rightNode);
			}
		}
		return false;
	}

	public void insertionInBT(TreeNode root,int element) {
		Queue<TreeNode> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			root=q.remove();
			if(root.leftNode==null) {
				root.leftNode=new TreeNode(element);
				break;
			}
			else
				q.add(root.leftNode);

			if(root.rightNode==null) {
				root.rightNode= new TreeNode(element);
				break;

			}
			else
				q.add(root.rightNode);
		}
	}

	public void levelOrderAgain(TreeNode root) {

		Queue <TreeNode> q=new LinkedList<>();
		q.add(root);

		while(!q.isEmpty()) {		
			root=q.remove();
			System.out.println(root.data); 

			if(root.leftNode!=null)
				q.add(root.leftNode);

			if(root.rightNode!=null)
				q.add(root.rightNode);			
		}	
	}

	public void insertionInBinaryTree(TreeNode root,int key) {

		Queue<TreeNode> q1=new LinkedList<>();
		q1.add(root);

		while(!q1.isEmpty()) {
			root=q1.remove();
			//System.out.println(root.data);

			if(root.leftNode==null) {
				root.leftNode=new TreeNode(key);
				break;
			}
			else 
				q1.add(root.leftNode);


			if(root.rightNode==null) {
				root.rightNode=new TreeNode(key);
				break;
			}
			else
				q1.add(root.rightNode);

		}

	}

	public int sizeOfBinaryTree(TreeNode root ) {
		int count=0;
		Queue <TreeNode> q=new LinkedList<>();
		q.add(root);

		while(!q.isEmpty()) {
			count++;
			root=q.remove();
			//System.out.println(root.data);

			if(root.leftNode!=null)
				q.add(root.leftNode);

			if(root.rightNode!=null)
				q.add(root.rightNode);			
		}
		return count;
	}

	public void deleteElement(TreeNode root,int element) {
		if(root==null)
			return ;

	}



	public void traverseInorder(TreeNode root) {

		if(root==null)
			return;

		traverseInorder(root.leftNode);
		System.out.print(root.key+" ");
		traverseInorder(root.rightNode);		
	}


	public int sizeRecur(TreeNode root) {
		int leftCount=root.leftNode==null? 0:sizeRecur(root.leftNode);
		int rightCount=root.rightNode==null? 0:sizeRecur(root.rightNode);
		return 1+leftCount+rightCount;
	}

	public void reverseLevelOrder(TreeNode root) {

		if (root == null)
			return;

		Queue<TreeNode> qu = new LinkedList<>();
		Stack<TreeNode> s = new Stack<>();

		qu.offer(root);

		while (!qu.isEmpty()) {
			TreeNode temp = qu.poll();

			if (temp.leftNode != null)
				qu.offer(temp.leftNode);

			if (temp.rightNode != null)
				qu.offer(temp.rightNode);

			s.push(temp);
		}
		while (!s.isEmpty()) {
			System.out.println(s.pop().data);
		}
	}

	public int fullNode(TreeNode root) {
		int count=0;
		if(root==null)
			return 0;

		Queue<TreeNode> fullQueue=new LinkedList<>();
		fullQueue.add(root);
		while (!fullQueue.isEmpty()) {
			TreeNode temp = fullQueue.remove();

			if (temp.leftNode != null && temp.rightNode != null)
				count++;

			if (temp.leftNode != null)
				fullQueue.add(temp.leftNode);

			if (temp.rightNode != null)
				fullQueue.add(temp.rightNode);
		}

		return count;
	}

	//Or condition was incorrect. Now its correct. 
	public int halfNodes(TreeNode root) {
		int count=0;

		Queue<TreeNode>halfQueue=new LinkedList<>();
		halfQueue.add(root);
		while(!halfQueue.isEmpty()) {
			TreeNode temp=halfQueue.remove();
			if( (temp.leftNode!=null && temp.rightNode==null) || (temp.rightNode!=null && temp.leftNode==null))
				count++;

			if(temp.leftNode!=null)
				halfQueue.add(temp.leftNode);

			if(temp.rightNode!=null)
				halfQueue.add(temp.rightNode);
		}	
		return count;
	}

	//TO DO: Check the logic, didnt give the right result. Could also be an issue with the tree creation.
	public int diameterOfTree(TreeNode root) {

		if(root==null)
			return 0;

		int left=diameterOfTree(root.leftNode);
		int right=diameterOfTree(root.rightNode);

		return Math.max(left, right)+1;
	}
	int maxLevel=0;
	public void leftViewOfTree(TreeNode root,int level) {
		if(root==null)
			return;

		if(level>=maxLevel) {
			System.out.println(root.data);
			maxLevel++;
		}
		leftViewOfTree(root.leftNode,level+1);
		leftViewOfTree(root.rightNode,level+1);			
	}

	public void rightViewOfTree(TreeNode root,int level ) {
		if(root==null)
			return;

		if(level>=maxLevel) {
			System.out.println(root.data);
			maxLevel++;
		}
		rightViewOfTree(root.rightNode,level+1);
		rightViewOfTree(root.leftNode,level+1);
	} 

	public int widthOfBinaryTree(TreeNode root) {
		int max=Integer.MIN_VALUE; 

		if(root==null)
			return -1;

		Queue<TreeNode> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			int count =q.size();
			max=Math.max(count, max);
			//System.out.println(root.data); 

			while(count -- >0) {
				root=q.remove();

				if(root.leftNode!=null)
					q.add(root.leftNode);

				if(root.rightNode!=null)
					q.add(root.rightNode);					
			}
		}
		return max;		
	}	

	public List<String> binaryTreePaths(TreeNode root){
		List<String> result =new ArrayList<>();
		if(root==null)
			return result;

		String currentPath=Integer.toString(root.data);
		if(root.leftNode==null && root.rightNode==null)
			result.add(currentPath);

		if(root.leftNode!=null)
			depthFirstSearch(root.leftNode,result,currentPath);

		if(root.rightNode!=null)
			depthFirstSearch(root.rightNode,result,currentPath); 

		return result;
	}

	public void depthFirstSearch(TreeNode root,List<String> result,String currentPath) {
		currentPath+="->"+root.data;
		if(root.leftNode==null && root.rightNode==null) {
			result.add(currentPath);
			return;				
		}

		if(root.leftNode!=null)
			depthFirstSearch(root.leftNode,result,currentPath);

		if(root.rightNode!=null)
			depthFirstSearch(root.rightNode,result,currentPath); 		 
	}

	public boolean possibleSum(TreeNode root, int sum) {
		Queue <TreeNode> q=new LinkedList<>();
		q.add(root);
		sum-=root.data;

		while(!q.isEmpty()) {
			if(root==null)
				return false;
			if(sum<0)
				return false; 
			root=q.remove();

			if(root.leftNode!=null) {
				sum-=root.leftNode.data;
				q.add(root.leftNode);
			}
			if(root.rightNode!=null) {
				sum-=root.rightNode.data;
				q.add(root.rightNode);	
			}			
			if(sum==0)
				return true;
		}
		return false;
	}

	public boolean depthFirstSearchForPathSum(TreeNode root,int sum) {
		if(root==null)
			return false;

		if(sum==0)
			return true;

		if(root.leftNode==null && root.rightNode==null && root.data==sum) 
			return true;				

		else
			return(depthFirstSearchForPathSum(root.leftNode,sum-root.data)||depthFirstSearchForPathSum(root.rightNode,sum-root.data));		
	}

	public TreeNode mirrorImageOfBinaryTree(TreeNode root) {
		TreeNode temp;
		if(root!=null) {
			mirrorImageOfBinaryTree(root.leftNode);
			mirrorImageOfBinaryTree(root.rightNode);

			temp=root.leftNode;
			root.leftNode=root.rightNode;
			root.rightNode=temp;
		}
		return root;
	}
	
	HashMap<Integer,Integer> hm=new HashMap<>();
	int preStart=0;
	public TreeNode buildTreeInPre(int[] inorder,int[] preorder) {
		for(int i=0;i<inorder.length;i++)
			hm.put(inorder[i], i);
		return buildTreeHelperInPre(inorder,preorder,0,inorder.length-1);
	}
	
	public TreeNode buildTreeHelperInPre(int [] inOrder,int[] preOrder,int start, int end ) {
		if(start>end) 
			return null;
		
		TreeNode root=new TreeNode(preOrder[preStart++]);
	  	
		if(start==end)
			return root;
		
		int index=hm.get(root.data);
		
		root.leftNode=buildTreeHelperInPre(inOrder,preOrder,start,index-1);
		root.rightNode=buildTreeHelperInPre(inOrder,preOrder,index+1,end);
		
		return root;
	}

	public TreeNode buildTreeInPost(int inOrder[],int postOrder[])	{
		return buildTreeHelperInPost(inOrder,postOrder,0,inOrder.length-1,0,postOrder.length-1);
	}
	
	public TreeNode buildTreeHelperInPost(int inOrder[],int postOrder[],int inStart,int inEnd,int postStart,int postEnd) {
		if(inStart>inEnd)
			return null;
		
		int rootVal=postOrder[postEnd];
		TreeNode root=new TreeNode(rootVal);
 		
		int rootIndex=inStart;
		for(;rootIndex<inOrder.length;rootIndex++) {
			if(inOrder[rootIndex]==rootVal)
				break;
		}
		int leftSize=rootIndex-inStart;
		int rightSize=inEnd-rootIndex;
		
		root.leftNode=buildTreeHelperInPost(inOrder,postOrder,inStart,rootIndex-1,postStart,postStart+leftSize-1	);
		root.rightNode=buildTreeHelperInPost(inOrder,postOrder,rootIndex+1,inEnd,postEnd-rightSize,postEnd-1	);
		
		return root;
	}
	
	public boolean printAllAncestorsRecur(TreeNode root, int target) {
		if(root==null)
			return false;
		
		if(root.data==target)
			return true;
		
		if	(printAllAncestorsRecur(root.leftNode,target)||
				printAllAncestorsRecur(root.rightNode,target)) {
			System.out.print (root.data+"  ");
			return true;			
		}
		return false;			
	}
	ArrayList<Integer> list1=new ArrayList<>();
	ArrayList<Integer> list2=new ArrayList<>();
	//Stack<Integer> stack1=new Stack<>();
	//Stack<Integer> stack2=new Stack<>();

	public boolean lowestCommonAncestor(TreeNode root,int targetOne ) {			
		if(root==null)
			return false;
		
		if(root.data==targetOne )
			return true;	
		
		if(lowestCommonAncestor(root.leftNode,targetOne)||lowestCommonAncestor(root.rightNode,targetOne)) {
			list1.add(root.data);
			//stack1.push(root.data);
			return true;
		}			
	return false;	
	}
	
	public void findLCA() {
		int i=0,j=0;
		while(i<list1.size()-1 && j<list2.size()-1 && list1.get(i)==list2.get(j)) {
			i++;j++;
		}
		i--;
		j--;
		System.out.println(list1.get(i));
					
	}
	
	public boolean lowest(TreeNode root,int targetTwo) {
		if(root==null)
			return false;
		
		if(root.data==targetTwo)
			return true;
		
		if(lowest(root.leftNode,targetTwo)||lowest(root.rightNode,targetTwo)) {
			list2.add(root.data);
			//stack2.push(root.data);
			return true;
		}
		return false;
	}
	
	public void vSum(HashMap<Integer,Integer> map,int d,TreeNode root) {
		if(root==null)
			return ;
		
		if(root.leftNode!=null)
			vSum(map,d-1,root.leftNode);
		
		if(root.rightNode!=null)
			vSum(map,d+1,root.rightNode);
		
		int data=0;
		
		if(map.containsKey(d)) {
			data=map.get(d);
			map.put(d, root.data+data);
		}
	}
	
	public void verticalSum(TreeNode root) {
		HashMap<Integer,Integer> map =new HashMap<>();
		vSum(map,0,root);
		System.out.println();
		for(int k:map.keySet()) {
			System.out.println("Position"+k+"sum"+map.get(k)+" ");
		}
	}
	
	public int numberOfTreesPossibleFromPreOrderSquence(int preSequence[]) {
		int n=preSequence.length-1;
		int temp[]=new int[n+1];
		
		for(int i=0;i<=n;i++)
			temp[i]=0;
		temp[0]=temp[1]=1;
		
		for(int i=2;i<n;i++) {
			for(int j=0;j<i;j++) {
				temp[i]+=temp[j]*temp[i-j-1];
			}
		}
		return temp[n-1];
	}
	
	/*
	 * public TreeNode kthAncestor(TreeNode root,int k) { if(root==null) return
	 * null;
	 * 
	 * TreeNode temp=null;
	 * 
	 * if(temp=kthAncestor(root.leftNode,k)!=null||
	 * temp=kthAncestor(root.rightNode,k)!=null) { if(k>0) k--;
	 * 
	 * else { System.out.println(); }
	 * 
	 * }
	 */
			
		
	

	
}