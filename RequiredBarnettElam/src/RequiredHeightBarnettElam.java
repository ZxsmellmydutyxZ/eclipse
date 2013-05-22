import java.util.Scanner;


public class RequiredHeightBarnettElam {

	private static Object input;

	public RequiredHeightBarnettElam() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		input = new Scanner(System.in);

			double height;

	System.out.println ("Enter height of child: ");
		height = ((Scanner) input).nextDouble();
			if (height > 56) {
				System.out.println ("Child is tall enough to ride roller coaster. ");
			}else {
				if (height <= 56) {
					System.out.println ("Child is not tall enough to ride roller coaster. ");
				}
			}
		}
	}