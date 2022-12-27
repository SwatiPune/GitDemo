package String;

public class InternMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=new String("Hello").intern();
		String s1=new String("Hello").intern();
		System.out.println(s==s1);                 //it will return true
		
		//in above 2nd method no new string is created as content is same for both s and s1.
		//hence reference of the object created in first statement is returned for s1
		//thus s and s1 point to same memory

	}

}
