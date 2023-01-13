package bridgelabz;



public class PrimeNum 
{
	public static void main(String[]args)
	{
		int min = 2;
		int max = 15;
		for(int i= min; i <= max; i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}		
	}
	public static boolean isPrime(int num)
	{
		for(int n = 2; n <= num/n; n++)
		{
			if(num % n == 0)
			{
				return false;
			}
		}
		return true;
		
	}

}
