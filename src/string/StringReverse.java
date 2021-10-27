package string;

public class StringReverse {

	public static void main(String[] args) {
		
		String str="I Love Java, the coffee";
		str.trim();
		String str1[]=str.split(" ");
		
		for(int i=str1.length-1;i>=0;i--) {
			System.out.print(str1[i]+" ");
		}

	}

}
