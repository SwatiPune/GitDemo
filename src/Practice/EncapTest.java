package Practice;

public class EncapTest {
	
	  private String name="Swati";
	  private int empid;
	  private int age;
	  
	  //getter methods
	  public String getName()
	  {
		  return name;
	  }
	  
	  public int getEmpid()
	  {
		  return empid;
	  }
	  
	  public int getAge()
	  {
		  return age;
	  }
	  
	//setter methods
	  public void setName(String newName)
	  {
		  name=newName;
	  }
	  
	  public void setEmpid(int newId)
	  {
		  empid=newId;
	  }
	  
	  public void setAge(int newAge)
	  {
		  age=newAge;
	  }
	  

    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	EncapTest obj=new EncapTest();
    	obj.setName("Swati");
    	obj.setEmpid(1234);
    	obj.setAge(25);
    	
    	System.out.println("name : "+obj.getName());
    	System.out.println("Empid : "+obj.getEmpid());
    	System.out.println("Age : "+obj.getAge());
    	
	}

}
