package com.vaishnav.sarthak.HashMap;

import java.util.HashMap;

public class HigeshtFrequencyOfCharacter {

	public static void main(String[] args) {
		String str="ababa";
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(hm.containsKey(ch)) {
				int js=hm.get(i);
				int cd=js+1;
				hm.put(ch, cd);
			}
			else {
				hm.put(ch, 1);
			}			
		}	
		int mfc=str.charAt(0);
		for(Character key: hm.keySet()) {
			if(hm.get(key)>hm.get(mfc)) {
				mfc=key;
			}
		}
		System.out.println(mfc);

	}
}
