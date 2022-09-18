package Inheritance;

public class Demo  extends ClassA
{

	void display()
	{
		System.out.println("ClassB method called");
	}
	public static void main(String[] args) {
		ClassA aobj=new ClassA();
		aobj.display();
		
		ClassA bobj= new ClassA();
		bobj.display();
	}
	
}
