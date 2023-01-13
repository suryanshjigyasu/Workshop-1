package bridgelabz;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		int rem, n, rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextInt();
		while (n > 0)
		{
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}	
		System.out.println(rev);	
	}
}
