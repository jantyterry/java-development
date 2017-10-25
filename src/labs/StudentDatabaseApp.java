package labs;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		StudentDatabase sd1 = new StudentDatabase("Chriser", "234546745");
		sd1.setCity("Snellville");
		sd1.setState("Georgia");
		sd1.setPhone("7048643423");
		sd1.enroll("Math151");
		sd1.enroll("Eng255");
		sd1.enroll("His211");
		sd1.pay(780);
		
		sd1.showCourse();
		sd1.checkBalance();
		
		System.out.println(sd1.toString());

	}
	

}

class StudentDatabase {
	// 1. Properties
	private static int iD = 1000;	
	private String userID;   // equals s combination of Static ID, random 4-digit number between
							 // 1000 and 9000, and last 4 of SSN
	private String phone;
	private String city;
	private String state;
	private String emailID; // generates from name
	private String name;
	private String SSN;
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance = 0;
	
	// 2. Constructor
	public StudentDatabase(String name, String SSN) {
		this.name = name;
		this.SSN = SSN;
		iD++;
		setEmailID();
		setUserID();
		
	}
	
	private void setUserID() {
		int random = 1000 + (int) (Math.random() * 8000);
		userID = iD + "" + random + "" + SSN.substring(5);
		System.out.println("Your User ID: " + userID);
		
	}
	
	private void setEmailID() {
		emailID = name.toLowerCase() + "." + iD + "@hsuniversity.com";
		System.out.println("Your User Email: " + emailID);
	}
	
	// Setter and Getter
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	//Methods Methods: enroll(), pay(), checkBalance(), toString(), showCourses()
	public void enroll(String course) {
		this.courses = this.courses + " " + course;
		balance = balance + costOfCourse;
	}
	
	public void pay(int amount) {
		System.out.println("Payment : $" + amount);
		balance -= amount;
	}
	
	public void checkBalance() {
		System.out.println("Balance: $" + balance);
		
	}
	
	public void showCourse() {
		System.out.println(courses);
		
	}
	
	@Override
	public String toString() {
		return "{ Name: " + name + " }\n{ User Email: " + emailID + " }\n{ User ID: " + userID + " }\n{ Courses: " + courses + " }\n{ Balance: " + balance + " }";
	}
}
