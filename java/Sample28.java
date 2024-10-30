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
class Sample28
     {
     public static void main(String args[])
           {
            Scanner s=new Scanner(System.in);
            while(true)
			    {
					System.out.println("Enter Your Choice: /n 1.Circle \n 2.Triangle /n 3. RectAngle");
					int ch=s.nextInt();
					Area a1=new Area();
				}
           }


     }