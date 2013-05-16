

import java.util.Scanner;


public class Distance2BarnettElam {



	/**
	 * Elam Barnett
	 * April 17th 2013
	 * Period 2
	 * Code Description: Calculate distance. And prompt user to input the values.
	 */
	
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double total;
		Scanner input = new Scanner(System.in);
		
		
		
	System.out.println("Enter first distance: ");	
		a = input.nextDouble();
	System.out.println("Enter second distance: ");
		b = input.nextDouble();
	System.out.println("Enter third distance: ");	
		c = input.nextDouble();
	input.close();
		total = a + b + c;
	System.out.println("Total Distance of Race: " + total + "km");
	
	
	}

}
