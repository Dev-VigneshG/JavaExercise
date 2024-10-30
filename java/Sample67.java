import java.util.Scanner;
import matrix.*;
class Sample67
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter No Of Rows And Cols ");
		int m=s.nextInt();
		int n=s.nextInt();
		int a[][]=new int[m][n];
		int b[][]=new int[m][n];
		System.out.println("Enter 1st Matrix:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter 2nd Matrix:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		do{
		System.out.println("Enter Your Choice: \n 1.Addition \n 2.Subtraction \n 3.EXIT");
		int ch=s.nextInt();
		switch(ch)
		{
			case 1:MatAdd matadd=new MatAdd(m,n);
			       matadd.addition(a,b);
				   matadd.display();
				   break;
		    case 2:MatSub matsub=new MatSub(m,n);
			       matsub.subtraction(a,b);
				   matsub.display();
				   break;
			case 3:System.exit(0);
			        break;
					
		}
		}while(true);
	}
}