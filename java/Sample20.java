import java.util.Scanner;
class Sample20
       {
      public static void main(String[] args)
                  {
                  Scanner s=new Scanner(System.in);
				  int a[] = new int[5];
				  for(int i=0;i<5;i++)
				      {
						 System.out.println("Enter Value:");
						 a[i]=s.nextInt();	  
                      }
				  System.out.println("Array Values:");
				  for(int i=0;i<5;i++)
				      {
						 System.out.print(a[i]+" ");	  
                      }		
                                   
                 }

     }