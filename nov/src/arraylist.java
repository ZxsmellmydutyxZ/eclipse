import java.io.BufferedWriter;
import java.io.File;
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
	String name;
	
	
	
	while(true){
		System.out.println("What do you want to do? (1 = list 2 = add 3 = save 4 = load 5 = clear)");
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
			System.out.println("Enter the file name: ");
			name = scan.nextLine();
			
			FileWriter outFile = new FileWriter(name);  
		    BufferedWriter outStream = new BufferedWriter(outFile);  
		    for (int k = 0; k < ar.size(); k++)  
		        outStream.write(ar.get(k)+ "\r\n");     
		    outStream.close();  
		    System.out.println("Data saved.");  
		    break;
		
		case 4:
			
			System.out.println("Enter the file name: ");
			name = scan.nextLine();
			
			Scanner inFile1 = new Scanner(new File(name));
			
			while (inFile1.hasNext()) {
			     
			      String token1 = inFile1.next();
			      ar.add(token1);
			    }
			    inFile1.close();

			    String[] tempsArray = ar.toArray(new String[0]);

			    for (String s : tempsArray) {
			      System.out.println(s);
			    }
			      break;
			      
			    
			    
			    case 5: 
			    	  
			    	ar.clear();
			    
			    }

		
		
		}
		
		
		
	}
	
	
	}



