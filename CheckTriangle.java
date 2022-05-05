import java.util.Scanner;

class CheckTriangle
{
  public static void main(String[] args)
  {
    System.out.println("This project is for check triangle.");

    Scanner x = new Scanner(System.in);
    System.out.println("Enter your chord ");
    int chord = x.nextInt();

    System.out.println("Enter 2 side of triangle ");
    int side1 = x.nextInt();
    int side2 = x.nextInt();

    if (chord < side1 + side2)
    {
      System.out.println("This is a triangle.");
    }
    else
    {
      System.out.println("This is not a triangle.");
    }
  }
}