import java.util.Scanner;
class Fibonacci
{
	void fibo(int n,int f1,int f2)
	{
		if(n==0)
			return;
		else
		{
			int f3=f1+f2;
			System.out.println(f3);
			fibo(n-1,f2,f3);
		}
	}
}
class Sample47
{
 public static void main(String[] a)
 {
	 Scanner s=new Scanner(System.in);
	 System.out.print("Enter A Element To Find Fibonacci");
	 int n=s.nextInt();
	 Fibonacci fib=new Fibonacci();
	 fib.fibo(n,-1,1);
	 
 }
}