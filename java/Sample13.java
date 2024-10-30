import java.util.Scanner;
class Sample13
       {
      public static void main(String[] args)
                  {
                  Scanner s=new Scanner(System.in);
                  System.out.print("Enter a Number To Find Number is Perfect Number Or Not:");
                   int N=s.nextInt();
                  int sum=0;
                  for(int i=1;i<N;i++)
                       {
                        if(N%i==0)
                           sum+=i;
                       } 
                 if(sum==N)
                    {
                     System.out.println(N+" Is Perfect Number");
                    }
                  else
                    {
                         System.out.println(N+" Is Not Perfect Number");
                    }
                  }

     }