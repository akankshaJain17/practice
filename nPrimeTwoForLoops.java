// Prime Number Sample Java Program for practice

// Run Time complexity - O(n/2)

import java.util.*;

class Practice
{
	public static void main (String[] args)
	{
		int m = 10;
		boolean result = nPrimes(m);
		if (result)
		{
			System.out.println() // 
		}
	 
	}
	
	/*
	* /brief Prints prime numbers from 2 to m
	*
	* Runtime complexity of this program is:
	*/
	public static boolean nPrimes(int m)
	{
		for(int j=2;j<=m;j++)
		{
			for(int i = 2; i<=j-1; i++)
		{
			if ((j % i) == 0)
			{
				return false;
			}
		
		}
		return true;
							
		}
		
	}
	
}


