package JavaPrograms;

public class GcdLeastNum {

	public static void main(String[] args) {
		int n=48;//48, 48, 48
		int n1=24;//23, 24, 24
		int gcd=0;//0, 0,0 
		int lnum=n;
		if(n>n1) {
			lnum=n1;
		}
		for(int i=1; i<=lnum; i++) { //i<=lnum--> 24, i<lnum--->12, for(int i=lnum; i>1; i--)-->0
			if(n%i==0 && n1%i==0) {
				gcd=i;
			}
		}
		
		System.out.println(gcd);//0,24, 12
	}
}
