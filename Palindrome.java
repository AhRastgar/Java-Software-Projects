import java.util.Scanner;

class Palindrome
{
	public static void main(String[] args)
	{
		System.out.println("This project is for parlindrome.");

		Scanner x = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int a = x.nextInt();
		int stash = a;
		int mod;
		int revers = 0;

		if (a == 0)
		{
			System.out.println("This number is not a palindrome.");
		}
		while (a != 0)
		{
			mod = a % 10;
			a /= 10;
			revers *= 10;
      revers += mod;
		}

			System.out.println(revers);


		if (stash == revers)
		{
			System.out.println("This is a palindrome.");
		}
		else
		{
			System.out.println("This is not a palindrome.");
		}
	}
}