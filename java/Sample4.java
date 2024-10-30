import java.util.Scanner;
class Sample4
       {
      public static void main(String[] args)
                  {
                  Scanner s=new Scanner(System.in);
                  System.out.println("Enter a Number To Find Factorial:");
                   int N=s.nextInt();
                   int fact=1;
                  for(int i=1;i<=N;i++)
                       {
                       fact=fact*i;
                       } 
                   System.out.println("Factorial Value of "+N+" is "+fact);
                  }

     }