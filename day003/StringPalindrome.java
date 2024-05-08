package day003;
/*
 * Implement a function to check if a given string is a palindrome or not?
 * 
 * Palindrome: A String is said to be a palindrome if it is the same if we start reading it from left to 
 *             right or right to left.
 *             Ex: RACECAR
 *                 LEVEL
 *                 MADAM          
 */

public class StringPalindrome {

	public static void main(String[] args) {
		// Intialize a string with string value RACECAR in s variable
		String s = "RACECAR";
		// empty string to store the rev string
		String rev = "";
		// used for loop to iterate a string values in reverse order
		for (int i = s.length() - 1; i >= 0; i--)
			// The values store in reverse order in rev variable
			rev = rev + s.charAt(i);
		// Checking if both the strings are equal not
		if (s.equals(rev))
			System.out.println(s + " String is a palidrome");
		else
			System.out.println(s + " String is not a palindrome");
	}
}
