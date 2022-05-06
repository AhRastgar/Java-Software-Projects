import java.util.Scanner;

class DivisionWithSub
{
  public static void main(String[] args)
  {
    System.out.println("This project is for division with submition.");

    Scanner x = new Scanner(System.in);
    System.out.println("Enter your first number ");
    int a = x.nextInt();

    System.out.println("Enter your second number ");
    int b = x.nextInt();

    int div = 0;
    int mod = a;

    for (int i = 0; ; i++)
    {
      if (mod >= b)
      {
        div++;
        mod -= b;
      }
      else
      {
        break;
      }
    }
    System.out.println("division: " + div);
  }
}