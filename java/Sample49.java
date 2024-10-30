import java.util.Scanner;
class Sample49
{
	public static void main(String[] a)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A Number To Find Prime or Not");
        int num=s.nextInt();
		if(num==1)
		{
			System.out.println("Not A Prime And Not A Composite");
			
		}
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				System.out.println("Not A Prime");
				return;
			}
		}
		System.out.println("Prime Number");
	}
}