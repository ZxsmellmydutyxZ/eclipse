import java.util.Scanner;


public class DeliveryBarnettElam {

	private static Scanner input;

	public DeliveryBarnettElam() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		input = new Scanner(System.in);
	
		double l;
		double w;
		double h;
		
	
	System.out.println("Enter Length: ");
	l = input.nextDouble();
	System.out.println("Enter Width: ");
	w = input.nextDouble();
	System.out.println("Enter Height: ");
	h = input.nextDouble();
	
	if (h > 10 || l > 10 || w > 10){
		System.out.println("Reject");
	} else if (l <= 10 || w <= 10 || h <= 10){
		System.out.println("Accept");
	}
		
	}

}
