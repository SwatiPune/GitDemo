package Static_Keyword;


//Static method belongs to class rather than object
//Static method can be invoked without creating an object of class
//Static method can access static data member and can change value of it.

public class Static_Method {
	
	int empid;
	String name;
	static String company="Accenture";
	
	static void change()
	{
		company="IBM";
	}
	
	public static void main(String[] args) {
		//classname.metodname();
		Static_Method.change();
		System.out.println(company);                                  //It will print IBN
		
		
	}

}
