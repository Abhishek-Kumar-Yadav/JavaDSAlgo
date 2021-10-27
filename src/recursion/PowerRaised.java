package recursion;

public class PowerRaised {

	public static void main(String[] args) {
		System.out.println(power(3,3));
		
		System.out.println(fastPow(3,3));

	}
	
	static int power(int a, int b) {
		if(b==0) {
			return 1;
		}
		return a*power(a,b-1);
	}
	
	
	static int fastPow(int a, int b) {
		if(b==0) {
			return 1;
		}
		if(b%2==0) {
			return a*fastPow(a,b-1);
		}
		return a*fastPow(a*a,b/2);
	}

}
