package Practice;

//subclass method must have same name and same parameter as parent class method
//there must be IS-A relationship

class Vehicle
{
	void run() 
	{
	  System.out.println("Running safely");	
	}
}

class Bike extends Vehicle
{
	 void run()
	 {
		 System.out.println("Walk safely");
	 }
}

public class Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike obj=new Bike();
		obj.run();

	}

}
