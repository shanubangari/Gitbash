package JavaPrograms;

import java.util.LinkedHashSet;

public class CssCorp {

	public static void main(String[] args) {
		  String s="good morning, good afternoon, good night";
		     String[] str= s.split(" ");
		     LinkedHashSet<String> set=new LinkedHashSet<String>();
		     for(int i=0; i<str.length; i++){
		         set.add(str[i]);
		     }
		       
		       for(String word:set){
		           int count=0;
		           for(int i=0; i<str.length; i++){
		               if(word.contains(str[i])){
		                   count++;
		               }
		           }
		         
		               System.out.print(word+"="+count+" ");
		            
		       }

	}

}
