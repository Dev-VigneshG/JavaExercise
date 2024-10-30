import java.util.Scanner;
class Factorial
{
	 int fact(int n)
	{
	if(n==1)
		return 1;
	return n*fact(n-1);
		
	}
}
class Sample45
{
 public static void main(String[] a)
 {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter A Number To Find Factorial:");
	 int num=s.nextInt();
	 Factorial factorial=new Factorial();
	 System.out.println("Factorial Of  Number "+num +" :"+factorial.fact(num));
	 
	 
 }
}