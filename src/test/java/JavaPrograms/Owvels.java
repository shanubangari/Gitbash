package JavaPrograms;

public class Owvels {
	public static void main(String[] args) {
		String s="Bangalore";
		for(int i=0; i<s.length(); i++) {
			//if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
			if(s.charAt(i)!='a'|| s.charAt(i)!='e'|| s.charAt(i)!='i' || s.charAt(i)!='o' || s.charAt(i)!='u'){
				System.out.print(s.charAt(i));//aaoe
			}
		}

	}

}
