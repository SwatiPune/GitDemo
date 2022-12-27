package Practice;

//default,abstarct,static method

public interface InterfaceTest {
	  abstract void run();                //abstarct method
	
	  public static void walk()           //static
	  {
		  System.out.println("hello");
	  }
	  
	  default void teach()                  //default method
	  {
		  System.out.println("hi");
	  }
}	  
	  
class Test1 implements InterfaceTest
{
	 public void run()
	 {
		 System.out.println("abstrct method implementation");
	 }

	public static void main(String[] args) {
		    //object of subclass
		 Test1 obj=new Test1();
		 obj.run();
		 obj.teach();
		 InterfaceTest.walk();
		 
	}

}


