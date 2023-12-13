class Aggregation {

public static void main(String args[]){

	Department d = new Department("Training","Tivari sir","abc@gmail.com",90233444);
	Employee e = new Employee("akshay","akshay@gmail.com","Trainer",75667778,d);
	e.display();
	System.out.println("=======================");
	Department d1 = new Department("HR","Shubh","sss@gmail.com",90237888);
	Employee e1 = new Employee("aryan","aryan@gmail.com","HR",345656778,d1);
	Employee e2 = new Employee("sham","sham@gmail.com","Sr.HR",465778772,d1);

	e1.display();
	e2.display();

}
}