import java.util.Scanner;
import matrix.MatMul;
class Sample68
{
	public static void main(String arg[])
	{
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter No of Rows & columns for 1st Matrix");
		int r1=s.nextInt();
		int c1=s.nextInt();
		System.out.println("Enter No of Rows & columns for 2nd Matrix");
		int r2=s.nextInt();
		int c2=s.nextInt();
		int a[][]=new int[r1][c1];
		int b[][]=new int[r2][c2];
		if(c1==r2)
		{
			System.out.println("Enter 1st Matrix:");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					a[i][j]=s.nextInt();
				}
			}	
			System.out.println("Enter 2nd Matrix:");
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c2;j++)
				{
					b[i][j]=s.nextInt();
				}
			}
			MatMul matmul=new MatMul(r1,c1,r2,c2);
			matmul.multiplication(a,b);
			matmul.display();
		}
		
	}
}