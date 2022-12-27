package Final_Keyword;


class Car
{
	final void run()
	{
		System.out.println("Running");
	}
}

class Honda extends Car
{
	void run()
	{
		System.out.println("Running Safely");
	}
}

public class Final_Method {

	public static void main(String[] args) {
		Honda hd=new Honda();
        hd.run();
	}

}
