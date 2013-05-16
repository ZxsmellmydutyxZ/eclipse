import java.util.Scanner;


public class SurfsUp2BarnettElam {

	private static Scanner input;

	public SurfsUp2BarnettElam() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Elam Barnett
	 * 5/15/13
	 * Period 2
	 * Code Desc: Tells the user if they should go surfing, and gives them other options based on their inputed height of the waves.
	 */
	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Enter Height of Waves: ");
		int wave = input.nextInt();
		if (wave >= 6) {
			System.out.println("Great day for surfing!");
		} else {
			System.out.println("Go body boarding!");
		}

	}

}
