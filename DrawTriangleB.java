import java.util.Scanner;

class DrawTriangleB
{
  public static void main(String[] args)
  {
    System.out.println("This project is for draw triangle b.");

    Scanner x = new Scanner(System.in);
    System.out.println("Enter your number: ");
    int a = x.nextInt();

    for (int i = 0; i <= a; i++)
    {
      for (int j = 0; j < i; j++)
      {
        System.out.print("* ");
      }
      System.out.println();
      for (int l = i; l <= a; l++)
      {
        System.out.print("  ");
      }
    }
  }
}