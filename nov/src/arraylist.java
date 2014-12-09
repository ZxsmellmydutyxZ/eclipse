import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
	
	public static void main(String args[]) throws IOException{
	

	
	
	ArrayList<String> ar = new ArrayList();
	Scanner scan = new Scanner(System.in);
	
	int a;
	String b;
	String c;
	String d;
	String e;
	
	
	
	while(true){
		System.out.println("What do you want to do? (1 = list 2 = add 3 = save)");
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
			
		case 3:
			FileWriter outFile = new FileWriter("/users/DuTy/Data.txt");  
		    BufferedWriter outStream = new BufferedWriter(outFile);  
		    for (int k = 0; k < ar.size(); k++)  
		        outStream.write(ar.get(k)+ "\r\n");     
		    outStream.close();  
		    System.out.println("Data saved.");  
		}
		
		
	}
	
	
	}



}
