package com.yadav;

public class SumOfPositiveSeries {

	public static void main(String[] args) {
		float n=100;
		float sum=0;
		for(float i=1;i<=n;i++) {
			sum=sum+1/i;
		}
		System.out.println(sum);

	}

}
