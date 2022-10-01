package com.vaishnav.sarthaak.array;

public class LongestValidString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="()()()()((())))()()()()()";
		// ()()(()()()()(())(()
		char c[]=str.toCharArray();
		//int i=0,j=i+1,k=j+1,count=0;
		int i=0,  temp =0, max=0;
		while(i<c.length) {
			
			if(c[i]=='(' && c[i+1]==')') {
				temp++;
				i=i+2;
			}else {
				temp=0;
				i++;
			}
			
			if(temp>max) {
				max = temp;
			}
		}

		/*
		 * while(k<c.length) { if(c[i]=='('&& c[j]==')'&& c[k]=='(') { count++; i++;
		 * j++; k++; } else { i++; j++; k++; } }
		 */
		System.out.println("The longest vaild string is: "+max); 
	}

}
