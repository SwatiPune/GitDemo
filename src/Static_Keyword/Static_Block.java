package Static_Keyword;

//It is used to initialize the static data member
//it will execute before the main method at the time of class loading.

public class Static_Block {
	public static void main(String[] args) 
	{
	 System.out.println("Hello swati");
	}
	
	static
	{
		System.out.println("this is static block");
	}

}
