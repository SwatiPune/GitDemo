package Abstract_Class;

//Run configuration-Abstract_Class.R
public abstract class S {
	
	S()
	{
		System.out.println("This is a constructor");
	}
	
	static void speak()
	{
		System.out.println("This is static method");
	}
	
	void read()
	{
		System.out.println("This is non abstrct method");
	}
	
	abstract void eat();
}	
class R extends S
{
	void eat()
	{
		System.out.println("Implementation of Abstrct method");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
              S obj=new R();
              obj.eat();
              obj.read();
              obj.speak();
	}

}
