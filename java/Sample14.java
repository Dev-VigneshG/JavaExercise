import java.util.Scanner;
class Sample14
       {
      public static void main(String[] args)
                  {
                   int sum;
                  System.out.println("Perfect Number Between 1 to 100");
                  for(int i=1;i<100;i++)
                     {
                      sum=0;
                     for(int j=1;j<i;j++)
                        {
                         if(i%j==0)
                           sum+=j;
                       } 
                    if(sum==i)
                      {
                     System.out.println(i);
                      }
                 
                  }
            }

     }