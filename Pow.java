import java.util.Scanner;

class pow
{
  public static void main(String[] args)
  {
    System.out.println("This project is for powered number.");

    Scanner x = new Scanner(System.in);
    System.out.println("Enter your number ");
    int a = x.nextInt();

    System.out.println("Power 1: " + a);
    System.out.println("Power 2: " + a * a);
    System.out.println("Power 3: " + a * a * a);
  }
}