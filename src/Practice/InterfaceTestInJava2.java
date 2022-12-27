package Practice;

//multiple inheritance possible through interface
public interface InterfaceTestInJava2 {
	  abstract void listen();                 //abstract method
	  
	  static void teach()                       //static method
	  {
		  System.out.println("this is static method");
	  }
	
	  default void speak()                     //default method
	  {
		  System.out.println("this is default method");
	  }
	  
	  abstract void drink();                     //2nd abstract method
}

interface java
{
	abstract void eat();                         //3rd abstrct method
}


class Testinter implements InterfaceTestInJava2,java
{
	public void listen()
	{
		System.out.println("Implementation of 1st abstract method");
	}
	
	public void drink()
	{
		System.out.println("Implementation of 2nd abstract method");
	}
	
	public void eat()
	{
		System.out.println("Implementation of 3rd abstrct method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Testinter obj=new Testinter();
		obj.listen();
		obj.drink();
		obj.eat();
		obj.speak();
		InterfaceTestInJava2.teach();                //for static method must call by using main class ie parent 

	}
}

