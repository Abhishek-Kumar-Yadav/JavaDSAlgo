package recursion.advancequestions;

import java.util.HashSet;
import java.util.Set;

public class PermutaionOfString {
	static Set<String> set =new HashSet<>();

	public static void main(String[] args) {
		String s1="abcd";
		perStr(s1,0,s1.length()-1);
		
		

	}
	
	static void perStr(String s, int l, int r) {
		if(l==r) {
			if(set.contains(s))return;
			set.add(s);
			System.out.println(s);
			return;
		}
		for(int i=l;i<=r;i++) {
			s=interChangeChar(s,l,i);
			perStr(s,l+1,r);
			s= interChangeChar(s,l,r);
			
		}
		
	}
	
	static String interChangeChar(String s, int a, int b) {
		char array[]=s.toCharArray();
		char temp=array[a];
		array[a]=array[b];
		array[b]=temp;
		
		return String.valueOf(array);
	}

}
