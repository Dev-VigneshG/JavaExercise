	import java.util.Scanner;
	class Sample24
		   {
		  public static void main(String[] args)
					  {
					  Scanner s=new Scanner(System.in);
					 
					  System.out.println("Enter N Value:");
					  int N=s.nextInt();
					   int a[] = new int[N];
					   
					  for(int i=0;i<N;i++)
						  {
							 System.out.println("Enter Value:");
							 a[i]=s.nextInt();	  
						  }
					  int small=a[0];
					  
					  for(int i=1;i<N;i++)
						  {
						  if(small>a[i])
							  small=a[i];						  
						  }		
						 System.out.println("Small Element is "+small);         
					 }

		 }