package Final_Keyword;

class A
{
	final void teach()
	{
		System.out.println("Teaching...");
	}
}

class B extends A
{
	void teach()
	{
		System.out.println("Singing...");
	}
}

public class Final_Method2 {
   public static void main(String[] args) {
	    B obj=new B();
	    obj.teach();
}
}
