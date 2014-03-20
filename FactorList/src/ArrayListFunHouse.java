//Name - Elam Barnett
//Date - 2/20/14
//Lab  - FunHouse

import java.util.ArrayList;

public class ArrayListFunHouse 
{
	public static ArrayList<Integer> getListOfFactors(int num)
	{
		ArrayList <Integer> ArrayListFunHouse = new ArrayList <Integer>();
						
		for (int a = 1; a < num; a++)
		{
			if (num % a == 0)
			{
				ArrayListFunHouse.add(a);
			}
		}
		return ArrayListFunHouse;
	}
}
