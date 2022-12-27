package Practice;

class Multiplier
{
	public int mul(int a, int b)
	{
		return a*b;
	}
	
	public int mul(int a,int b, int c)
	{
		return a*b*c;
	}
	
	
}
public class Overload_NOA1 {
	
	public static void main(String[] args) {
		Multiplier obj=new Multiplier();
		System.out.println(obj.mul(10, 10));
		System.out.println(obj.mul(10, 10, 10));
	}

}
