package Inheritance;

//Class A <--- Class B<---Class C

class Animal1
{
	void eat()
	{
		System.out.println("eating...");
	}
}

class Dog1 extends Animal1
{
	void Bark()
	{
		System.out.println("Barking...");
	}
}

class BabyDog extends Dog1
{
	void meow()
	{
		System.out.println("Meowing....");
	}
}

public class Multilevel_Inheritance {
            public static void main(String[] args) {
				//need to create object of subchild class
            	BabyDog bd=new BabyDog();
				bd.meow();
				bd.Bark();
				bd.eat();
			}
}
