package com.yadav;

public class NestedForLoop {

	public static void main(String[] args) {
		int mul=1;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				mul=i*j;
				System.out.print(mul+ " ");
			}
			System.out.println();
		}

	}

}
