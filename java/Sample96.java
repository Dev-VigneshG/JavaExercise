class Fibo extends Thread
{
	int n;
	Fibo(int m,String name)
	{
		super(name);
		n=m;
		start();
	}
	public void run()
	{
		int f1=0,f2=1;
		System.out.println(f1);
		System.out.println(f2);
		for(int i=2;i<=n;i++)
		{
			int f3=f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
		}
	}
}
class Multiplication extends Thread
{
	int n;
	Multiplication (int m,String name)
	{
		super(name);
		n=m;
		start();
	}
	public void run()
	{
		for(int i=1;i<=20;i++)
		{
			System.out.println(i+" x "+n+" = "+i*n);
		}
	}
}
class Sample96
{
	public static void main(String[] args)
	{
		Fibo fibo=new Fibo(5,"fibo");
		Multiplication mul=new Multiplication(10,"multiplication");
	}
}