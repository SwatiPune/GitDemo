package Practice;

public class FinalVariable {
	final int data=100;
	
	public void run()
	{
		int data=200;
	}
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
            FinalVariable f1=new FinalVariable();
            System.out.println(f1.data);
	}

}
