package userInputScanner;

import java.util.Scanner;
public class ScannerInput {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	/*	
	 	System.out.println("Enter the int value:- ");		
		int x=sc.nextInt();
		System.out.println("Enter the double value:- ");	
		double y=sc.nextDouble(); 
	*/
		System.out.println("Enter the String:- ");	
		String str=sc.nextLine();
	//	System.out.println(x);
	//	System.out.println(y);
		System.out.println(str);
		
		sc.close();

	}

}
