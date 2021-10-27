package encapsulation;

public class Student {
	private String name;
	private int age;
	
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age>18 || age<10) {
			System.out.println("Fool...Go to high School");
		}
		else {
			this.age=age;		
		}
	
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}

}
