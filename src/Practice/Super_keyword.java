package Practice;


//super keyword used to refer immediate parent class object
//it is used to invoke parentclass method and parent class constructor


class Bird
{
	String color="Black";
}

class Peacock extends Bird
{
     String color="Green";
    
     public void printcolor()
     {
    	 System.out.println(color);
    	 System.out.println(this.color);
    	 System.out.println(super.color);
     }
}
public class Super_keyword {
   public static void main(String[] args) {
	     Peacock pc=new Peacock();
	     pc.printcolor();
}
}
