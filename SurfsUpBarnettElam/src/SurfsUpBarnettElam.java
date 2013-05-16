import java.util.Scanner;


public class SurfsUpBarnettElam {

	private static Scanner input;

	public SurfsUpBarnettElam() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Elam Barnett
	 * 5/15/13
	 * Period 3
	 * Code Desc: Tells the user if they should go surfing based on their inputed height of the waves.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		input = new Scanner(System.in);
		System.out.println("Enter Height of Waves: ");
		int wave = input.nextInt();
		if (wave >= 6) {
			System.out.println("Great day for surfing!");
		}
		
		
		
	}

}
