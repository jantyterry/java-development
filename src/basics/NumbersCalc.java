package basics;

public class NumbersCalc {
	public static void main(String[] args){
		System.out.println("Program is Starting");
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		int product = multiplyNumbers(numA, numB);
		System.out.println("the product of numbers " + numA + " and " + numB + " is: " + product);
	
	}
	
	static void printName(){
		System.out.println("My name is Chris");
	}
	
	static void addNumbers(int a, int b){
		 int sum;
		 sum = a + b;
		 System.out.println("The sum of " + a + " and " + b + " is: " + sum);
	}
	
	
	static int multiplyNumbers(int a, int b){
		int product;
		product = a * b;
		addNumbers(product, product + a);
		return product;
	}
	

}
