import java.util.Scanner;


public class ExamGraduationBarnettElam {

	private static Scanner input;

	public ExamGraduationBarnettElam() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		input = new Scanner(System.in);
		
		double gpa;
		
		System.out.println("Enter your GPA: ");
		gpa = input.nextDouble();
		
		if (gpa >= 3.5 && gpa < 3.65){
			System.out.println("Distinction cum laude");
		} else {
			if (gpa >= 3.65 && gpa < 3.8){
			System.out.println("Magna cum laude");
		} else { 
			if (gpa >= 3.8){
			System.out.println("Summa cum laude");
		} else {
			if (gpa < 3.5){
			System.out.println("You did not qualify for an honors distinction.");
		}
			
		}
	    }
	}	
}



}
