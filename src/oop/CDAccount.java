package oop;

// If we write a class A that inherits B, then we write "public class A extends B {}"
public class CDAccount extends BankAccount implements IRate {
	
	double interestRate;
	void compound() {
		System.out.println("Compounding Interest: " + interestRate);
	}

}
