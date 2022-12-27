package PolyMorphism;


//subclass method must have same name as parent class method
//subclass method should have same parameter as parent class
//there should be a IS-A relationship

class vehicle
{
	void run()
	{
		System.out.println("Vehicle is running");
	}
}

class Bike extends vehicle
{
	void run()
	{
		System.out.println("Vehicle is running safely");
	}
}

public class Overriding {
	public static void main(String[] args) {
		//need to create object of subclass 
		Bike obj=new Bike();
		 obj.run();
	}
	

}
