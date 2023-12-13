interface LibraryUser{
	void registerAccount();
	void requestBook();
}

class KidUser implements LibraryUser{
	int Age;
	String bookType;

	public void registerAccount(){
		if(Age<12)System.out.println("Sorry, Age must be less than 12 to register as a kid.");
		
	}
	public void requestBook(){
		if(bookType=="Kids"){
			System.out.println("Book Issued sucessfully please return the book within 10 days.");
		}else{
			System.out.println("Oops, you are not allowed to take only kids books.");
		}
	}
}

class AdultUser implements LibraryUser{
	int Age;
	String bookType;
	public void registerAccount(){
		if(Age>12){
			System.out.println("You have sucessfully registered under an Adult Account.");
		}else{
			System.out.println("Sorry, Age must be greater than 12 to register as an adult.");
		}
	}
	public void requestBook(){
		if(bookType=="Fiction"){
			System.out.println("Book Issued sucessfully please return the book within 7 days.");
		}else{
			System.out.println("Oops, you are not allowed to take only adult fiction books.");
		}
	}
}

class LibraryInterfaceDemo{
	public static void main(String args[]){
		KidUser ku = new KidUser();
		ku.Age = 10;
		ku.registerAccount();
		ku.Age = 18;
		ku.registerAccount();
		ku.bookType="Kids";
		ku.requestBook();
		ku.bookType="Fiction";
		ku.requestBook();
		System.out.println("---------------------");
		AdultUser au = new AdultUser();
		au.Age = 5;
		au.registerAccount();
		au.Age = 23;
		au.registerAccount();
		au.bookType="Kids";
		au.requestBook();
		au.bookType="Fiction";
		au.requestBook();


}
}