import java.util.Scanner;

class Sample19
       {
      public static void main(String[] args)
                  {
                  Scanner s=new Scanner(System.in);
				  System.out.println("Enter Number Of Rows To Print Pattern");
				  int row=s.nextInt();
				  char c='A';
				  for(int i=1;i<=row;i++)
				      {
						  for(int j=1;j<=i;j++)
						     {
                              System.out.print(c+" ");
							  c++;
							  
                             }
						System.out.println();
					  }
                                   
                 }

     }