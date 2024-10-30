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
class Sample95
{
	public static void main(String[] arg)
	{
		ExampleThread t1=new ExampleThread("first");
		ExampleThread t2=new ExampleThread("second");
		ExampleThread t3=new ExampleThread("third");
		
	}
}