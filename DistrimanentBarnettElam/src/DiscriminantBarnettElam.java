import java.util.Scanner;


public class DiscriminantBarnettElam {

	private static Scanner input;

	public DiscriminantBarnettElam() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Elam Barnett
	 * 5/15/13
	 * Period 2
	 * Code Desc: 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		input = new Scanner(System.in);
		
		double a;
		double b;
		double c;

		System.out.println("Enter the value for A: ");
			a = input.nextDouble();
		System.out.println("Enter the value for B: ");
			b = input.nextDouble();
		System.out.println("Enter the value for C: ");
			c = input.nextDouble();
		
		if (b*b - 4*a*c < 0){
			System.out.println("No Roots");	
		} else {
			if (b*b - 4*a*c == 0){
				System.out.println("One Root");
			} else {
				if (b*b - 4*a*c > 0){
					System.out.println("Two Roots");
				}
			}
		}
	}
}
