package Newfolder;

import java.util.LinkedHashSet;

public class PractiseJava {

	public static void main(String[] args) {

		String s="hucheshlokappamulagund";
		String temp="";
	
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)=='a') {
			set.add(s.charAt(i));
			}
		}
		
		for(Character ch:set) {
			int count=0;
			for(int i=0; i<s.length(); i++) {
				if(ch==s.charAt(i)) {
					count++;
				}
			}
			System.out.println(ch+"="+count+" ");
		}
		
		for(int i=s.length()-1; i>=0;i--) {
			temp=temp+s.charAt(i);
		}
		System.out.println(temp);
		
		
			
	}

}
