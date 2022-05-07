import java.util.Scanner;

class Pi
{
  public static void main(String[] args)
  {
    System.out.println("This project is for pi number.");

    Scanner x = new Scanner(System.in);
    System.out.println("Enter your number: ");
    int a = x.nextInt();

    float p = 3.14f;
    float pi = 2 * p * a;

    System.out.println("Pi: " + pi / 5);
  }
}