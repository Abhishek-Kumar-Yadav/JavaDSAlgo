package sets;

import java.util.*;

public class MainCLass {

	public static void main(String[] args) {
		
//		Set<String> fruits=new HashSet<>();  //order is not same in output
//		Set<String> fruits=new LinkedHashSet<>(); //order will be same in output
		
		Set<String> fruits=new TreeSet<>();// gives sorted output
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Kiwi");
		fruits.add("Apple");
		
		
		System.out.println(fruits);
	}

}
