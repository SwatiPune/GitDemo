package String;

public class Concat_M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Swati" + "Korhale";
		s1=s1.concat("Dnyandeo");
		System.out.println(s1);
		
		String s2=10+20+" Swati "+20+10;
		System.out.println(s2);
		
		String str="Swati";
		str=str.concat("Korhale");
		System.out.println(str);

		String str1="Swati" + " Korhale";
		System.out.println(str1);
		
		String str2=10+30+ "Aman" +20+10;
		System.out.println(str2);
		
		String s5="Swati";
		String s6=" Korhale";
		System.out.println(s5.concat(s6));
		
	}

}
