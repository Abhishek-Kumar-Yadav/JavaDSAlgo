package sets;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithSumK {

	public static void main(String[] args) {
		int[] a= {1,2,4,-7,8,9,0};
		int k=4;
		boolean found=false;
		
		Set<Integer> set =new HashSet<>();
		int sum=0;
		
		for(int element:a) {
			set.add(sum);
			sum+=element;
			if(set.contains(sum-k)) {
				found=true;
				break;
			}
		}
		
		
		System.out.println("Found "+ found);

	}

}
