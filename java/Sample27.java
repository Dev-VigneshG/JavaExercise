import java.util.Scanner;
class Area
{
  void area(double r)
       {
       System.out.println("The Area Of Circle is "+3.14*r*r);
       }

  void area(double b,double h)
       {
       System.out.println("The Area Of Triangle is "+0.5*b*h);
       }

  void area(float l,float b)
       {
       System.out.println("The Area Of Rectangle is "+l*b);
       }
}
class Sample27
     {
     public static void main(String args[])
           {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter A Radius for Circle");
            double radius=s.nextDouble();
            System.out.println("Enter A Length & Breadth Of RectAngle");
            double length=s.nextDouble();
            double breadth=s.nextDouble();
            System.out.println("Enter Base & Height Of Triangle:");
            double base=s.nextDouble();
            double height=s.nextDouble();
            Area a= new Area();
            a.area(radius);
            a.area(length,breadth);
            a.area(base,height);
           }


     }