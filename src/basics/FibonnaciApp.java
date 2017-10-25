package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// Fibonnaci number is defined by the sum of the 2 previous fibonnaci numbers
		//fib(0) = 0
		//fib(1) = 1
		//fib(2) = fib(1) + fib(0) = 1 + 0 = 1
		//fib(3) = fib(2) + fib(1) = 1 + 1 = 2
		//fib(4) = fib(3) + fib(2) = 2 + 1 = 3
		//fib(5) = fib(4) + fib(3) = 3 + 2 = 5
		System.out.println(fib(5));
		summing(4);
		System.out.println(factnum(4));
	}
	
	public static int fib(int n){
		if(n == 0){
			return 0;
		}
		else if(n == 1){
			return 1;
		}
		return (fib(n-1) + fib(n-2));
	}
	
	
	static void summing(int n){
		int sum = 0;
		for(int i = n; i >=1; i--){
			sum += i;
		}
		System.out.println(sum);
	}
	
	public static int factnum(int n){
		if(n == 0){
			return 1;
		}
		else if(n == 1){
			return 1;
		}
		
		return (n * factnum(n-1));
	}
	
	static int arrayMin(int[] values){
		
		int min = values[0];
		int i;
		for(i=0; i<values.length; i++){
			if(values[i] < min){
				min = values[i];
			}
		}
		
		return min;
		
	}
	
}