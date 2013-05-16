
	import java.util.Scanner;


	public class DigitsBarnettElam {
		
	

	private static Scanner input;

	/**
	 * Elam Barnett
	 * April 23, 2013
	 * Period 2
	 * Code Desc: Displays ones and tens of a user inputed number.
	 */
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		int num, ones, tens, hundreds;
		
		
		System.out.println ("Enter 3 digit number: ");
		num = input.nextInt();
		hundreds = num/100;
		tens = (num  - hundreds*100)/10;
		ones = (num - hundreds*100 - tens*10);
		System.out.println ("The hundreds place is: " + hundreds);
		System.out.println ("The tens place is: " + tens);
		System.out.println ("the ones place is: " + ones);
		
		

	}

}
