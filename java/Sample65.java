import java.util.Scanner;
import p1.*;
class Sample65
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A Number :");
		int n=s.nextInt();
		Fact f=new Fact();
		int ans=f.fact(n);
		System.out.println("The factorial value of "+n+" is "+ans);
	}
}