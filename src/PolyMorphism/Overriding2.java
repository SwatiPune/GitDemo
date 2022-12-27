package PolyMorphism;

class Adder3
{
	void Add(int a,int b)
	{
		System.out.println(a+b);
	}
}
class Adder4 extends Adder3
{
	void Add(int c, int d)
	{
		System.out.println(c+d);
	}
}
public class Overriding2 {
	public static void main(String[] args) {
		//object of subclass
		Adder4 obj=new Adder4();
		 obj.Add(10, 5);
	}

}
