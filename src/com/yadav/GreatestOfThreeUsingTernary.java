package com.yadav;

public class GreatestOfThreeUsingTernary {

	public static void main(String[] args) {
		
		int a=43;
		int b=24;
		int c=2;
		
		int max=a>b?a>c?a:c:b>c?b:c;
		int min=a<b?a<c?a:c:b<c?b:c;
		System.out.println(max);
		System.out.println(min);
	}

}
