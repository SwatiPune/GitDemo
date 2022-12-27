package Practice;

class Adder3
{
	public int add(int a,int b)
	{
		return a+b;
	}
}

class Adder2 extends Adder3
{
	public int add(int a, int b)
	{
		return a+b;
	}
}

public class Override2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Adder2 obj=new Adder2();
        obj.add(10, 20);
        System.out.println(obj.add(10, 20));
	}

}
