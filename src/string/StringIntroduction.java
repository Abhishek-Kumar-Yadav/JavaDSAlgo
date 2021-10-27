package string;

public class StringIntroduction {
public static void main(String[] srgs) {
	String name="ABHISHEK";
	String sbstr="HIS";
	System.out.println(name);
	
	String cars="Hyundai,Maruti,Swift,Wagonr,Ferrari";
	String allcars[]=cars.split(",");
	
	for(String each: allcars )
		System.out.println(each);
	
	System.out.println(name.charAt(0));
	System.out.println(name.length());
	System.out.println(name.substring(4));
	System.out.println(name.substring(2, 5));
	System.out.println(name.contains(sbstr));// returns boolean
	System.out.println(name.concat(" YADAV"));
	System.out.println(name.replace('H', 'm'));
	System.out.println(name.toLowerCase());
	System.out.println(name.trim());// removes spaces form front and back
	
}
}
