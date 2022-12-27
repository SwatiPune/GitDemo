package Control_Statements;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		 
		int age=18;
		System.out.println("Enter your age:");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
        
        if(age>=18)
        {
        	System.out.println("You can drive a vehicle");
        }
        else
        {
        	System.out.println("You cannot drive a vehicle");
        }
        
	}

}
