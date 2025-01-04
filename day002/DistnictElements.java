
/*
 * Write a program to print all the distinct(unique) values in the given array with sorting?
 * Distinct Values:
 * Distinct values means only unique values like - 
 *  An array may contain duplicates and the output should print every element only once with sorting.
 *  Ex: input - int arr[] = {12,4,4,5,6,45,3,4,5,6,1};
 *      output - 
 *   
 */

package day002;

import java.util.Arrays;
import java.util.Scanner;

public class DistnictElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please Input The Array Size");

		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Please Input The Array Values");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("The Distnict Elements In An Array Are: ");
		Arrays.sort(arr);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {

				if (j == i) {
					System.out.println(arr[i] + " ");
				}
				if (arr[i] == arr[j]) {
					break;
				}
			}
		}
	}
}
