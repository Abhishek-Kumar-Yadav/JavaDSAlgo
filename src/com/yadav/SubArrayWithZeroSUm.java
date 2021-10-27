package com.yadav;
//without Set
public class SubArrayWithZeroSUm {

	public static void main(String[] args) {
		int[] a= {1,2,4,-7,8,9,0};
		
		boolean found=false;
		
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=i;j<a.length;j++) {
				sum+=a[j];
				if(sum==0) {
					found=true;
					break;
				}
			}
			if(found) break;
		}
		System.out.println("Found "+ found);

	}

}
