package Practice;

public abstract class S1
{
	S1()
	{
		System.out.println("This is constructor");
	}
	
	public static void run()
	{
		System.out.println("This is static method");
	}
	
	public void speak()
	{
		System.out.println("This is non abstarct method");
	}
	
	public abstract void fun();
}

class R extends S1
{
	public void fun()
	{
		System.out.println("this is implementation of abstract method");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   S1 obj=new R();
		   obj.fun();
		   obj.speak();

	}

}
