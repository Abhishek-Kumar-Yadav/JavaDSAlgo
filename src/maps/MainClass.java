package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		
		Map<String,Integer> numbers=new HashMap<>();
		
		numbers.put("Abhishek", 23);
		numbers.put("Abhishe", 32);
		numbers.put("Abhish", 42);
		numbers.put("Abhis", 52);
		
		System.out.println(numbers);
		numbers.putIfAbsent("Abhishek", 33);
		System.out.println(numbers);
		System.out.println(numbers.keySet());
		System.out.println(numbers.values());
		
		
		//Understand this
		Set<Entry<String,Integer>> entries=numbers.entrySet();
		
		for(Entry<String,Integer> entry:entries) {
			entry.setValue(entry.getValue()*100);
		}
		
		System.out.println(numbers);

	}

}
