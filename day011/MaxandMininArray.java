/*
 * Write a program to find the maximum and minimum values in an array?
 * 
 */
package day011;

public class MaxandMininArray {

	static int getMin(int arr[], int n) {
		int min = arr[0];
		for (int i = 0; i < n; i++) {
			min = Math.min(min, arr[i]);
		}
		return min;
	}

	static int getMax(int arr[], int n) {
		int max = arr[0];
		for (int i = 0; i < n; i++) {
			max = Math.max(max, arr[i]);
		}
		return max;
	}

	public static void main(String[] args) {

		int arr[] = { 12, 14, 15, 1, 4, 230, 5 };
		int n = arr.length;

		System.out.println("The Minimum Element in an array is: " + getMin(arr, n));

		System.out.println();

		System.out.println("The Maximum Element in an array is: " + getMax(arr, n));

	}

}
