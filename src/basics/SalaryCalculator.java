package basics;

public class SalaryCalculator {
	public static void main(String[] args){
		
		String career;
		System.out.println("Program is Starting");
		career = "Software Developer";
		System.out.println("My career is: " + career);
		
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		double salary = hoursPerWeek * rate * weeksPerYear;
		System.out.println("Annual Salary as a " + career + " at a rate $" + rate + " per hour is $" + salary + " per year");
	}

}
