import java.util.Scanner;
public class Lab24c {
	private static Scanner scan;
	/**
	 * Elam Barnett
	 * 3/10/14
	 */
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter the size of the triangle: ");
		int x = scan.nextInt();
		new PascalsTriangle(x);
		

	}

}
