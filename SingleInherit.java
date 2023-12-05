public class A {
    public void display() {
        System.out.println("I am a method from class A");
    }
}

// SingleInherit class is inheriting display method of A
class SingleInherit extends A {
    public void print() {
        System.out.println("I am a method from class SingleInherit");
    }

    public static void main(String[] args) {
        SingleInherit obj = new SingleInherit();
        obj.display(); // Reusing the method of A named display
        obj.print();    
    }
}