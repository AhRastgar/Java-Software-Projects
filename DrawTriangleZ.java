import java.util.Scanner;

class DrawTriangleZ
{
  public static void main(String[] args)
  {
    System.out.println("This project is for draw triangle z.");

    Scanner x = new Scanner(System.in);
    System.out.println("Enter your number: ");
    int a = x.nextInt();

    for (int i = a; i > 0; i--)
    {
      for (int j = 0; j < i; j++)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}