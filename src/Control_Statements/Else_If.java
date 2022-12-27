package Control_Statements;

public class Else_If {
	
	public static void main(String[] args) {
		int age=35;
		
		if(age>50)
		{
			System.out.println("You are experienced employee");
		}
		else if(age>=40)
		{
			System.out.println("You are semi experienced employee");
		}
		else if(age>30)
		{
			System.out.println("You are juniour employee");
		}
		else
		{
			System.out.println("You are a fresher employee");
		}
	}

}
