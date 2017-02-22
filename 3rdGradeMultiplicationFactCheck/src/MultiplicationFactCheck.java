/**
 * this program was written to help my kids with their math homework
 * it allows them to check the answers to their multiplication facts.
 */

/**
 * @author tpaulson
 *
 */
import java.util.*;

public class MultiplicationFactCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter a number 1-12 to see the multiplication facts:  ");
		int n = in.nextInt();

		if (n >= 1 && n <= 12) {
			do { // prints multiplication facts for n, 0 thru 12
				for (int i = 0; i <= 12; i++) {
					int result = n * i;
					System.out.println(n + " x " + i + " = " + result);
				}
				System.out.println("Enter the next number:  ");
				n = in.nextInt();
			} while (n <= 12);
		}
		System.out.println("\nYou have entered an invalid number. ***GOODBYE***");

	}// end main

}// end class
