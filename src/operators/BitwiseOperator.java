package operators;

// 	BITWISE OPERATORS ARE   ( & , | , )

public class BitwiseOperator {

	public static void main(String[] args) {
		
		//int a=10;  // 10  ->  1010
		int b=13;  // 13  ->  1101
  // output should be 15  ->  1111
					
		//int c=a & b; 
	//	int c=a | b; 
		
		
		
//right shift  1101  -> 0110 -> 0011 -> 0001 -> 0000 -> 0000   Basically shifting the number towards right.
		
		int c=b<<1;
		System.out.println(c);
	}

}
