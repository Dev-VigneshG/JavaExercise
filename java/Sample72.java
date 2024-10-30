import java.util.Scanner;
class Test
{
	void star_line()
	{
		for(int i=0;i<15;i++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	void clrscr()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(" ");
		}
	}
}
class Sample722
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		Test ob=new Test();
		do
		{
			System.out.println("Enter Your Choice: ");
			System.out.println("1.CLRSCR() \n 2.STAR LINE \n 3.EXIT");
			int ch=s.nextInt();
			switch(ch)
			{
				case 1:ob.clrscr();
				       break;
				case 2:ob.star_line();
				       break;
				case 3:System.exit(0);
				       break;
			}
		
	}while(true);
}
}