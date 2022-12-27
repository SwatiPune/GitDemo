package Inheritance;

//When two or more class inherits parents class

class Animals
{
	void eat()
	{
		System.out.println("Eating");
	}
}

class Lion extends Animals
{
	void roar()
	{
		System.out.println("Roaring..");
	}
}

class Peacock extends Animals
{
	void sing()
	{
		System.out.println("Singing....");
	}
}

public class Hieararchiacal_Inheritance {
 public static void main(String[] args) {
	          Peacock obj=new Peacock();
	          obj.eat();
	          obj.sing();
	          //obj.roar(); -----it will give ct error
}
}
