import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class arraylist {
	
	public static void main(String args[]){
	

	
	
	ArrayList<String> ar = new ArrayList();
	Scanner scan = new Scanner(System.in);
	
	int a;
	String b;
	String c;
	String d;
	String e;
	
	while(true){
		System.out.println("What do you want to do? (1 = list 2 = add)");
		a = scan.nextInt();
		b = scan.nextLine();
		switch(a){
		case 1:
			for(String i : ar){
			System.out.println(i);
				
			}	
			break;
		case 2:
			System.out.println("Add something: ");
			b = scan.nextLine();
			ar.add(b);
			break;
		}
	}
	
	
	}



}
