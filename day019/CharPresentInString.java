/*
 * Write a program to find the Character present in the String or not?
 * 
 * 
 */
package day019;

public class CharPresentInString {

	public static void main(String[] args) {

		String s = "Yugandhar";

		char ch = 'g';

		boolean flag = false;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch) {
				flag = true;
			}
		}

		if (flag == true) {
			System.out.println("The Given Character Present in the String");
		} else {
			System.out.println("The Given Character Doesn't Present in the String");
		}

	}

}
