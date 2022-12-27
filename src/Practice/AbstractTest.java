package Practice;

public abstract class AbstractTest {
 
	AbstractTest()
	{
		System.out.println("this is constructor");
	}
	
	public static void sing()
	{
		System.out.println("this is static method");
	}
	
	void dance()
	{
		System.out.println("this is nonabstrct/concrete method");
	}
	
	abstract void fun();
}

class subclass extends AbstractTest
{
	public void fun()
	{
		System.out.println("Implementation of abstract method");
	}

	public static void main(String[] args) {
		 AbstractTest s2=new subclass();
		 s2.dance();
		 s2.fun();
		 AbstractTest.sing();
	}
}
