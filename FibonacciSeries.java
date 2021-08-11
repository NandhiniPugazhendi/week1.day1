package week1.day1;

public class FibonacciSeries {
	public static void main(String[] args) {
		int range = 8;
		int firstnumber = 0;
		int secondnumber = 1;
		int sum;
		System.out.println(firstnumber);
		for (int i = 1; i < range; i++) {
		sum = firstnumber + secondnumber;
			firstnumber=secondnumber;
			secondnumber = sum;
			System.out.println(sum);
			
		}
	}

}
