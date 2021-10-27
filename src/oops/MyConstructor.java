package oops;

//class Vehicle{
//	int wheels=4;
//	
//	Vehicle(int noOfWheels){
//		wheels=noOfWheels;
//	}
//}

class Vehicle{
	int wheels=4;
	int headlight;
	String color;
	
	Vehicle(int wheels){
		this.wheels=wheels;
		headlight=2;
	}
	
	Vehicle(int wheels, String color){
		this.wheels=wheels;
		headlight=2;
		this.color=color;
	}
}


public class MyConstructor {
	
	MyConstructor(){
		System.out.println("Object is created");
	}

	public static void main(String[] args) {
		
		//MyConstructor obj=new MyConstructor();
		Vehicle car=new Vehicle(4);
		System.out.println(car.wheels);
		System.out.println(car.headlight);
		System.out.println();
		Vehicle bus=new Vehicle(6);
		System.out.println(bus.wheels);
		System.out.println(car.headlight);	
		System.out.println();
		Vehicle Rolls=new Vehicle(4,"Blue");
		System.out.println(Rolls.wheels);
		
		System.out.println(Rolls.headlight);
		System.out.println(Rolls.color);
		
		

	}

}
