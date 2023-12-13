import java.util.Scanner;
class Car{

//Attributes of Car class
String make,model;
short year;
int price;

//Constructor of Car class
Car(String make,String model,short year,int price){
	this.make=make;
	this.model=model;
	this.year=year;
	this.price=price;

      }
//method to create 
public static Car createCar() {
	Scanner scanner = new Scanner(System.in);  //Scanner object to accept details from user
        System.out.print("Enter make: ");
        String make = scanner.next();

        System.out.print("Enter model: ");
        String model = scanner.next();

        System.out.print("Enter year: ");
        short year = scanner.nextShort();

        System.out.print("Enter price: ");
        int price = scanner.nextInt();

        return new Car(make, model, year, price);
    }

//method to display details
public void displayCarDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        

        // Create car objects
        System.out.println("Enter details for Car:");
        Car car = createCar();

        // Display car details
        System.out.println("\nCar Details Are::");
        car.displayCarDetails();

}

}


