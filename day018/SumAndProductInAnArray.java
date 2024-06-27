/*
 * Write a program to print sum and product in given array elements?
 * 
 */

package day018;

public class SumAndProductInAnArray {

	public static void main(String[] args) {

		int arr[] = { 2, 4, 6, 8, 10 };

		int sum = 0;

		int product = 1;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			product = product * arr[i];
		}

		System.out.println("The Sum of Array Elements: " + sum);

		System.out.println();

		System.out.println("The Product of Array Elelents: " + product);

	}

}
