
import java.util.Scanner;
class Sample34
       {
      public static void main(String[] args)
                  {
                  Scanner s=new Scanner(System.in);
				 
				  System.out.println("Enter No Of Rows:");
				  int row=s.nextInt();
				   int a[][] = new int[row][];
				   
				
				  for(int i=0;i<row;i++)
				      {
						 a[i]=new int[i+1];					 
                      }
				  int k=0;
				  for(int i=0;i<row;i++)
				      {
					for(int j=0;j<i+1;j++)
					    {
						a[i][j]=k;
						k++;
                        System.out.print(a[i][j]+" ");						
                        }	
						 System.out.println();
					  }						 
                                
                 }

     }