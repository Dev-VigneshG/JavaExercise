import java.util.Scanner;
class Sample32
       {
      public static void main(String[] args)
                  {
                  Scanner s=new Scanner(System.in);
				 
				  System.out.println("Enter No Of Rows :");
				  int r=s.nextInt();
				   System.out.println("Enter No Of Columns :");
				  int col=s.nextInt();
				   int a[][] = new int[r][col];
				  int b[][]=new int[r][col];
				  int c[][]=new int[r][col];
				  int d[][]=new int[r][col];
				  System.out.println("Enter 1st Matrix:");
				  for(int i=0;i<r;i++)
				      {
						  for(int j=0;i<col;i++)
						  {
						 System.out.println("Enter Value:");
						 a[i][j]=s.nextInt();	  
						  }
                      }
				 System.out.println("Enter 2nd Matrix:");
				  for(int i=0;i<r;i++)
				      {
						  for(int j=0;i<col;i++)
						  {
						 System.out.println("Enter Value:");
						 b[i][j]=s.nextInt();	  
						  }
                      }
				for(int i=0;i<r;i++)
				      {
						  for(int j=0;i<col;i++)
						  {
						   c[i][j]=a[i][j]+b[i][j];
						   d[i][j]=a[i][j]-b[i][j];
						  }
                      }
				System.out.println("Addtion Matrix:");
				for(int i=0;i<r;i++)
				      {
						  for(int j=0;i<col;i++)
						  {
						  System.out.print(c[i][j]+" ");
						  }
						System.out.println();
                      }
				System.out.println("Subtration  Matrix:");
				for(int i=0;i<r;i++)
				      {
						  for(int j=0;i<col;i++)
						  {
						  System.out.print(d[i][j]+" ");
						  }
						System.out.println();
                      }
				  
				  
				           
                 }

     }