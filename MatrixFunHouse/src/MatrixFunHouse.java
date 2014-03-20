public class MatrixFunHouse
{
	private int[][] mat;

	public MatrixFunHouse()
	{
		mat = new int [10] [10];
		for (int row = 0; row < mat.length; row++)
		{
			for(int col = 0; col < mat[0].length; col++)
			{
				mat [row][col] = 0;
			}
		}
	}

	public MatrixFunHouse(int numRows, int numCols)
	{
		mat = new int [numRows][numCols];
		for (int row = 0; row < mat.length; row++)
		{
			for(int col = 0; col < mat[0].length; col++)
			{
				mat [row][col] = 0;
			}
		}
	}
	
   public void setSize(int numRows, int numCols)
   {
	   
   }	

	public void setSpot(int row, int col, int val)
	{
		if (mat [row][col] == 0)
		{
			mat [row][col] = val;
		}
	}
	
   public int getRowTotal(int row)
   {
   	int total=0;
   	for (int col = 0; col < 10; col++)
   	{
   		if (mat [row][col] != 0)
   		{
   			total = total + mat[row][col];
   		}
   	}
		return total;
   }

	public int getTotal()
	{
		int total=0;
		for (int row = 0; row < 10; row++)
		{
			for (int col = 0; col < 10; col++)
			{
				if (mat[row][col] != 0)
				{
					total = total + mat[row][col];
				}
			}
		}
		return total;
	}

	public String toString()
	{
		String output="";
		for(int r=0; r<mat.length; r++)
		{
			for(int c=0; c<mat[r].length; c++)
			{
				output+=" "+mat[r][c];
			}
			output+="\n";
		}
		return output;
	}
}