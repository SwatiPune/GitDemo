package Super_Keyword;

//super keyword can be used to refer parent class variable
//super keyword can be used to invoke parent class method
//super keyword can be used to invoke parent class constructor

class Pets
{
	String color="White";
}

class Cat extends Pets
{
	String color="Black";
	
	void printcolor()
	{
		System.out.println(this.color);      //Black
		System.out.println(super.color);     //White
		System.out.println();
	}
}

public class TestSuper {
	public static void main(String[] args) {
		Cat c=new Cat();
		c.printcolor();
		
	}

}
