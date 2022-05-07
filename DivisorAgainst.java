import java.util.Scanner;

class DivisorAgainst
{
  public static void main(String[] args)
  {
    System.out.println("This project is for show divisor againsts.");

    Scanner x = new Scanner(System.in);
    System.out.println("Enter your number: ");
    int a = x.nextInt();

    System.out.println("Divisor againsts are: ");
    for (int i = 1; i <= a; i++)
    {
      if (a % i == 0)
      {
        System.out.println(i);
      }
    }
  }
}