/*
 * Write a program to find the given number is a palindrome or not?
 * 
 * Palindrome Number: A Palindrome Number is a number that reads the same in forward and backword.
 * 
 * Ex: 121, 131, 132231. etc,.
 */

package day013;

public class PalindromeNumber {

	public static void main(String[] args) {

		int number = 121;

		int temp = number;

		int reversenum = 0;

		while (temp != 0) {
			int lastdigit = temp % 10;
			reversenum = reversenum * 10 + (lastdigit);
			temp = temp / 10;
		}

		if (number == reversenum) {
			System.out.println(number + " is a Palindrome");
		} else {
			System.out.println(number + " is not a Palindrome");
		}

	}

}
