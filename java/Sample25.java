import java.util.Scanner;
class Sample25
       {
      public static void main(String[] args)
                  {
                  Scanner s=new Scanner(System.in);
				 
				  System.out.println("Enter N Value:");
				  int N=s.nextInt();
				   int a[] = new int[N];
				  int b[]=new int[N];
				  for(int i=0;i<N;i++)
				      {
						 System.out.println("Enter Value:");
						 a[i]=s.nextInt();	  
                      }
				  
				  for(int i=0;i<N-1;i++)
				      {
					for(int j=i+1;j<N;j++)
					    {
							if(a[i]>a[j])
							{
								a[i]=a[j];
							}
						}			
                      }		
                  for(int i=0;i<N;i++)
				      {
						 System.out.println(a[i]);
							  
                      }                
                 }

     }