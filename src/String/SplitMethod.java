package String;

public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="I am Swati Korhale";
		String stringsplit[]=str.split("\\s");
		
		
		
		for(int i=0; i<stringsplit.length;i++)
		{
			System.out.println("" +stringsplit[i]);
		}
		
		//reverse 
//		for(int i=stringsplit.length-1; i>=0;i--)
//		{
//			System.out.println(""+stringsplit[i]);
//		}
//		
//		
}
}
