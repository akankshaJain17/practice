// Prime Number Sample Java Program for practice

// Run Time complexity - O(n/2)

import java.util.*;

class Practice
{
	public static void main (String[] args)
	{
		int m = 10
		nPrime(m);
	 
	}
	
	/*
	Run time complexity: O(n)
	*/
	public static boolean isPrime(int n)
	{
		for(int i = 2; i<=n-1; i++)
		{
			if ((n % i) == 0)
			{
				return false;
			}
		
		}
		return true;
	}

	/*
	* /brief Prints prime numbers from 2 to m
	*
	* Runtime complexity of this program is:
	*/
	public static void nPrimes(int m)
	{
		for(int j=2;j<=m;j++)
		{
			boolean nPrimes = isPrime(j);
			if(nPrimes)
			{
				System.out.println(j);
			}
		}
		
	}
	
	
}


