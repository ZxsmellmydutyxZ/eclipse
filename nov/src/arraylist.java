import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class arraylist {
	
	public static void main(String args[]){
	

	
	
	ArrayList<String> ar = new ArrayList();
	Scanner scan = new Scanner(System.in);
	
	String a;
	String b;
	String c;
	String d;
	String e;
	
	System.out.println("Enter 5 favorite board companies:");
	a = scan.nextLine();
	ar.add(a);
	b = scan.nextLine();
	ar.add(b);
	c = scan.nextLine();
	ar.add(c);
	d = scan.nextLine();
	ar.add(d);
	e = scan.nextLine();
	ar.add(e);
	
	
	Random randy = new Random();

	System.out.println(ar.get(randy.nextInt(ar.size())));
	
	
	}



}
