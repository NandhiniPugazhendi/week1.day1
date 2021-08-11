package week1.day1;

public class SumOfDigits {

	public static void main(String[] args) {
		int number = 568;
		int remainder;
		int sum = 0;
        while (number > 0) {
	     
        	remainder = number % 10;
        	System.out.println(remainder);
        	sum = sum + remainder;
        	System.out.println(sum);
        	number = number / 10;
        	System.out.println(number);
        	    	
}
	System.out.println("The sum of digits of 568 is " + sum);
		
	}
}
