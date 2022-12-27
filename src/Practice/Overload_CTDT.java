package Practice;

//by changing data type
class Adder1
{
	static int add(int a, int b)                  //int
	{
		return a+b;
	}
	
	static double add(double a, double b)        //double
	{
		return a+b;
	}
}

public class Overload_CTDT {
	
	public static void main(String[] args) {
		
		System.out.println(Adder1.add(10, 10));
		System.out.println(Adder1.add(10.5, 10.5));
		
	}

}
