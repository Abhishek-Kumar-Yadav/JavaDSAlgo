package sets;

import java.util.*;

public class SetOperations {

	public static void main(String[] args) {
		
		Set<Integer> x=new HashSet<>();
		
		x.add(23);
		x.add(2);
		x.add(3);
		
		Set<Integer> y=new HashSet<>();
		y.add(3);
		y.add(1);
		y.add(21);
		
		
		x.retainAll(y);
		System.out.println(x);
		
		
	}

}
