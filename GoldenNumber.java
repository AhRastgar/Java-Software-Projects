import java.util.Scanner;

class GoldenNumber
{
  public static void main(String[] args)
  {
    System.out.println("This project is for check golden number.");

    Scanner x = new Scanner(System.in);
    System.out.println("Enter your number ");
    int a = x.nextInt();

    System.out.println("If your number is length: " + a / 1.618);
    System.out.println("If your number is width: " + a * 1.618);
  }
}