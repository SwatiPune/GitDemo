package Control_Statements;

import java.util.Scanner;

public class SwitchCaseWeekdays {
	
	public static void main(String[] args) {
		 int weekdays;
		 System.out.println("Enter weekdays which you need:");
		 Scanner sc=new Scanner(System.in);
		 weekdays=sc.nextInt();
		 
		 switch(weekdays)
		 {
		 case 1:
			 System.out.println("It's a monday");
			 break;
			 
		 case 2:
			 System.out.println("It's a tuesday");
			 break;
			 
		 case 3:
			 System.out.println("It's a wendensday");
			 break;
			 
		 case 4:
			 System.out.println("It's a thursday");
			 break;
			 
		  case 5:
			  System.out.println("It's a friday");
			  break;
			  
		  case 6:
			  System.out.println("It's a saturday");
			  break;
			  
		  case 7:
			  System.out.println("It's a sunday");
			  break;
			  
		  default:
			  System.out.println("this is not a weekday or weekend");
			  
		 }
	}

}
