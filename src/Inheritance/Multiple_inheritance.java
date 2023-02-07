package Inheritance;

//Java doesnt support multiple inheritance


class A1
{
	void msg()
	{
		System.out.println("Hello");
	}
}

class B2
{
	void msg()
	{
		System.out.println("Welcome");
	}
}

class C1 extends A1,B1
{
public class Multiple_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 obj=new C1();
		obj.msg();

	}

}

}