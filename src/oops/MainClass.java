package oops;


class Cat {
	
	boolean hasFur;
	String color,breed;
	int legs,eyes;
	
	public void walk() {
		System.out.println("Cat is Waliking");
	}
	public void eat() {
		System.out.println("Cat is eating");
	}
	public void sleep() {
		System.out.println("Cat is Sleeping");
	}
	
	public void description() {
		System.out.println("My cat has "+legs+" Legs and "+eyes+" eyes");
	}
}

class Dog{
	String breed,name;
	
	public void jump() {
		System.out.println("My Dog "+name+" is Jumping");
	}
	public void description() {
		System.out.println("My Dog name is "+name+" and its breed is "+breed);
	}
}


public class MainClass {

	public static void main(String[] args) {
		
		Cat cat1=new Cat(); // creates new object of cat class
		cat1.walk();
		Cat cat2=new Cat();
		cat2.sleep();
		
		cat1.legs=3;
		cat1.eyes=2;
		
		cat2.legs=4;
		cat2.eyes=1;
		
		cat1.description();
		cat2.description();
		
		Dog husky=new Dog();

		Dog poodle=new Dog();
		
		husky.breed="Husky";
		husky.name="Browny";
		
		poodle.breed="Poodle";
		poodle.name="Bravo";
		
		husky.jump();
		poodle.jump();
		
		husky.description();
		poodle.description();
	}

}
