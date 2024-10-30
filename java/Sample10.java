import java.util.Scanner;
class Box
        {
       double length;
      double breadth;
      double depth;
      Box(double l,double b,double d)
            {
            length=l;
             breadth=b;
           depth=d;
          }
      double volume()
            {
            return length*breadth*depth;
            }
       }
class Sample10
       {
      public static void main(String[] args)
                  {
                  Scanner s=new Scanner(System.in);
                  System.out.print("Enter Length 1:");
                   int l1=s.nextInt();
                 System.out.print("Enter Breadth 1 :");
                   int b1=s.nextInt();
                  System.out.print("Enter Depth 1:");
                   int d1=s.nextInt();
                 Box box1=new Box(l1,b1,d1);
                 System.out.println("Volume Of The Box  1:"+box1.volume());
                 System.out.print("Enter Length 2:");
                   int l2=s.nextInt();
                 System.out.print("Enter Breadth 2 :");
                   int b2=s.nextInt();
                  System.out.print("Enter Depth 2:");
                   int d2=s.nextInt();
                   Box box2=new Box(l2,b2,d2);
                   System.out.println("Volume Of The Box  2:"+box2.volume());
                                   
                 }

     }