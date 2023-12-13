public class Employee {
    protected int id;
    protected int age;
    protected String name;
    protected boolean isPermanent;

    // Main method
    public static void main(String[] args) {
        // Correcting the error by casting 35.5 to int
        Employee employee = new Employee();
        employee.age = (int)35.5;
        System.out.println("Successfully started");
    }
}