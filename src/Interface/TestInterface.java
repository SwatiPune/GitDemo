package Interface;

//Interface-It is a blueprint of class.It has static, default and abstract method.
//in interface we can use N number static and default methods.
//it achieves 100% abstraction

public interface TestInterface {
	int a=100;
	//Abstarct method
	void fun();
}

//Subclass implementing Interface
class C implements TestInterface
{
	public void fun()
	{
		System.out.println("Hello World");
	}
	
	public static void main(String[] args) {
		C obj=new C();
		obj.fun();
		
	}

}
