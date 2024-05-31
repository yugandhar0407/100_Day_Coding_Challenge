/*
 * Write a program to print number of words present in string
 */

package day016;

public class WordsPresentInString {

	public static void main(String[] args) {

		String s = "Happy Birthday Nandhamuri Taraka Ramarao";

		String str[] = s.split(" ");
		int count = 0;

		for (int i = 0; i < str.length; i++) {
			count++;
		}
		System.out.println(count + " words are present");

		
	}

}
