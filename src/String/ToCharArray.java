package String;

public class ToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="hello";
		char ch[]=s1.toCharArray();
        System.out.println(ch.length);
        
        for (int i=0;i<ch.length;i++)
        {
        	System.out.println(ch[i]);
        }
        
        //2nd program
        
        String s2= "Welcome to javatpoint";
        char ch1[]=s2.toCharArray();
        System.out.println("character array length is: " +ch1.length);
        
        System.out.println("Character elements are:");
        
        for(int i=0;i<ch1.length;i++)
        {
        	System.out.print(ch1[i]);
        	//System.out.println(ch1[i]);
        }
        
	}

}
