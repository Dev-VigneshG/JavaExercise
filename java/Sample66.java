import java.util.Scanner;
import java.matrix.MatAdd;
class Sample66
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter No Of Rows & Columns:");
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
		MatAdd matadd=new MatAdd(m,n);
			
		
	}
}