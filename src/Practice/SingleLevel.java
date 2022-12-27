package Practice;

class Animal
{
	void eat()
	{
		System.out.println("Eating...");
	}
}

class Cat extends Animal
{
	void meow()
	{
		System.out.println("meowing...");
	}
}
public class SingleLevel {
	
	public static void main(String[] args) {
		Cat c=new Cat();
		c.meow();
		c.eat();
		
	}

}
