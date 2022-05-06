import java.util.Scanner;

class ProductWithSum
{
  public static void main(String[] args)
  {
    System.out.println("This project is for product number with sum.");

    Scanner x = new Scanner(System.in);
    System.out.println("Enter your first number ");
    int a = x.nextInt();

    System.out.println("Enter your second number ");
    int b = x.nextInt();

    int sum = 0;
    for (int i = 1; i <= b; i++)
    {
      sum += a;
    }
    System.out.println("Product: " + sum);
  }
}