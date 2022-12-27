package Practice;

class A
{
	void A()
	{
		System.out.println("This is class A");
	}
}

class B extends A
{
	void B()
	{
		System.out.println("This is class B");
	}
}

class C extends B
{
	void C()
	{
	System.out.println("this is class C");
   }
}

public class MultiLevel {

	public static void main(String[] args) {
		C obj1=new C();
		obj1.A();
		obj1.B();
		obj1.C();
}

}
