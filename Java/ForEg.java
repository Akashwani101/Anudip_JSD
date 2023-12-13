
import java.util.Scanner; //import Scanner package
class ForEg{
	void calc_Table(){
			Scanner sc = new Scanner(System.in); 
			char status ;
	do{
		System.out.println("Enter number"); 
		int number = sc.nextInt(); //input from user
		for(int i=1;i<=10;i++){
			System.out.println("Value is :  " + ( number*i ));
		}
		
	System.out.println("Do you want to continue Y/N ");
	status = sc.next().charAt(0);
			
	}while(status=='Y');
	
	
	}
	public static void main(String args[]){		
		
		
		
		ForEg e = new ForEg();
		e.calc_Table();
		
		
	}
}
