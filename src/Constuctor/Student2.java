package Constuctor;

public class Student2 {
  
    //object declaration
	int id;
	String name;
	
	//Creating a parameterised constructor
	 Student2 (int i, String n)
	 {
		 id=i;
		 name=n;
	 }
	 
	 //method to display values
	 void display()
	 {
		 System.out.println(id+" "+name);
		 System.out.println("Aditya");
			System.out.println("Korhale");
	 }
	
	public static void main(String[] args) {
		Student2 S1=new Student2(11,"Swati");
		Student2 S2=new Student2(22,"Aditya");
		S1.display();
		S2.display();
		System.out.println("Swati");
		System.out.println("Anuj");
		System.out.println("Raje");
		System.out.println("Maharaja");
	}

}
