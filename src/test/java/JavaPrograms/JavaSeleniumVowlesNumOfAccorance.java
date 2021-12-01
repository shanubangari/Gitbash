package JavaPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class JavaSeleniumVowlesNumOfAccorance {

	public static void main(String[] args) {
		String s="JavaSelenium";
		String temp="";
		//int count=0;
		for(int i=0; i<s.length(); i++) {

			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o' ||s.charAt(i)=='u') {
				temp=temp+s.charAt(i);

			}

		}
		System.out.println(temp);
		
		 //System.out.println(temp);
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0; i<temp.length();i++) {

			set.add(temp.charAt(i));
		}
		for(Character ch:set) {
			int count=0;
			for(int i=0; i<temp.length();i++) {
				if(ch==temp.charAt(i)) {
					count++;
				}
			}
			System.out.println(ch+" "+count);
		} 


	}
}


