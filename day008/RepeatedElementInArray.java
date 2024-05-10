/*
 * Write a program to find the most repeated element in an array?
 * 
 * Repeated Element in An Array: It meansto print the element that appears the most 
 *                               in a given array.
 *                               
 * Ex: input arr[i] = {1,2,4,1,1,5};
 *     output = 1
 * 
 */

package day008;

public class RepeatedElementInArray {

	public static int mostRepeated(int[] arr, int n) {

		int maxcount = 0;
		int repeatedelement = 0;
		
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
		if (count > maxcount) {
			maxcount = count;
			repeatedelement = arr[i];
		}
	}
	return repeatedelement;

}
	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 3, 6, 5, 5 };
		int n = arr.length;

		System.out.println("The Most Repeated Element in Array is: "+mostRepeated(arr, n));

	}
}
