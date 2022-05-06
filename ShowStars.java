import java.util.Scanner;

class ShowStars
{
  public static void main(String[] args)
  {
    System.out.println("This project is for show stars.");

    Scanner x = new Scanner(System.in);
    System.out.println("Enter your number ");
    int a = x.nextInt();

    for (int i = 0; i < a; i++)
    {
      System.out.print("* ");
    }
  }
}