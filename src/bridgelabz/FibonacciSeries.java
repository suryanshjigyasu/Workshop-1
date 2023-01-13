package bridgelabz;

import java.util.Scanner;

public class FibonacciSeries 
{
	public static void main(String[]args)
	{
		int num, a = 0, b = 0, c = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value :");
		num=sc.nextInt();
		for(int i = 1; i<=num; i++)
		{
			a = b;
			b = c;
			c = a+b;
			System.out.println(a+" ");
		}
		
				
			
	}

}
