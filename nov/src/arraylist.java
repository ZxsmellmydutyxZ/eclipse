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
	
	
	
	while(true){
		System.out.println("What do you want to do? (1 = list 2 = add 3 = save 4 = load)");
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
			FileWriter outFile = new FileWriter("E:/Users/DuTy/poop.txt");  
		    BufferedWriter outStream = new BufferedWriter(outFile);  
		    for (int k = 0; k < ar.size(); k++)  
		        outStream.write(ar.get(k)+ "\r\n");     
		    outStream.close();  
		    System.out.println("Data saved.");  
		    break;
		
		case 4:
			String name;
			System.out.println("Enter the file name (exclude .txt)");
			name = scan.nextLine();
			
			Scanner inFile1 = new Scanner(new File("E:/Users/DuTy/" + name + ".txt"));
			
			while (inFile1.hasNext()) {
			      // find next line
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
			    	  
			    
			    }

		
		
		}
		
		
		
	}
	
	
	}



