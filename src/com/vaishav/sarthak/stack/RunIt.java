package com.vaishav.sarthak.stack;

public class RunIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MyStack md=new MyStack();
		
		MyDStack md=new MyDStack();

	//	md.push(5); 
		md.push(6);
		//md.show();
		md.push(2);
		md.push(25);
		//md.show();
		md.push(89);
		//md.push(43);
//		md.push(4);
//		md.push(0);
		md.push(21);
		//md.push(11);
		md.show();
		


		md.pop();
		md.pop();
		md.pop();

		md.show();
		
		//System.out.println("Empty?:"+ms.isEmpty());
		
		/*
		 * ms.push(5); ms.push(6); ms.show(); ms.push(2); ms.push(25); ms.push(89);
		 * ms.push(43); ms.push(4); ms.push(0); ms.push(21); ms.push(11);
		 * 
		 * ms.show();
		 * 
		 * System.out.println("Empty?:"+ms.isEmpty());
		 * 
		 * System.out.println(ms.size()); 
		 * ms.pop();
		 * System.out.println(ms.size());
		 * 
		 */		
		//System.out.println(ms.peek());
		//ms.checkPalindromeArray();
		//ms.show();
	}

}
