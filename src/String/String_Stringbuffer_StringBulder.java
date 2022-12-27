package String;

public class String_Stringbuffer_StringBulder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String-it is immutable object
		String s="Swati";
		s.concat("Korhale");   //it is immutable object string s will not change
		System.out.println(s);        
		
		//stringbuffer- it is mutable object but it is synchronised
		StringBuffer sb=new StringBuffer("Aditya");
		sb.append(" Korhale ");
		System.out.println(sb);
		
		//Stringbuilder -it is mutable object but its non synchronised 
		StringBuilder sb1=new StringBuilder("Kunal");
		sb1.append(" Divekar ");
		System.out.println(sb1);
		

	}

}
