//package ConditionalStatement;
import java.util.Scanner;
public class ScannerLaptopDemo {
	public static void main(String args[])
	{ 
	  int option;
	do
	{	System.out.println("Add-1");
		System.out.println("Subtract-2");
		System.out.println("Multiply-3");
		System.out.println("Even/Odd-4;");
		System.out.println("Quit-5;");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your option");
		 option=sc.nextInt();
		 switch(option)
		 {
		    case 1:
				 System.out.println("Enter two numbers to be added");
				 int a=sc.nextInt();
				 int b=sc.nextInt();
				 int ans=a+b;
				 System.out.println("The result is "+ ans);
				 break;
		     
		    case 2:
		    	 System.out.println("Enter two numbers to be subtracted");
				 int m=sc.nextInt();
				 int n=sc.nextInt();
			     int c=m-n;
			     System.out.println("The result is "+ c);
			     break;
			case 3:
		    	System.out.println("Enter two numbers to be multiplied");
				 int s=sc.nextInt();
				 int t=sc.nextInt();
			     int st=s*t;
			     System.out.println("multiplication of two number is "+ st);
			     break;
		    case 4:
		    	System.out.println("Enter number to check even or odd");
				 int num=sc.nextInt();
				 if(num%2==0)
				 {
				 System.out.println(" given number is even number");
				 }
				 else
				 {
					 System.out.println(" given number is odd number");
				 }
			     
			     break;
		    case 5:
		    	System.out.println("quit");
		    	break;
		 }
	}
	  while(option !=5);
	
	}
}


