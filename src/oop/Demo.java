package oop;

class Person {
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(email);
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}

public class Demo {

	public static void main(String[] args) {
		
		// Instantiating an object
		Person person1 = new Person();
		
		// Define some property
		person1.name = "joe";
		person1.email = "joe@testemail.com";
		person1.phone = "7045905432";
		
		// Attractions
		person1.walk();
		
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.sleep();
		

		
		
		
		
		
		
		/*
		// Person-
		
		//Attributes, variables, adjectives, descriptors
		String name = "Joe";
		String email = "joe@testemail.com";
		String phone = "7897894564";
		
		//Action, Activity, behavior
		walking(name);
		System.out.println(name + " is eating");
		
		//What if we wanted to do this for another person?
		String name2 = "Sarah";
		String email2 = "sarah@testemail.com";
		String phone2= "3213216548";
		
		//Action, Activity, behavior
		walking(name2);
		System.out.println(name2 + " is eating");
		
		//What about binding attributes and properties together?

	}
	
	//Enhance by adding functions to minimize code
	static void walking(String name){
		System.out.println(name + " is walking");
	}
	*/
		
	}

}
