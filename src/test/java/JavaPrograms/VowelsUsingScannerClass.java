package JavaPrograms;

import java.util.Scanner;

public class VowelsUsingScannerClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		String temp="";
		for(int i=0; i<name.length();i++) {
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
			{
				temp=temp+name.charAt(i);
			}
		}
		System.out.println(temp+" ");
	}
}
