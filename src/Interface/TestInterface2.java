package Interface;

//Run configuration-Interface.TestInterface1
//we can achieve multiple inheritance
public interface TestInterface2 {
	int a=10;
	
	//abstract method
	abstract void run();
	
	//static method
	static void teach()
	{
		System.out.println("this is static method");
	}
	
	//default method
	default void speak()
	{
		System.out.println("this is default method");
	}
	
	//2nd abstrct method
	abstract void drink();
}	

 //2nd interface 
interface test1
{
	abstract void smoke();
}

class Test implements TestInterface2,test1
{
	public void run()
	{
		System.out.println("this is 1st abstract method");
	}
	
	public void drink()
	{
		System.out.println("this is 2nd abstract method");
	}
	
	public void smoke()
	{
		System.out.println("this is 3rd abstract method");
	}
}	

class TestInterface1
{
	public static void main(String[] args) {
		Test obj=new Test();
		obj.run();
		obj.drink();
		obj.smoke();
		obj.speak();
		TestInterface2.teach();   //we can use parent class to invoke static method
	}
}
