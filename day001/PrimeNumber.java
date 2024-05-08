/*
 * Write a Program to find the given number is prime number or not?
 * 
 * Prime Number in Java : A Positive Integer with only two factors, 1 and itself is known as the prime Number.
 * 						  A Number that is not composite.
 * Examles: 3,5,13,23, etc,.
 * 
 */

package day001;

public class PrimeNumber {

	public static void main(String[] args) {

		// Intialize a variable num with int data type with number 13.
		int num = 13;
		// Intialize a variable count with int data type for counting the prime numbers
		int count = 0;
		// Used for loop to increment values from 1 to 13
		for (int i = 1; i <= num; i++) {
			// used if condition if the num values is equal to modulus 0
			if (num % i == 0) {
				// count variable collects the numbers which is equal to modulus 0
				count++;
			}
		}
		// Used if - else condition for the counted values are 2 or not
		// if counted values are 2 it will printed a prime number otherwise it will
		// printed as not a prime number.
		if (count == 2) {
			System.out.println(num + " is a Prime Number");
		} else {
			System.out.println(num + " is not a Prime Number");
		}

	}

}
