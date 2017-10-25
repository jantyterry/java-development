package basics;

public class testPracticeHW {

	public static void main(String[] args) {
		summing(4);
		System.out.println(factnum(4));
		int min, avg, max;
		int [] ages = {16, 10, 24, 8, 18, 6, 15};
		min = arrayMin(ages);
		System.out.println(min);
		max = arrayMax(ages);
		System.out.println(max);
		avg = arrayAvg(ages);
		System.out.println(avg);

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
	
static int arrayMax(int[] values){
		
		int max = values[0];
		int i;
		for(i=0; i<values.length; i++){
			if(values[i] > max){
				max = values[i];
			}
		}
		
		return max;
		
	}

static int arrayAvg(int[] values){
	
	int avg;
	int sum = 0;
	int i;
	for(i=0; i<values.length; i++){
		sum += values[i];
	}
		avg = sum/values.length;
	return avg;
	
}

}
