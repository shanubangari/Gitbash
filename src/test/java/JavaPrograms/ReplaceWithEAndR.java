package JavaPrograms;

public class ReplaceWithEAndR {

	public static void main(String[] args) {
		String s="Bangalore";
		String res="";
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='e') {
				String s1 = s.charAt(i)+"";
				res=res+s1.replace('e', 'r');

			}
			else
			{
				res=res+s.charAt(i);
			}

		}	

		System.out.println(res);
	}

}
