package PolyMorphism;

//by changing data types

public class Overloading_bychangingdatatype {

class Adder3
{
	static int add(int a, int b)
	{
		return(a+b);
	}
	
	static double add(double a, double b)
	{
		return(a+b);
	}
}
	public static void main(String[] args) {
		 System.out.println(Adder3.add(10, 10));
		 System.out.println(Adder3.add(10.5, 10.5));
	}
}
