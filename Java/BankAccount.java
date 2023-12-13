//interface to implement
interface BankOperations {
    double getBalance();

    void deposit(double amount);

    void withdraw(double amount);
}

class BankAccount implements BankOperations {
    private String accountHolderName;
    private String bankName;
    private double accountBalance;

   //Construtor 
   BankAccount(String accountHolderName, String bankName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.accountBalance = initialBalance;
    }


    public double getBalance() {
        return accountBalance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposit of Rs."+amount +" is successful.\nUpdated balance is: " + accountBalance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

  
    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawal of Rs."+amount+" is successful.\nRemaining Balance: " + accountBalance);
	    System.out.println("========================================================");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }


    public static void main(String[] args) {
        // Create three bank accounts with different account holders names and bank names
        BankAccount account1 = new BankAccount("Ram", "ICICI", 1000.0);
        BankAccount account2 = new BankAccount("Sham", "HDFC", 1500.0);
        BankAccount account3 = new BankAccount("Sai", "SBI", 2000.0);

	// Display the account balances before transaction/operation
        System.out.println("Account 1 Balance: " + account1.getBalance());
        System.out.println("Account 2 Balance: " + account2.getBalance());
        System.out.println("Account 3 Balance: " + account3.getBalance());
    
        // Deposit and withdraw money for each account
        account1.deposit(500.0);
        account1.withdraw(200.0);
        account2.deposit(1000.0);
        account2.withdraw(700.0);
	account3.deposit(1000.0);
        account3.withdraw(700.0);

        // Display the account balances after transaction
	System.out.println("----------------------------------------------");
        System.out.println("AccountHolder Name: "+account1.accountHolderName+" | Bank Name:"+ account1.bankName +"| Balance: " + account1.getBalance());
        System.out.println("AccountHolder Name: "+account2.accountHolderName+" | Bank Name:"+ account2.bankName +"| Balance: " + account2.getBalance());
        System.out.println("AccountHolder Name: "+account3.accountHolderName+" | Bank Name:"+ account3.bankName +"| Balance: " + account3.getBalance());
	
	System.out.println();
    }
}
