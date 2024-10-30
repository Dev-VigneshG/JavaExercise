import java.util.Scanner;
class Area
{
double circle(double r)
      {
       return 3.14*r*r;
      }
double rectangle(double l,double b)
      {
      return l*b;
      }
double triangle(double h,double b)
      {
       return 0.5*b*h;
      }
}
class Sample26
     {
     public static void main(String args[])
           {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter A Radius for Circle");
            double radius=s.nextDouble();
            System.out.println("Enter A Length&Breadth Of RectAngle");
            double length=s.nextDouble();
            double breadth=s.nextDouble();
            System.out.println("Enter Base & Height Of Triangle:");
            double base=s.nextDouble();
            double height=s.nextDouble();
            Area a= new Area();
            System.out.println("Area Of Circle: "+a.circle(radius));
            System.out.println("Area Of Rectangle "+a.rectangle(length,breadth));
            System.out.println("Area of Triangle :" +a.triangle(base,height));
            

           }


     }