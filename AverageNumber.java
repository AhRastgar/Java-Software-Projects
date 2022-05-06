import java.util.Scanner;

class AverageNumber
{
  public static void main(String[] args)
  {
    System.out.println("This project is for average between number.");

    Scanner x = new Scanner(System.in);
    System.out.println("Enter 5 numbers ");
    int a[];
    a = new int[5];

    float stash = 0;
    float avg = 0;

    for (int i = 0; i < 5; i++)
    {
      a[i] = x.nextInt();
      stash += a[i];
    }

    avg = stash / 5;
    System.out.println("Average: " + avg);
  }
}