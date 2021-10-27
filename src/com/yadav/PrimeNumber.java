package com.yadav;

public class PrimeNumber {

	public static void main(String[] args) {
		int a=3;
		int b=53;
		
		for(int i=a;i<=b;i++) {
			boolean isPrime=true;
			for(int j=2;j*j<=i;j++) {
				if(i%j==0) {
					isPrime=false;
				}
			}
			if(isPrime==true)
				System.out.println(i);
		}

	}

}
