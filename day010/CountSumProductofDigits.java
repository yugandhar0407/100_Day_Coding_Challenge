/*
 * Write a program to print count, sum, and product of digits?
 */
package day010;

public class CountSumProductofDigits {

	public static void main(String[] args) {

		//Count of Digits
		int n = 123456;
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		System.out.println("The Count of digits is: "+count);

		//Sum of Digits
		int b = 1234;
		int sum = 0;
		int lastdigit = 0;
		
		while (b != 0) {
			lastdigit = b % 10;
			sum = sum + lastdigit;
			b = b / 10;
		}
		System.out.println("The Sum of Digits is: "+sum);
	
		//Product of Digits
		int c = 1234;
		int product = 1;
		int lastdigit1 = 0;

		while (c != 0) {
			lastdigit1 = c % 10;
			product = product * lastdigit1;
			c = c / 10;
		}
		System.out.println("The Product of Digits is: "+product);
	}

}
