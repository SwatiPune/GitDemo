package Abstract_Class;

//Run configuration-
//packagename.classname in which main method comes
//Abstract_Class.B

public abstract class A {
	
	//Constuctor
	A()
	{
		System.out.println("Hi Swati");
	}
	
	//Static method
	static void run()
	{
		System.out.println("Running");
	}
	
	//normal method-non abstract method
	 void speak()
	 {
		 System.out.println("Speaking...");
	 }
	 
	 //Abstract method with no body structure
	 abstract void fun();
	
}	 
//Subclass
class B extends A
{
	//Implementation of non abstract method
	void fun()
	{
		System.out.println("Hello Swara");
	}

	public static void main(String[] args) {
		 A obj=new B();
		 obj.fun();
		 obj.speak();
		 obj.run();
	}

}
