//this program has many different test algorithms
//this program was a mathematical brain teaser on face book to see if the user could guess the pattern
//I wrote the code to print out the pattern how ever many times selected. 

public class TestClass {

	public static void main(String[] args) {

		// calling the calc1() method
		// give this method an int parameter for how many times you want the
		// loop to execute
		int timesToExecute = 25;

		calc1(timesToExecute);

	}// end main

	public static void calc1(int timesToExecute) {
		int firstNum = 0;
		int increment = 2;
		int count = 1;
		int answer;
		int num1 = 1;
		int num2 = 2;
		int multiAns;
		int howManyTimes = timesToExecute;

		while (count <= howManyTimes) {

			// right column
			answer = firstNum + increment;

			// left column
			multiAns = num1 * num2;

			if (multiAns == answer) {

				// System.out.println(num1 +" = "+ multiAns);
				System.out.println(count + " = " + answer);

			} // end if
			else {
				System.out.println("There is a problem at line " + count);
			} // end else

			num1++;
			num2++;
			count++;
			increment = 2 + increment;
			firstNum = answer;

		} // end while

	}// end calc1()

}// end TestClass
