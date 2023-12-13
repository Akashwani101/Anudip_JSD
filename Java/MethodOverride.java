//import java.util.Scanner;
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    //Overriding method
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    //Overriding method
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        // Create objects of each class
        Animal animal = new Animal();
	//Scanner sc= new Scanner(System.in);
	
        Dog d = new Dog();
        Cat c = new Cat();

        // Display sounds
        System.out.println("Animal Sound:");
        animal.makeSound();
	
	// Display Dog sound
        System.out.println("\nDog Sound:");
        d.makeSound();     		

	// Display cat sound
        System.out.println("\nCat Sound:");
        c.makeSound();
    }
}