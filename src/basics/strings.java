package basics;

public class strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The lord of the Rings";
		
		
		if(bookTitle.contains(wordChoice)){
			System.out.println("The book contains the word " + wordChoice);
		}
		
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
		}
		
		String firstname = "Tm";
		String lastname = "Short";
		String SSN = "996548464";
		System.out.println("There are " + SSN.length() + " digits in your SSN.");
		
		//print the initials plus last 4 digits of SSN
		System.out.print(firstname.substring(0, 1));
		System.out.print(lastname.substring(0, 1));
		System.out.print(SSN.substring(5));
	}

}
