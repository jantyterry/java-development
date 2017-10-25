package basics;

public class weather {
	public static void main(String[] args){
		//give suggestion on what to wear base 
		//on the weather
		
		int temperature = 65;
		String sunCondition = "Overcast";
		
		if (temperature > 80){
			System.out.println("It's pleasant, wear shorts and t-shirts");
		}
		else if ((temperature > 60) && (sunCondition == "Sunny")){
			System.out.println("It's kind of chilly, Perhaps wear a long-sleeve shirt and jeans");
			System.out.println("Wear a hot too");
		}
		else if ((temperature > 50) || (sunCondition == "Overcast")){
			System.out.println("this is a cool day, make sure to wear warm clothes");
		}
		else{
			System.out.println("Looks like a cold day, bring a sweater");
		}
		System.out.println("Weather suggestion program as ended!");
	}

}
