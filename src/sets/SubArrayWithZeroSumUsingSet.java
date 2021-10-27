package sets;

import java.util.*;
public class SubArrayWithZeroSumUsingSet {

	public static void main(String[] args) {
		
		int[] a= {1,2,4,-7,8,9,0};
		
		boolean found=false;
		
		Set<Integer> set =new HashSet<>();
		int sum=0;
		
		for(int element:a) {
			set.add(sum);
			sum+=element;
			if(set.contains(sum)) {
				found=true;
				break;
			}
		}
		
		
		System.out.println("Found "+ found);


	}

}
