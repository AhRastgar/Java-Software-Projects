import java.util.Scanner;

class CharBetNum
{
  public static void main(String[] args)
  {
    System.out.println("This project is for set characters between numbers.");

    Scanner x = new Scanner(System.in);
    System.out.println("Enter your number: ");
    int a = x.nextInt();

    System.out.println("Enter your character: ");
    char b = x.next().charAt(0);

    int stash = a;
    int mod;
    int rev = 0;

    for (int i = a; 0 < a; i++)
    {
      mod = a % 10;
      rev = rev * 10 + mod;
      a /= 10;
    }
    for (int j = rev; 0 < rev; j++)
    {
      mod = rev % 10;
      rev /= 10;

      System.out.print(rev);
      System.out.print(b);
    }
  }
}