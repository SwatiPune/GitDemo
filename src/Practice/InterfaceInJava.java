package Practice;

public interface InterfaceInJava {
	abstract void fun();
}

class Itest implements InterfaceInJava
{
	public void fun()
	{
		System.out.println("Funning");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Itest obj=new Itest();
		obj.fun();

	}

}

