import java.util.Scanner;

class Operations
{
  public static void main(String[] args)
  {
    System.out.println("This project is for calculate the operations.");

    Scanner x = new Scanner(System.in);
    System.out.println("Enter a number for length of array: ");
    int a = x.nextInt();
    int[] b;
    b = new int[a];

    int sum = 0;
    float avg;
    float sub;
    float pow;
    float div;
    int var = 0;

    System.out.println("Enter your numbers: ");
    for (int i = 0; i < a; i++)
    {
      b[i] = x.nextInt();
      sum += b[i];
    }

    int min = b[0];
    int max = b[0];

    for (int j = 0; j < a; j++)
    {
      if (b[j] < min)
      {
        min = b[j];
      }
      if (b[j] > max)
      {
        max = b[j];
      }
    }

    avg = sum / a;

    for (int l = 0; l < a; l++)
    {
      sub = b[l] - avg;
      pow = sub * sub;
      div = pow / a;
      var += div;
    }

    System.out.println("Number of numbers: " + a);
    System.out.println("sum of the numbers: " + sum);
    System.out.println("Average of numbers: " + avg);
    System.out.println("minimum between numbers: " + min);
    System.out.println("maximum between numbers: " + max);
    System.out.println("varians: " + var);
  }
}