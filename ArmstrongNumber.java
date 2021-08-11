package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
	
		int input = 153;
		int calculated = 0, remainder, original;
		original = input;
		while (original > 0) {
		remainder = original % 10;
		original = original/10;
		calculated += remainder * remainder * remainder;
		}
		
		if (calculated==input) {
			System.out.println(input + " is an Armstrong Number");
			
		} else {
			System.out.println(input + " is not an Armstrong Number");

		}
		
		
		}
		
	}
