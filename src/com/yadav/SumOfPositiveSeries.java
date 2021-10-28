package com.yadav;

import java.util.Arrays;

public class SumOfPositiveSeries {

	public static void main(String[] args) {
//		float n=100;
//		float sum=0;
//		for(float i=1;i<=n;i++) {
//			sum=sum+1/i;
//		}
//		System.out.println(sum);
		int[] arr1= {0,1,3,7};
		int[] arr2= {2,4,5,8,9};
		int n=4,m=5;
		int[]arr3=new int[n+m];
		 for(int i=0;i<n;i++){
		        arr3[i]=arr1[i];
		    }
		 
//		 for(int i:arr3) {
//		    	System.out.print(i+ " ");
//		    }
		    int k=n;
		    
//		    System.out.println(arr3.length);
		    for(int i=0;i<m;i++){
		        arr3[k]=arr2[i];
//		        System.out.println(k);
		        k++;

		        
		    }
//		    for(int i:arr3) {
//		    	System.out.print(i+ " ");
//		    }
		    Arrays.sort(arr3);
		    for(int i:arr3) {
		    	System.out.print(i+ " ");
		    }

	}

}
