package String;

public class Method_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="Javatpoint";
		System.out.println(s.substring(2));      //1st type
		System.out.println(s.substring(2, 4));   //2nd type
		
		//String outof bound exception due to: if 1.starting index is negative , 2.if end index is lower than starting index
		//either starting or end index is greater than total no of characters in the string.
		
		String s1="Parvin Makaandar and i am an engineer";
		System.out.println("Substring :"+s1.substring(7, 16));
		
		
		//CharAt()
		System.out.println("Index value of character:" +s1.charAt(15));
		
		//toUpperCase
		System.out.println("Converting into upper case letter:" +s1.toUpperCase());
		
		//lower case
		System.out.println("Converting into lower case letter:" +s1.toLowerCase());
		
		//removing white spaces
		String s2=" hello java string ";
		System.out.println(s2.length());
		System.out.println(s2);         //without trim
		
		String tr=s2.trim();
		System.out.println(tr.length());
		System.out.println(tr);
		
		//split method
		String[] str=s1.split(" ");
		for(int i=0; i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		
		//contains
		System.out.println(s1.contains("Parvin"));
		
		//starts with
		System.out.println(s1.startsWith("P"));
		
		//ends with
		System.out.println(s1.endsWith("r"));
		

	}

}
