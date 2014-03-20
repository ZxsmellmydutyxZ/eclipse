/* The prizes available on this board are puzzle, game, ball, poster, and doll. At the end of the game, if all
of the squares that say BALL are covered by a penny, the player gets the ball. This is also true for the
other prizes. The board is made up of 25 squares (5 x 5). Each prize appears on three randomly chosen
squares so that 15 squares contain prizes. */


import java.lang.Math;
import java.util.ArrayList;

/**
 * Elam Barnett
 * Pd 3
 * March 3 2014 
 * Whitebook Exercise
 */

public class PennyPitch 
{
	private String [] [] Board;	

	private String p1,p2,p3,p4,p5;

	public PennyPitch()
	{

	Board= new String [5][5];	
	for (int row=0;row<Board.length; row ++)
	{
		for(int col=0; col<Board[0].length; col++)
		{
			Board[row][col]="      ";
		}
	}
		
	p1=" Ball ";
	p2=" Game ";
	p3=" Doll ";
	p4="Poster";
	p5="Puzzle";
	}
	


	void DisplayBoard(){
		
		for (int row=0; row<Board.length; row ++){
			for(int col=0; col<Board[0].length; col++){
				System.out.print("["+Board[row][col]+"]");
			}
			System.out.println();
		}
	}
	
	
	

	void placePrizeB()
	{
	
		int row, col;		
		int counter =0;
	do
	{				

		row= (int)(5*Math.random());
		col=(int)(5*Math.random());
				

		if ( Board[row][col].equals("      ") && (Board[row][col] != (p2)) && (Board[row][col] != (p3)) && (Board[row][col] != (p4)) && (Board[row][col] != (p5)))
		{				
			Board[row][col] = p1;
			counter++;			
		}
	} while(counter<3);
				
}

	void placePrizeG()
	{			
		int row, col;		
		int counter= 0;
	do
	{
		row= (int)(5*Math.random());
		col=(int)(5*Math.random());
				

		if ((row>=0 && row<Board.length && col>=0 && col<Board[0].length) && Board[row][col].equals("      ") && (Board[row][col] != (p1)) && (Board[row][col] != (p3)) && (Board[row][col] != (p4)) && (Board[row][col] != (p5)))
		{				
			Board[row][col] = p2;
			counter++;			
		}
	} while(counter<3);
				
}
	void placePrizeD(){
					
	int row, col;		
	int counter= 0;
	do
	{				
		row= (int)(5*Math.random());
		col=(int)(5*Math.random());
						

		if ((row>=0 && row<Board.length && col>=0 && col<Board[0].length) && Board[row][col].equals("      ") && (Board[row][col] != (p2)) && (Board[row][col] != (p1)) && (Board[row][col] != (p4)) && (Board[row][col] != (p5)))
		{
						
			Board[row][col] = p3;
			counter++;			
				}
	} while(counter<3);						
}	

	void placePrizeP(){
					
		int row, col;		
		int counter= 0;
		do{
						

			row= (int)(5*Math.random());
			col=(int)(5*Math.random());
					

		if ((row>=0 && row<Board.length && col>=0 && col<Board[0].length) && Board[row][col].equals("      ") && (Board[row][col] != (p1)) && (Board[row][col] != (p3)) && (Board[row][col] != (p2)) && (Board[row][col] != (p5)))
		{
						
				Board[row][col] = p4;
				counter++;			
			}
		} while(counter<3);
						
			}		

	void placePrizeP2()
	{
					
		int row, col;		
		int counter= 0;
		do
		{
				row= (int)(5*Math.random());
				col=(int)(5*Math.random());
						

				if ((row>=0 && row<Board.length && col>=0 && col<Board[0].length) && Board[row][col].equals("      ") && (Board[row][col] != (p1)) && (Board[row][col] != (p2)) && (Board[row][col] != (p3)) && (Board[row][col] != (p4))){
						
					Board[row][col] = p5;
					counter++;			
				}
			} while(counter<3);
						
	}
		public ArrayList<String> getListOfPrizes(){
			int row, col;

			ArrayList<String> list= new ArrayList<String>();
			int ball=0;
			int doll=0;
			int game=0;
			int poster=0;
			int puzzle=0;
			
			for(int toss=0; toss<10; toss++){
				
				row= (int)(5*Math.random());
				col=(int)(5*Math.random());
				
				
				
			if (Board[row][col] == p1){
				ball++;
				Board[row][col]="Penny ";				
			}else if(Board[row][col] == p2){
				game++;
				Board[row][col] ="Penny ";				
			}else if(Board[row][col] == p3){
				doll++;
				Board[row][col] ="Penny ";		
			}else if(Board[row][col] == p4){
				puzzle++;
				Board[row][col] ="Penny ";		
			}else if (Board[row][col] == p5){
				poster++;
				Board[row][col] ="Penny ";	
			}	else	{
				Board[row][col] ="Penny ";	
			}
			
				
		}
			
			
		
		if(ball==3){
			list.add(p1);
		} 
		if (game==3){
			list.add(p2);
		}
		if (doll==3){
			list.add(p3);
		}
		if (puzzle==3){
			list.add(p4);
		}
		if (poster==3){
			list.add(p5);
		}
			
					
			
			return (list);
		
			}	
			
}
		