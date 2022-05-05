import java.lang.Math;
import java.util.Scanner;

class XpowY
{
  public static void main(String[] args)
  {
    System.out.println("This project is for x powered y.");

    Scanner x = new Scanner(System.in);
    System.out.println("Enter your first number ");
    int a = x.nextInt();

    System.out.println("Enter your second number ");
    int b = x.nextInt();

    System.out.println("x powered y: " + Math.pow(a, b));
  }
}