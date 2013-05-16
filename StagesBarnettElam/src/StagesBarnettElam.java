import java.util.Scanner;


public class StagesBarnettElam {

	public StagesBarnettElam(){
		// TODO Auto-generated constructor stub
	}
	/**
	 * Elam Barnett
	 * 5/15/13	
	 * Period 2
	 * Code Desc: Determines age group based on user inputed age.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = input.nextInt();
		if (age > 18) {
			System.out.println("Adult");
		
		} else {
			if (age >= 12 && age <= 18) {
				System.out.println("Teen");
		
		} else {
			if (age > 10 && age <= 12) {
				System.out.println("Preteen");
		
		} else {
			if (age > 5 && age <= 10) {
				System.out.println("Child");
		
		} else {
				System.out.println("Toddler");
		}
		input.close();
				}
			}
		}
	}
}
			