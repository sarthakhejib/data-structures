package com.vaishav.sarthak.Recursion;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {	
	private static void permuteSequence(String str, int n,int k,List<String> list,  int index, String ar[]){
		String kth="";
		if(index>=str.length()){
			list.add(str);            
			kth=list.get(0).toString();
			return;
		}
		else{
			for(int i=index;i<str.length();i++){
				swap(i,index,str);
				permuteSequence(str,n,k,list,index+1,ar);
				swap(i,index,str);
			}
		}
	}

	 private static void permuteSequence(List<List<String>> ans,String str, int n,int k,String[] ar,  int index){
       String s="";
        if(index==str.length()){
            ans.add(toList(ar));
            s=ans.get(k).toString();
            return ;
        }
        else{
            for(int i=index;i<str.length();i++){
                swap(i,index,str);
                permuteSequence(ans,str,n,k,ar,index+1);
                swap(i,index,str);
                            
            }
        }
    }

    private static List<String> toList(String ar[]){
        List<String> list=new ArrayList<>();
        for(int i=0;i<ar.length;i++){
            list.add(ar[i]);
        }
        return list;
    }
    
//    private static String get(int k) {
//    	l
//    }
    private static void swap(int i, int index,String str){
        char[] ch=str.toCharArray(); 
        
        char temp=ch[i];
        ch[i]=ch[index];
        ch[index]=temp;
    }
    
    
    
    public static String getPermutation(int n, int k) {
       String ar[]=new String[362880];
        List<List<String> > ans=new ArrayList<>();
        String str="";
        for(int i=1;i<=n;i++){
            str+=i;
        }
        String str1="";
        int index=0;
     
        permuteSequence(ans,str,n,k, ar, index);
        return str1;
    }
	public static void main(String[] args) {		

		System.out.println(getPermutation(3,3));

		//		String str1="";
		//		for(int j=0;j<=4;j++) {
		//			str1+=j;
		//		}
		//		int i=2;
		//		System.out.println(str1);
		//		

	}

}
