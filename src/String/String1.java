package String;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char C[] ={'s','w','a','t','i'};
		String s=new String (C);
		System.out.println(s);
		
		String s1="Anurag";
		String s2="Anurag";
		
		String s3=new String("Anurag");
		String s4=new String("Anurag");
		String s5=new String("Rashi");
		
		System.out.println(s1==s3);       //false bcz it's comparing reference and there are 2 different reference for s1 and s3
		System.out.println(s1.equals(s3));  //true comapring content and content is similar
		System.out.println(s1==s2);            //true as reference is same for both s1 and s2
		System.out.println(s4.equals(s5));      //false as content different
		
		

	}

}
