package com.yadav;

import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		int x=0;
		int y=1;
		int sum;
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter the range ");
		int n=sc.nextInt();
		System.out.print(x+" "+y);
		for (int i=0;i<n-2;i++) {
			sum=x+y;
			System.out.print(" "+sum);
			x=y;
			y=sum;
			sc.close();
		}
	}
}
