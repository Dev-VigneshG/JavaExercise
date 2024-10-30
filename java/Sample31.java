import  java.util.Scanner;
class Sample31
{
  public static void main(String[] ar)
  {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter No rows:");
	 int rows=s.nextInt();
	 System.out.println("Enter No Column:");
	 int colums=s.nextInt();
	 int a[][]=new int[rows][colums];
	 System.out.println("Enter ELements Of Array:");
	 for(int i=0;i<rows;i++)
	 {
		 for(int j=0;j<colums;j++)
		 {
			 a[i][j]=s.nextInt();
		 }
	 }
	 int row[]=new int[rows];
	 int col[]=new int[colums];
	 int d=0;
	 for(int i=0;i<rows;i++)
	 {
		 for(int j=0;j<colums;j++)
		 {
			 if(i==j)
			 {
				 d+=a[i][j];
			 }
			 row[i]+=a[i][j];
		 }
	 }  
	 for(int i=0;i<rows;i++)
	 {
		 System.out.println("The Sum of "+(i+1)+"th Row is "+row[i]);
	 }
	 for(int i=0;i<rows;i++)
	 {
		 for(int j=0;j<colums;j++)
		 {
			 col[i]+=a[j][i];
		 }
	 }  
	 for(int i=0;i<colums;i++)
	 {
		 System.out.println("The Sum of "+(i+1)+"th column is "+col[i]);
	 }
	 System.out.println("The Sum Diagonal Elements : "+d);
}

  
}