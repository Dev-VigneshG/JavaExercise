import java.util.Scanner;
class Sample11
       {
      public static void main(String[] args)
                  {
                  Scanner s=new Scanner(System.in);
                  System.out.print("Enter a Number To Find Sum Of Digits:");
                   int N=s.nextInt();
                  int sum=0;
                 while(N>0)
                          {
                          sum+=N%10;
                          N/=10;
                           }
                  System.out.println("Sum of digit of  is "+sum);
                  }

     }