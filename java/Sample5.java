import java.util.Scanner;
class Sample5
       {
      public static void main(String[] args)
                  {
                  Scanner s=new Scanner(System.in);
                  System.out.println("Enter a Length:");
                   int l=s.nextInt();
                  System.out.println("Enter a Breadth:");
                   int b=s.nextInt();
                   System.out.println("Enter a height:");
                   int h=s.nextInt();
                   int area=l*b;
                  int volume=l*b*h;
                   System.out.println("Area: "+area);
                    System.out.println("Volume: "+volume);
                  
                  }

     }