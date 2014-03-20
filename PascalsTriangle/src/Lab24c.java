import java.util.Scanner;
public class Lab24c {
	private static Scanner scan;
	private static PascalsTriangle tri;

	/**
	 * Elam Barnett
	 * 3/10/14
	 */
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter the size of the triangle: ");
		int x = scan.nextInt();
		tri = new PascalsTriangle(x);
		

	}

}
