import java.util.*;
class Fact extends Thread
{
	int n;
	Fact(int m)
	{
		n=m;
	}
	public void run()
	{
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("The Factorial Value of "+n+" is "+f);
		System.out.println("Factorial program is finished");
	}
}
class Multiplication extends Thread
{
	int n;
	Multiplication (int m)
	{
		n=m;
	}
	public void run()
	{
		for(int i=1;i<=20;i++)
		{
			System.out.println(i+" x "+n+" = "+i*n);
		}
	}
}
class Sample94
{
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number for factorial & Multiplication Table");
		int f=s.nextInt();
		int m=s.nextInt();
		Fact fact=new Fact(f);
		Multiplication mul=new Multiplication(m);
		fact.start();
		mul.start();
	}
}