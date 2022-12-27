package Practice;

class Aaba
{
    void speak()
    {
    	System.out.println("Speaking..");
    }
}

class Dada extends Aaba
{
	void listen()
	{
		System.out.println("Listening..");
	}
}

class swatu extends Aaba
{
	void bakbak()
	{
		System.out.println("Bakbaking...");
	}
}

public class hierarchical {
      public static void main(String[] args) {
		  swatu sw=new swatu();
		  sw.bakbak();
		  sw.speak();
		  Dada da=new Dada();
		  da.listen();
		  da.speak();
	}
}
