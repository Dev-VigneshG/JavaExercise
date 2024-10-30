import java.io.*;
class Sample82
{
	public static void main(String[] args)
	{
		PrintStream cout=System.out;
		try
		{
			DataInputStream input;
			input =new DataInputStream(System.in);
			int n1,n2,ans=0;
			cout.println("Enter First Number ");
			n1=Integer.parseInt(input.readLine());
			cout.println("Enter Second Number ");
			n2=Integer.parseInt(input.readLine());
			ans=n1/n2;
			System.out.println("This Will Be Printed");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Throws ");
			System.out.println("Description : "+e);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Exception throws ");
			System.out.println("NumberFormatException occurs");
			System.out.println("Description : "+e);
		}
		System.out.println("Out Of Try Catch Block ");
	}
	
	
}