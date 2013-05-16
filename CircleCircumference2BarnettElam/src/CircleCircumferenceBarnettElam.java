import java.util.Scanner;


public class CircleCircumferenceBarnettElam {

	private static Scanner input;

	public CircleCircumferenceBarnettElam() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Elam Barnett
	 * May 9, 2013
	 * Period 2
	 * Code Desc: Calculates Circumference inputed by the user.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double rad = 0;
		double circ;
		
		input = new Scanner(System.in);
		System.out.println("Enter Radius: ");
		
		rad = input.nextDouble();
		if (rad < 0) {
			System.out.println("Negative radii are illegal.");
			
		} else {
			circ = rad * 3.14 * 2;
			System.out.println("Circumference: " + circ);
		}
		
		
	}

}