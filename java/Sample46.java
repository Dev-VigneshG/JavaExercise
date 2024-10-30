import java.util.Scanner;
class PrintArray
{
	int a[];
	PrintArray(int size)
	{
	a=new int[size];
    }
	void printarray(int m)
	{
		if(m==-1)
		{
			return;
		}
		else
		{
			
			System.out.println(a[m]);
			printarray(m-1);
		}
	}
}
class Sample46
{
	public static void main(String[] a)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size Of Array:");
		int n=s.nextInt();
		PrintArray ob=new PrintArray(n);
		for(int i=0;i<n;i++)
		{System.out.println("Enter ELement:");
			ob.a[i]=s.nextInt();
		}
		ob.printarray(n-1);
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		