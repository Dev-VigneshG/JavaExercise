import java.util.Scanner;
class Sample7
       {
      public static void main(String[] args)
                  {
                  Scanner s=new Scanner(System.in);
                  System.out.print("Enter a Number To Sum To N Number:");
                   int N=s.nextInt();
                  int sum=0;
                  for(int i=1;i<=N;i++)
                       {
                        sum=sum+i;
                       } 
                  System.out.println("Sum of 1 to "+N+" is "+sum);
                  }

     }