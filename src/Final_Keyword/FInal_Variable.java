package Final_Keyword;

//we cannot change the value of variable

public class FInal_Variable {
	 final int data=100;
	 
	 public void run()
	 {
		 data=200;
	 }
	 
	 public static void main(String[] args) {
		 FInal_Variable obj=new FInal_Variable();
		 System.out.println(obj.data);             //it will print value 100 
	}

}
