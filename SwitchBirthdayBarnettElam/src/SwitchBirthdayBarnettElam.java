import java.util.Scanner;
public class SwitchBirthdayBarnettElam {

	private static Scanner input;

	public SwitchBirthdayBarnettElam() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int month;
		
	String monthString;
	input = new Scanner(System.in);
	
	System.out.println("Enter the numerical equivelant for the month you were born: ");
		month = input.nextInt();
	
	switch(month){
	
	case 1: monthString = "January"; break;
	case 2: monthString = "Febuary"; break;
	case 3: monthString = "March"; break;
	case 4: monthString = "April"; break;
	case 5: monthString = "May"; break;
	case 6: monthString = "June"; break;
	case 7: monthString = "July"; break;
	case 8: monthString = "August"; break;
	case 9: monthString = "September"; break;
	case 10: monthString = "October"; break;
	case 11: monthString = "November"; break;
	case 12: monthString = "December"; break;
	
	default: monthString = "Invalid Month"; break;
	}
	
	if (monthString != "Invalid Month"){
		System.out.println("You were born in: " + monthString);
	}else{
		System.out.println(monthString);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}