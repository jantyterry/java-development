package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("435346754", 1000.50);
		BankAccount acc2 = new BankAccount("563789325", 2000);
		BankAccount acc3 = new BankAccount("325789034", 2500);
		BankAccount acc4 = new BankAccount("745235783", 1500);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
		

	}

}

class BankAccount implements IInterest {
	// 1. Properties of bank account
	// Use Encapsulation on the variable by making them private to the class
	private static int iD = 1000;	// Internal ID, generate from the bank system
	private String accountNumber;   //equals to iD + random 2-digit number + first 2 of SSN
	private static final String routingNumber = "051784346";
	private String name;
	private String SSN;
	private double balance;
	
	// 2. Constructor
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		iD++; //every time a new object is created the class constructor generate a iD from internal
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = iD + "" + random + "" + SSN.substring(0, 2);
		System.out.println("Your Account Number: " + accountNumber);
	}
	
	// getter and Setter 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// Methods
	public void payBill(double amount) {
		System.out.println("Paying Bill: " + amount);
		balance -= amount;
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		System.out.println("Making deposit: " + amount);
		balance += amount;
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}
	
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
	}
	
	@Override
	public String toString() {
		return "{ Name: " + name + " }\n{ Account Number: " + accountNumber + " }\n{ Routing Number: " + routingNumber + " }\n{ Balance: " + balance + " }";
	}
	
	
	
	
	
	
	
}
