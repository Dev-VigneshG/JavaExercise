import java.util.Scanner;
class Sample76
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Values For a& b");
		int a=s.nextInt();
		int b=s.nextInt();
		try
		{
			int c=a/b;
		}
		catch(ArithmeticException e)
		{
			c=0;
			System.out.println("The Divide by Zero occurs");
		}
	}
}