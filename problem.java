import java.util.Scanner;

public class problem {
  
    
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);
        // created oblect of the problem class
        problem solution = new problem();
        method refVariable = new method();

        System.out.println("Choose among the following options : ");
        System.out.println("A : Addition");
        System.out.println("S : Sustraction");
        System.out.println("M : Multiplication");
        System.out.println("D : Division");
        //accepting choice
        int option = sc.nextInt();
      

    }
    
    static class method{

        switch(option){
            case A : 
                System.out.println("enter the first number");
                int num1 = sc.nextInt();
                
        }

    }
}
