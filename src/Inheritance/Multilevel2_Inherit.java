package Inheritance;

class A
{
	void A()
	{
		System.out.println("this is class A");
	}
}

class B extends A
{
	void B()
	{
		System.out.println("this is class B");
	}
}

class C extends B
{
	void C()
	{
		System.out.println("this is class C");
	}
}

public class Multilevel2_Inherit {
	   public static void main(String[] args) {
		 //need to create object of subchild class
		   C obj=new C();
		  obj.A();
		  obj.B();
		  obj.C();
	}

}
