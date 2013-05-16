import java.util.Scanner;


public class SurfsUp3BarnettElam {

	private static Scanner input;

	public SurfsUp3BarnettElam() {
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
		} else if (wave > 3 && wave < 6){
			System.out.println("Go body boarding!");
		} else if (wave > 0 && wave < 3){
			System.out.println("Go for a swim.");
		} else {
			System.out.println("Whoa! What kind of surf is that?");		}

	}

}
