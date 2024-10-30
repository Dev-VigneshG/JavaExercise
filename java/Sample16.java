import java.util.Scanner;
class Box
        {
       double length;
      double breadth;
      double depth;
      Box()
          {
          length=5.7;
          breadth=7.2;
         depth=8.4;
         }
      Box(double l)
            {
            length = breadth=depth=l;      
          }
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
class Sample16
       {
      public static void main(String[] args)
                  {
                  Scanner s=new Scanner(System.in);
                  System.out.print("Enter Length:");
                   int l=s.nextInt();
                 System.out.print("Enter Breadth:");
                   int b=s.nextInt();
                  System.out.print("Enter Depth:");
                   int d=s.nextInt();
                 Box b1=new Box(); 
                System.out.println("Volume Of The Box 1(Default) :"+b1.volume());
                 Box b2=new Box(l);
               System.out.println("Volume Of The Box 2 (One Argument):"+b2.volume());
                 Box b3=new Box(l,b,d);
                 System.out.println("Volume Of The Box 3(Three Argument)  :"+b3.volume());
                                   
                 }

     }