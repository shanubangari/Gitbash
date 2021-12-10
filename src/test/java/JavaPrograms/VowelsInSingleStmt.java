package JavaPrograms;

import java.util.LinkedHashSet;

public class VowelsInSingleStmt {

	public static void main(String[] args) {
		String s="Java Selenium cor Java";
		String[] str=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0; i<str.length; i++) {
			set.add(str[i]);
		}
			for( String word:set) {
				int count=0;
				for(int i=0; i<str.length;i++) {
					if(word.contains(str[i])) {
						count++;
					
				}
					
			}
				if(count==1)
				System.out.print(word);
			
		}

	}

}
