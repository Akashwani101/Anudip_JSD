import java.util.Scanner;
//main method ek alag class mai
public class kidsLaptop{
    public static void main(String[] args) {
        solution ref = new solution();
        ref.choices();
        }
    }
//main method wale class ke bahr wala class
//accessing this class with creating an object and write in main method
class solution{
        void choices(){
            Scanner sc = new Scanner(System.in);     
           
        while(true){    
            System.out.println("1 - for addition");
            System.out.println("2 - for substraction");
            System.out.println("3 - for multiplication");
            System.out.println("4 - for division");
            System.out.println("5 - to quit");
            int choiceInput = sc.nextInt();

            switch(choiceInput){
                case 1 :
                    System.out.println("Enter the first Number : ");
                    int num1 = sc.nextInt();
                    System.out.println("Enter the second Number : ");
                    int num2 = sc.nextInt();
                    System.out.println(" Addition : "+ (num1 + num2));
                    break;

                case 2 :
                    System.out.println("Enter the first Number : ");
                    int n1 = sc.nextInt();
                    System.out.println("Enter the second Number : ");
                    int n2 = sc.nextInt();
                    System.out.println(" substraction : "+ (n1 - n2));
                    break;

                case 3 :
                    System.out.println("Enter the first Number : ");
                    int n3 = sc.nextInt();
                    System.out.println("Enter the second Number : ");
                    int n4 = sc.nextInt();
                    System.out.println(" Multiplication : "+ (n3 * n4));
                    break;
                
                case 4 :
                    System.out.println("Enter the first Number : ");
                    int n5 = sc.nextInt();
                    System.out.println("Enter the second Number : ");
                    int n6 = sc.nextInt();
                    System.out.println(" Division : "+ (n5 - n6));
                    break;   
                    
                case 5 :
                    System.out.println("Quiting...");
                    return;

                default : 
                    System.out.println(" Please select the right option.");    
                }                  
            }
        }
    }
