	`import java.util.Scanner;
class Sample21
       {
      public static void main(String[] args)
                  {
                  Scanner s=new Scanner(System.in);
				  int a[] = new int[5];
				  int sum=0;
				  for(int i=0;i<5;i++)
				      {
						 System.out.println("Enter Value:");
						 a[i]=s.nextInt();	  
                      }
				  
				  for(int i=0;i<5;i++)
				      {
						 sum+=a[i];	  
                      }		
                   System.out.println("Sum Of All Elements In Array is "+sum);                
                 }

     }