package Loop_Statement;

//syntax:
//for(initialization; condition; updation)
//{
//Statement
//}


public class ForLoop {
	public static void main(String[] args) {
		
//		for(int i=1; i<=10;i++)
//		{
//			//System.out.println(i);     //it will print 1 to 10
//			System.out.println(i*2);    //it will print table of 2
//		}
		
		for(int i=1;i<=10;i++)
		{
			if(i==7)
			{
				continue;
			}
			System.out.println(i);
		}

		
	}

}
