package Constuctor;

//Constuctor-
//1.it is a method which is used to initialize the object
//2.Constuctor name should be same as class name.
//3.It should not have any explicit return type.
//4.It cannot be abstract, final, static,synchronised


//A constuctor is called default constructor when it does not have any parameters

public class Default_Constructor {
	
	Default_Constructor()
	{
		System.out.println("this is default constructor");
	}
	public static void main(String[] args) {
		Default_Constructor dc=new Default_Constructor();
		
	}

}
