package PolyMorphism;

//two types of polymorphism
//1.compile time polymorphism- overloading
//2.Run time polymorphism-- Overrriding


//1.Overloading- if class has a multiple methods having same name but different in parameters.
//2 ways to overload method in java
//1.by changing no of arguments
//2.By changing data type.

class Adder
{
	static int add(int a, int b)
	{
		return a+b;
	}
	
	static int add(int a, int b, int c)
	{
		return a+b+c;
	}
	
}

public class Overloading_numofarguments {
        public static void main(String[] args) {
			System.out.println(Adder.add(11, 11));          //we can directly call static method by using class
			System.out.println(Adder.add(11, 11, 11));
		}
}
