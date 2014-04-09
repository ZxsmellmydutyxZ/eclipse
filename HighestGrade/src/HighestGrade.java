//Name - Elam Barnett
//Date - 2/19/14
//Lab  - HighestGrade

import java.util.ArrayList;
import java.util.Scanner;


public class HighestGrade {

	
	private static Scanner scan;

	public static void main(String[] args) {
		
		ArrayList<Integer> grade = new ArrayList<Integer>();
		scan = new Scanner(System.in);
		
		int g = 0;
		int high = 0;
		
		for(int a = 1; a <= 5; a++){
			System.out.println("Enter a grade percentage: ");
			g = scan.nextInt();
			grade.add(g);
		}
		System.out.println(grade);
			
			for(Integer i : grade)
			{
				if (i > high)
				{
					high = i;
				}
			}
			System.out.println("The highest score out of the scores you entered is: " + high);
		}
				
	}
		
		
		
	


