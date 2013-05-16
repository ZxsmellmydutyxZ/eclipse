
import java.util.Scanner;


public class GradeAvgBarnettElam {

	/**
	 * Elam Barnett
	 * April 30, 2013
	 * Period 2
	 * Code Desc: Calculates Grade Averages inputed by the user.
	 */
	
	public static void main(String[] args) {
		
		int g1, g2, g3, g4, g5;
		double gradeavg;
		double avg;
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Enter first grade: ");
		g1 = input1.nextInt();
		System.out.println("Enter second grade: ");
		g2 = input1.nextInt();
		System.out.println("Enter third grade: ");
		g3 = input1.nextInt();
		System.out.println("Enter fourth grade: ");
		g4 = input1.nextInt();
		System.out.println("Enter fifth grade: ");
		g5 = input1.nextInt();
		input1.close();
		avg = g1 + g2 + g3 + g4 + g5;
		gradeavg = (avg/5);
		System.out.println("Grade Average: " + gradeavg);
		
		
	}

}
