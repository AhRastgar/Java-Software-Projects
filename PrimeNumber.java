import java.util.Scanner;

class PrimeNumber
{
  public static void main(String[] args)
  {
    System.out.println("this project is for check your number for prime nubmer.");

    Scanner x = new Scanner(System.in);
    System.out.println("Enter your number: ");
    int a = x.nextInt();
    int b = 0;

    for (int i = 2; i < a; i++)
    {
      if (a % i == 0)
      {
        b = 1;
      }
    }

    if (b == 0)
    {
      System.out.println("Yes, This is a prime number.");
    }
    else
    {
      System.out.println("No, This is not a prime number.");
    }
  }
}