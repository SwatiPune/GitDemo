package Constuctor;

//Parameterized constructor is used to provide different values to different object

public class Parameterised_Constructor {
         int empid;
         String name;
         String company;
         
         Parameterised_Constructor(int empid, String name, String company)
         {
        	 empid=empid;
        	 name=name;
        	 company=company;
        	 System.out.println(empid+" "+name+" "+company );
         }
         
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterised_Constructor pc1=new Parameterised_Constructor(11, "Swati", "Accenture");
		Parameterised_Constructor pc2=new Parameterised_Constructor(22, "Rekha", "Barclays");
	}

}
