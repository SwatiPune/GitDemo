
//Instance Variable- A variable which we can declare inside the class and outside the method

public class InstanceVariable {
	
	//below are instance variable
	String name1="Swati";
	String name2="Aarthi";
	int age=26;
	
	
	public void speak()
	{
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(age);
	}
	
	public void run()
	{
		System.out.println(name1);
		System.out.println(age);
	}

	public static void main(String[] args) {
		InstanceVariable obj=new InstanceVariable();
		obj.speak();
		obj.run();
		
	}

}
