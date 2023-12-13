class Employee{
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double Hra = 1000.50;
	
	/*Employee(long Id,String Name,String Address,long Phone){
		this.employeeId = Id;
		this.employeeName = Name;
		this.employeeAddress=Address;
		this.employeePhone=Phone;
	}*/
	
	void calculateSalary(){
		double salary = basicSalary + (basicSalary + specialAllowance/100) + (basicSalary * Hra/100);
		System.out.println("Salary is: "+salary); 
		-
	}
	void calculateTransportAllowance(){
		double transportAllowance=10*basicSalary/100;
		System.out.println("Transport Allowance for Trainee is: "+transportAllowance);
	}

}
class Manager extends Employee{
	
	//constructor
	Manager(long Id,String Name,String Address,long Phone,double Salary){
		this.employeeId = Id;
		this.employeeName = Name;
		this.employeeAddress=Address;
		this.employeePhone=Phone;
		this.basicSalary=Salary;
	}
	void calculateTransportAllowance(){
		double transportAllowance=15*basicSalary/100;
		System.out.println("Transport Allowance for Manager is: "+transportAllowance);
	}
}
class Trainee extends Employee{
	//contrutor
	Trainee(long Id,String Name,String Address,long Phone,double Salary){
		this.employeeId = Id;
		this.employeeName = Name;
		this.employeeAddress=Address;
		this.employeePhone=Phone;
		this.basicSalary=Salary;
	}
}
class InheritanceActivity{
	public static void main(String args[]){
		Manager m = new Manager(126534,"Peter","Chennai India",237844,65000.0);
		m.calculateSalary();
		m.calculateTransportAllowance();
		
		Trainee t = new Trainee(29846,"Jack","Mumbai India",442085,45000);
		t.calculateSalary();
		t.calculateTransportAllowance();
	}

}