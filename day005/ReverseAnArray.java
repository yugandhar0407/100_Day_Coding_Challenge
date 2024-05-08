/*
 * Write a program to reverse the given array?
 * 
 * Reverse an Array - Reverse an Array means changing the position of each number of the given array to its 
 *                    opposite position from the end.
 *                    
 *            Ex:   - input - Original_array[] = {1,2,3};
 *                    output - Reversed_array[] - {3,2,1};
 *                    
 *            
 *             
*/

package day005;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		
		// Intialize an array with some elements
		int arr[] = { 1,3, 5, 7, 9, 11, 13, 15, 17, 19 };

		System.out.println("Before Reverse: ");

		// print the normal array using for loop for understanding
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		System.out.println("After Reverse Array: ");

		//Used the for loop to reverse the order of an array 
		for (int j = arr.length - 1; j >= 0; j--) {
			System.out.print(arr[j] + " ");
		}

	}

}
