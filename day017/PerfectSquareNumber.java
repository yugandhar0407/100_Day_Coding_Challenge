/*
 * Write a Program to check given number is a perfect square or not?
 * 
 * Perfect Square: Perfect Square Number means when we multiply two same numbers together, 
 * then the product that we get is called the perfect square.
 * 
 * Ex: 4 = 2*2
 *     9 = 3*3
 *     25 = 5*5
 *     625 = 25*25 etc...
 *     
 */

package day017;

public class PerfectSquareNumber {

	public static void main(String[] args) {

		int perfectSquare = 625;
		int count = 0;

		for (int i = 0; i <= perfectSquare; i++) {
			if (i * i == perfectSquare) {
				count++;
			}
		}

		if (count == 1) {
			System.out.println(perfectSquare + " is a Perfect Square Number");
		} else {
			System.out.println(perfectSquare + " is not a Perfect Square Number");
		}
	}

}
