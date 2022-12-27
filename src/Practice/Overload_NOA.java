package Practice;

//overloading by changing no of arguments

class Adder
{
	static int add(int a, int b)                  //2
	{
		return a+b;
	}
	
	static int add(int a, int b, int c)            //3
	{
		return a+b+c;
	}
}

public class Overload_NOA {
	public static void main(String[] args) {
		System.out.println(Adder.add(10, 5));           //we can direct call static method by using class no need to create object
		System.out.println(Adder.add(10, 15, 5));
		
	}

}
