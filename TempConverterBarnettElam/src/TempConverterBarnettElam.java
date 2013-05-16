import java.util.Scanner;


public class TempConverterBarnettElam {


	

	private static Scanner input;

	/**
	 * Elam Barnett
	 * April 30, 2013
	 * Period 2
	 * Code Desc: Converts Farenheit to Celcius, inputed by the user.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		input = new Scanner(System.in);	
		double far;
		double cel;
		double converted;
		
		System.out.println("Enter Farenheit: ");
		far = input.nextDouble();
		
		cel = far - 32;
		converted = cel * 5/9;
		
		System.out.println("Celcius: " + converted);
		
		
		
		
	}

}
