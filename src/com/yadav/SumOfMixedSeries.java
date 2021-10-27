package com.yadav;

public class SumOfMixedSeries {

	public static void main(String[] args) {
				float n=100;
				float sum=0;
				for(float i=1;i<=n;i++) {
					if(i%2!=0)
						sum=sum+1/i;
					else
						sum=sum-1/i;
				}
				System.out.println(sum);
		}

	}