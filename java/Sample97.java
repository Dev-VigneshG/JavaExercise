class ExampleThread extends Thread
{
	ExampleThread(String s)
	{
		super(s);
		start();
	}
	public void run()
	{
		try{
			System.out.println("Hello 1 from thread "+getName());
			Thread.sleep(500);
			System.out.println("Hello 2 from thread "+getName());
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
	}
	
}
class Sample98
{
	public static void main(String[] args) throws InterruptedException
	{
		ExampleThread th1=new ExampleThread("first");
		ExampleThread th2=new ExampleThread("second");
		ExampleThread th3=new ExampleThread("third");
		System.out.println("The Thread "+th1.getName()+" is Alive Is: "+th1.isAlive());
		System.out.println("The Thread "+th2.getName()+" is Alive Is: "+th2.isAlive());
		System.out.println("The Thread "+th3.getName()+" is Alive Is: "+th3.isAlive());
        Thread.sleep(1500);
		System.out.println("The Thread "+th1.getName()+" is Alive Is: "+th1.isAlive());
		System.out.println("The Thread "+th2.getName()+" is Alive Is: "+th2.isAlive());
		System.out.println("The Thread "+th3.getName()+" is Alive Is: "+th3.isAlive());
		
	}
}