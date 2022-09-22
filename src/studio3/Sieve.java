package studio3;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//find prime number s1-40
		
		int [] num = new int[40];
		int [] prime = new int [40];
		int x = 0;
		boolean alreadyUsed = false;
		boolean primeNum = false;
		for (int i = 1; i <=40; i++)
		{
			num[i-1] = i;
		}
		for (int i=1; i <=40; i++)
		{
			for (int p = 2; p<i; p++)
			{
				if (i % p == 0)
				{
					primeNum = false;
				}
			}
			if (primeNum)
			{
				prime[x] = i;
				x++;
			}
			primeNum = true;
		}
		for (int i =0; i < x; i++)
		{
			System.out.println(prime[i]);
		}
		
				
		}
		
	}


