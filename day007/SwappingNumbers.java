/*
 * Write a program to swap two numbers with and without using third variable?
 * Swapping of Numbers: Swapping two numbers means exchanging the values of two variables.
 * 						It is done by two ways
 * 						1. With using third variable
 * 						2. Without using third variable
 * Ex:  var a = 100;                        a = 200;
 *          b = 200;      After Swapping    b = 100;
 */
package day007;
public class SwappingNumbers {
	public static void main(String[] args) {
		// With using third variable
		// Intialize a variable a and b with some values
		int a = 120;
		int b = 140;
		
		System.out.println("Before Swapping: a is = " + a + " and b is = " + b);
		System.out.println();

		// here swapping the two variables with using third variable c
		int c = a; // here c = a means c = 120;
		a = b; // here a = b means a = 140;
		b = c; // gere b = c means b = 120; -- because c = a that = 120.

		// so now a = 140 and b = 120...
		System.out.println("After Swapping: a is = " + a + " and b is = " + b);
		System.out.println();
		// Without Using the Third Variable

		int x = 100;
		int y = 200;

		System.out.println("Before Swapping: x is = " + x + " and y is = " + y);

		System.out.println();

		x = x + y;  // x = 100 + 200 = 300;  -- x = 300;
		y = x - y;  // y = 300 - 200 = 100;  -- y = 100;
		x = x - y;  // x = 300 - 100 = 200; --  x = 200;
		
		//Then x = 200; and y = 100;
		System.out.println("After Swapping: x is = " + x + " and y is = " + y);
	}
}
