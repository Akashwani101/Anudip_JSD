import java.util.Scanner;
class Calculator{

//first add method for adding two integers
public static int add(int num1,int num2){   
 	return (num1 + num2);
    }

//second add method for adding three integers
public static int add(int num1,int num2,int num3){
	return (num1 + num2 + num3);
    }

//third add method for adding two doubles
public static double add(double num1,double num2){
	return (num1 + num2);

    }


public static void main(String args[]){

	Scanner scanner = new Scanner(System.in);   //Scanner class object to accept input from user
	
	 // Get inputs for integer addition
        System.out.print("Enter first integer for addition:: ");
        int int1 = scanner.nextInt();

        System.out.print("Enter second integer for addition: ");
        int int2 = scanner.nextInt();

        // Display result of integer addition of first add() method
	int result1 = add(int1, int2);
	System.out.println("-----------------------------------------------");
        System.out.println("Result of adding two integers is "+int1+"+"+int2+" ="  + result1);

        // Get input for three integer addition
        System.out.print("Enter third integer for addition: ");
        int int3 = scanner.nextInt();

        // Display result of three integer addition using the second add() method
        int result2 = add(int1, int2, int3);
	System.out.println("-----------------------------------------------");
        System.out.println("Result of adding three integers is "+int1+"+"+int2+"+"+int3+" ="  + result2);

        // Get inputs for double addition
        System.out.print("Enter first double for addition: ");
        double double1 = scanner.nextDouble();

        System.out.print("Enter second double for addition: ");
        double double2 = scanner.nextDouble();

        // Display result of double addition using the third add() method
        double result3= add(double1, double2);
        System.out.println("-----------------------------------------------");
        System.out.println("Result of adding two doubles is "+double1+" + "+double2+" ="  + result3);

	}

}