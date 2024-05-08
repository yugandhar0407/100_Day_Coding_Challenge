/*
 * Weite a program to removing spaces from the string with inbulit and without inbuilt method?
 * Removing Spaces: Removing Spaces from a String involves eliminating any white space characters within the 
 * 					String.
 * 
 * 					This is done by two methods 
 * 						1. InBuilt Method
 * 						2. Without InBuilt Method
 */

package day006;

public class RemovingWhiteSpaces {

	public static void main(String[] args) {

		// With InBuilt Method
		String s = " Hello Welcome to 100-Day Coding Challenge";

		System.out.println("Without Removing Spaces: " + s);

		System.out.println();

		System.out.println("With Removing Spaces: " + s.replace(" ", ""));
		
		System.out.println();

		// WithOut InBuilt Method
		String str = "Hello AP Bye Bye YCP";

		String remove = " ";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch != ' ') {
				remove = remove + ch;
			}
		}
		System.out.println("Without Removing Spaces: " + str);
		
		System.out.println();
		
		System.out.println("With Removing Spaces: " + remove);
	}
}
