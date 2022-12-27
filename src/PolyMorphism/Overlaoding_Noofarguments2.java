package PolyMorphism;

class Adder1
{
	public int add(int a, int b)
	{
		return(a+b);
	}
	
	public int add(int a, int b, int c)
	{
		return(a+b+c);
	}
}

public class Overlaoding_Noofarguments2 {
 public static void main(String[] args) {
	    //here we are not using static methods so we need to create object 
	 
	 Adder obj=new Adder();
	 System.out.println(obj.add(10, 5));
	 System.out.println(obj.add(10, 6, 10));
}
}
