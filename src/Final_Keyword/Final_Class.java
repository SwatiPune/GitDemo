package Final_Keyword;

//we cannot inherit final class

public class Final_Class {
     void run()
     {
    	 System.out.println("Running");
     }
     
     class Honda extends Final_class
     {
    	 void run()
    	 {
    		 System.out.println("Running Slowly");
    	 }
     }
	
     public static void main(String[] args) {
		// TODO Auto-generated method stub
         Honda hd1= new Honda();
         hd1.run();
	}

}
