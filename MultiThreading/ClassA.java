package MultiThreading;

class ClassA extends Thread{

	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("ClassA run method executed");
		}
	}

}
class ClassB extends Thread{
	
	public static void main(String[] args) throws InterruptedException{
		ClassA aobj=new ClassA();
		aobj.start();
		aobj.join();
		
		for(int x=1;x<=3;x++)
		{
			System.out.println("Main thread of class b executed");
		}
	}
}
