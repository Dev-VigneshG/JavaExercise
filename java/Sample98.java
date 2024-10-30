class ExampleThread implements Runnable
{
	Thread t;
	ExampleThread(String s)
	{
		t=new Thread(this,s);
		t.start();
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("From "+t.getName()+" "+i);
		}
		System.out.println(t.getName()+" is finished");
		
	}
	
}
class Sample98
{
	public static void main(String[] args) throws InterruptedException
	{
		ExampleThread th1=new ExampleThread("first");
		ExampleThread th2=new ExampleThread("second");
		ExampleThread th3=new ExampleThread("third");
		System.out.println("main thread is finished");
		
	}
}