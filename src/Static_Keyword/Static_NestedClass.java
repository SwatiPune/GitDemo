package Static_Keyword;

//Static nested class is a class that is declared inside the class

public class Static_NestedClass {
           //Static variable
	    static int data=30;
	    
	    //Static class declaration
	    static class Inner{
	    //Static class method declaration
	    public static void msg()
	    	{
	    		System.out.println("data is :" +data);
	    	}
	    }
	    
	    public static void main(String[] args) {
	    	Static_NestedClass.Inner.msg();
	    	//parentclass.staticclass.method
		}
	    
}
