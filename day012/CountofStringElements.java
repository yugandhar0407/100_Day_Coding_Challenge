/*
 * Write a program to print the count of number of alphabets, numbers, and special characters in a string?
 */
package day012;
public class CountofStringElements {

	public static void main(String[] args) {
		//Intialize a String with s variable
		String s = "yugandhar2128@gmail.com";

		//create a variable to count the characters in a string
		int charCount = 0;
		//create a variable to list the char elemets
		String Characters = " ";

		int digitCount = 0;
		String Digits = " ";

		int specialCount = 0;
		String Special = " ";

		//Used for loop to iterate the String elements
		for (int i = 0; i < s.length(); i++) {
			//Used charAt method to return the string from the index 0
			char ch = s.charAt(i);
			//Here if the String s have a to z and A to Z values, count as charCount
			if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
				charCount++;
				Characters = Characters + ch + " ";
			//Here if the String s have 1 to 9 numbers, count as digitCount
			} else if (ch >= '1' && ch <= '9') {
				digitCount++;
				Digits = Digits + ch + " ";
			//Here if the String s have special characters, count as specialCount
			} else {
				specialCount++;
				Special = Special + ch + " ";
			}

		}
		System.out.println("CharactersCount: " + charCount + " Characters are: " + Characters);
		System.out.println("DigitCount: " + digitCount + " Digits are: " + Digits);
		System.out.println("SpecialCount: " + specialCount + " Special Characters: " + Special);
	}
}