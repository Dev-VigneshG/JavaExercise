import  java.util.Scanner;
class Student
{
	String name;
	String rollno;
	String address;
	Student(String s1,String s2,String s3)
	{
		name=s1;
		rollno=s2;
		address=s3;
	}
	void display()
	{
		System.out.println("Name Of The Student: "+name+" Roll No : " +rollno+" Address : "+address);
	}
}
class Sample30
{
  public static void main(String[] a)
  {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter No Of Student:");
	 int n=s.nextInt();
	 Student[] st=new Student[n];
	 s.nextLine();
	 for(int i=0;i<n;i++)
	 {
	 System.out.println("Enter Name Of Student: ");
	 
	 String name=s.nextLine();
	 System.out.println("Enter Roll Number Of Student:");
	 String roll=s.nextLine();
	 System.out.println("Enter Address Of Student:");
	 String address=s.nextLine();
	 st[i]=new Student(name,roll,address); 
	 }
	 for(int i=0;i<n;i++)
	 {
		 System.out.println("The Details of "+(i+1)+" Student ");
		 st[i].display();
	 }
  }
}