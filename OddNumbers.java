import java.util.Scanner;

class OddNumbers
{
  public static void main(String[] args)
  {
    System.out.println("This project is for product odd number between your numbers.");

    Scanner x = new Scanner(System.in);
    System.out.println("Enter your first number ");
    int a = x.nextInt();

    System.out.println("Enter your second number ");
    int b = x.nextInt();

    int sum1 = 1;
    int sum2 = 1;

    if (a > b)
    {
      for (int i = b; i < a; i++)
      {
        if (i % 2 == 1)
        {
          sum1 *= i;
        }
      }
      System.out.println(sum1);
    }

    if (a < b)
    {
      for (int j = a; j < b; j++)
      {
        if (j % 2 == 1)
        {
          sum2 *= j;
        }
      }
      System.out.println(sum2);
    }
  }
}