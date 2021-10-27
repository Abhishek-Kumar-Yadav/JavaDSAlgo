package com.yadav;

import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mul=1;
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=0;i<b;i++) {
			mul=mul*a;
		}
		System.out.println(mul);
		sc.close();
	}

}
