import java.util.Scanner;

public class GradeAvg2BarnettElam {

	public GradeAvg2BarnettElam() {
	}

	/**
	 * Elam Barnett
	 * Period 2
	 * April 30, 2013
	 * Code Desc: Calculate Grade Averages using Assignment Operators.
	 * 
	 */
	public static void main(String[] args) {
		
		int g1, g2, g3, g4, g5;
		double avg = 0;
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Enter first grade: ");
		g1 = input1.nextInt();
		avg += g1;
		System.out.println("Total: " + avg);
		System.out.println("Enter second grade: ");
		g2 = input1.nextInt();
		avg += g2;
		System.out.println("Total: " + avg);
		System.out.println("Enter third grade: ");
		g3 = input1.nextInt();
		avg += g3;
		System.out.println("Total: " + avg);
		System.out.println("Enter fourth grade: ");
		g4 = input1.nextInt();
		avg += g4;
		System.out.println("Total: " + avg);
		System.out.println("Enter fifth grade: ");
		g5 = input1.nextInt();
		avg += g5;
		System.out.println("Total: " + avg);
		
		input1.close();
		avg /= 5;
		System.out.println("Grade Average: " + avg + "%");
		

	}

}
