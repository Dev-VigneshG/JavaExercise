import java.util.Scanner;
class Sample12
       {
      public static void main(String[] args)
                  {
                  Scanner s=new Scanner(System.in);
                  System.out.print("Enter a Number To Find Factors:");
                   int N=s.nextInt();
                  int sum=0;
                  for(int i=1;i<=N;i++)
                       {
                        if(N%i==0)
                           System.out.println(i);
                       } 
                  
                  }

     }