//Static Variable- A variable which we can declare with static keyword. it cannot be local.
//It uses for memory management

public class StaticVariable {
  
	//declare variable
    static String Company="Äccenture";
	String empname="Swati";
	int empid=12345;
	int empage=25;
	
	//declare method
	
	public void run()
	{
		System.out.println(Company);
		System.out.println(empname);
		System.out.println(empage);
		
	}
	//main method
	public static void main(String[] args) {
		StaticVariable sobj=new StaticVariable();
		sobj.run();
	}
}
