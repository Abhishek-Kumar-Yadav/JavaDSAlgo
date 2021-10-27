package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//import java.util.Scanner;

public class MyArrayList {

	public static void main(String[] args) {
		
//		ArrayList<String> fruits = new ArrayList<>();
		List<String> fruits = new LinkedList<>();
		List<String> Vegetables = new ArrayList<>();
		
		
		fruits.add("Apple");
		fruits.add("Orange");
		
		
		Vegetables.add("Potato");
		Vegetables.add("Tomato");
		Vegetables.add("Carrot");
		
		fruits.addAll(Vegetables);
		
		System.out.println(fruits);
		
		System.out.println(fruits.get(3));
		
		fruits.set(3, "Mango");
		System.out.println(fruits);
		
		
		
		
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
		
		
		
//		for(int i=0;i<n;i++)
//		{
//			String ch=sc.next();
//			fruits.add(ch);
//		}
			
//		System.out.println(fruits);
//		sc.close();
		
//		Pair<String,Integer> p1=new Pair("Hello",23);
//		
//		p1.getDescription();
//		
//		Pair<Boolean,Integer> p2=new Pair(true,23);
//		
//		p2.getDescription();

	}

}
