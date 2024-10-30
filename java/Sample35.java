
import java.util.Scanner;
class Stack
      {
	   int top,n;
	   int a[];
	   Stack(int size)
	       {
			 n=size;
			 a=new int[size];
			 top=-1;
		   }
		void push(int m)
		   {
			   if(top>n)
			   {
				   System.out.println("STACK IS FULL");
			   }
			   else
			     {
                    top++;
					a[top]=m;
                 }
		   }
		int pop()
		   {
			if(top==-1)
			 { System.out.println("STACK IS EMPTY");
		       return -1;
			 }
			else
			   {
				   int item=a[top];
				   top--;
				   return item;
				   
			   }
		   }
		   void display()
		       {
				  if(top==-1)
				    {System.out.println("STACK IS EMPTY");
				    }	
                   else
				   {
					 for(int i=top;i>=0;i--)
					   {
						  System.out.println(a[i]);
					   }
				   }					   
				   
			   }
	  }
class Sample35
    {
	public static void main(String a[])
	     {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A Size:");
		int size=s.nextInt();
		Stack st=new Stack(size);
		while(true)
		    {
			System.out.println("Enter Your Choice: \n 1.PUSH \n 2.POP \n 3.DISPLAY \n 4.EXIT");
			int choice=s.nextInt();
			switch(choice)
			    {
				case 1:System.out.println("Enter A Element to Add");
				       int item=s.nextInt();
					   st.push(item);
					   break;
				case 2:int x=st.pop();
				       if(x!=-1)
				       System.out.println("Removed Element is "+ x);
				       else
					   {;}
					   break;
			    case 3:
				       System.out.println("Element in Stack:");
					   st.display();
					   break;
				case 4:
				       System.out.println("Exited...........");
					   System.exit(0);
					   break;
				default:
				       System.out.println("Choice Wrong");
				}
				
			}
			}
			 
		 }
		
		
		
		
