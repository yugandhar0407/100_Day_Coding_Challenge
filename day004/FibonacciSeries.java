/*
 * Write a program to print Fibonacci Series up to 10?
 * 
 * Fibonacci Series: The Fibonacci Series in Java is a set of numbers where every number is the sum
 *                   of the two numbers before it.
 *                   The series starts from 0 and the following number is 1.
 *                   
 *                   Ex: 1,1,2,3,5,8,13,21,......
 */

package day004;

public class FibonacciSeries {

	public static void main(String[] args) {

		// Intialiaze a Variables a, b, and sum
		int a = 0;
		int b = 1;
		int sum = 0;
		// Used for loop to iterate a numbers from 1 to 10;
		for (int i = 1; i <= 10; i++) {

			System.out.print(i + ")" + sum + " ");
			// here the main logic starts 
			a = b;
			b = sum;
			sum = a + b;
		}

	}

}
