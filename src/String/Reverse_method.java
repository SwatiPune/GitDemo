package String;

public class Reverse_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="swatikorhale";
		char ch[]=s.toCharArray();
		System.out.println(ch.length);
		
		for(int i=ch.length-1;i>=0; i--)
		{
			System.out.println(ch[i]);
		}
	}

}
