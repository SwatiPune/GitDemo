package Practice;

class Animal1
{
	void eat()
	{
		System.out.println("eating...");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking");
	}
}

class BabyDog extends Dog
{
	void puppy()
	{
		System.out.println("Pupping...");
	}
}

public class Multilevel2 {
	
	public static void main(String[] args) {
		
		BabyDog bd=new BabyDog();
		bd.eat();
		bd.bark();
		bd.puppy();
		
	}

}
