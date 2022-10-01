package com.vaishav.sarthak.stack;
import java.util.Stack;
public class Paranthesis {
	
	
	public  boolean duplicateParenthesis(String ex) {
		if(ex.length()<3){
			return false;
		}
		Stack<Character> stack=new Stack();
		
		for(Character c: ex.toCharArray()) {
			if(c!=')' && c!='}' ) {
				stack.push(c);				
			}
			else {
				if(stack.peek()!='(') {					
				return true;				
				}
			}	
			while(stack.peek()!='(') {
				stack.pop();
			}
			stack.pop();
			
			return false;	
			}
		return true;
	}

		
}