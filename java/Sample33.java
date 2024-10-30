import java.util.Scanner;
class Sample33
       {
      public static void main(String[] args)
                  {
                  Scanner s=new Scanner(System.in);
				 
				  System.out.println("Enter No Of Rows and column Of 1st matrix :");
				  int r1=s.nextInt();
				  int c1=s.nextInt();
				  System.out.println("Enter No Of Rows and column Of 2nd matrix :");
				  int r2=s.nextInt();
				  int c2=s.nextInt();
				  int a[][] = new int[r1][c1];
				  int b[][]=new int[r2][c2];
				  int c[][]=new int[r1][c2];
				  if(r2!=c1)
				  { 
			      System.out.println("Matrix Order Is Incorrect");
				  return;
				  }
				  
				  System.out.println("Enter 1st Matrix:");
				  for(int i=0;i<r1;i++)
				      {
						  for(int j=0;j<c1;j++)
						  {
						 System.out.println("Enter Value:");
						 a[i][j]=s.nextInt();	  
						  }
                      }
				 System.out.println("Enter 2nd Matrix:");
				  for(int i=0;i<r2;i++)
				      {
						  for(int j=0;j<c2;j++)
						  {
						 System.out.println("Enter Value:");
						 b[i][j]=s.nextInt();	  
						  }
                      }
				for(int i=0;i<r1;i++)
				      {
						  for(int j=0;j<c2;j++)
						  {
							c[i][j]=0;
						   for(int k=0;k<r2;k++)
						   {
							   c[i][j]+=a[i][k]*b[k][j];
						   }
							   
						  }
                      }
				
				System.out.println("Multiplication  Matrix:");
				for(int i=0;i<r1;i++)
				      {
						  for(int j=0;j<c2;j++)
						  {
						  System.out.print(c[i][j]+" ");
						  }
						System.out.println();
                      }
				  
				  
				           
                 }

     }