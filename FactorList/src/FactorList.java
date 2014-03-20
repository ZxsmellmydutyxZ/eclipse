//Name - Elam Barnett
//Date - 2/20/14
//Lab  - Lab16a

import java.util.Scanner;

public class FactorList
{
	private static Scanner scan;

	public static void main( String args[] )
	{
		int num;
		scan = new Scanner(System.in);		
		
		System.out.println("Enter a number: ");
		num = scan.nextInt();
		
		System.out.println(ArrayListFunHouse.getListOfFactors(num));
		
	}
}
