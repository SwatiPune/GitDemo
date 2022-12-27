package Encapsulation;

//Encapsulation is a proces of wrapping a code and data together into a single unit.
//by providing setter and getter method you can make class read only or write only.
//It has private data members and getter and setter method

//Run cinfiguration:Encapsulation.Runencap1

public class TestEncapsulation {
       //Private data members
	   private String name="Saiii";
	   private int empId;
	   private int age;
	   
	   //Getter methods for private data member
	   public String getName()
	   {
		   return name;
	   }
	   
	   public int getEmpId()
	   {
		   return empId;
	   }
	   
	   public int getAge()
	   {
		   return age;
	   }
	   
	   //Setter methods for Private data member
	   public void setName(String newname)
	   {
		   name=newname;
	   }
	   
	   public void setEmpId(int newempid)
	   {
		   empId=newempid;
	   }
	   
	   public void setAge(int newage)
	   {
		   age=newage;
	   }
}

class Runencap1
{
	public static void main(String[] args) {
		TestEncapsulation obj=new TestEncapsulation();
         obj.setName("Saiii");
         obj.setEmpId(1234);
         obj.setAge(25);
         
         System.out.println("Name :"+obj.getName());
         System.out.println("Empid :"+obj.getEmpId());
         System.out.println("Age :"+obj.getAge());
	}

}
