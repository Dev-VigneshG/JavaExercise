import java.util.Scanner;
class Sample8
       {
      public static void main(String[] args)
                  {
                  Scanner s=new Scanner(System.in);
                  System.out.print("Enter a Number Of  Terms  :");
                   int N=s.nextInt();
                  int f1=0,f2=1,f3;
                  for(int i=0;i<N;i++)
                       {
                       System.out.println(f1);
                       f3=f1+f2;
                       f1=f2;
                      f2=f3;       
                       } 
                 
                  }

     }