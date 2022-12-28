package Inheritance;

//when one class inherits another class is called single level inheritance
//when u inherit from existing class then you can reuse methods and fields of parent class

//Parent class
class Animal
{
	void eat()
	{
		System.out.println("Eating..");
	}
}

//Child Class
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking..");
	}
	
	void run()
	{
		System.out.println("Running");
	}
}

public class Single_Level_Inheritance {
      public static void main(String[] args) {
    	  //need to create object of subclass
    	  
    	  Dog d=new Dog();
    	  d.bark();
    	  d.eat();
		
	}
}
