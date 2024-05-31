/*
 * Write a program to check whether two strings are anagram or not?
 * 
 * String Anagram: An Anagram of a String is another String that contains the same characters, only
 * 					the order of characters can be different.
 * 
 *	Ex:  listen    earth
 *		 silent    heart
 */
package day009;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {

		// Intialize the two Strings with s and r variables
		String s = "listen";
		String r = "silent";

		// Firstly Check the two Strings length are equal or not,
		// if not it is not an Anagram.
		if (s.length() != r.length()) {
			System.out.println("Not an Anagram");
		}

		// now convert the strings into a sequence of chars
		char ch[] = s.toCharArray();
		char ch1[] = r.toCharArray();

		// Sort the two Strings
		Arrays.sort(ch);
		Arrays.sort(ch1);

		// if the two strings are equal then it will be a Anagrams.
		if (Arrays.equals(ch, ch1)) {
			System.out.println("The Given Strings are Anagrams");
		} else {
			System.out.println("Not An Anagramsa");
		}

	}

}
