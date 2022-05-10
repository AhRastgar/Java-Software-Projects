import java.util.Scanner;

class MinMax3
{
  public static void main(String[] args)
  {
    System.out.println("This project is for search 3 Minimum & 3 Maximum.");

    Scanner x = new Scanner(System.in);
    System.out.println("Enter a number for length of array: ");
    int a = x.nextInt();
    
    int[] b;
    b = new int[a];

    int sum = 0;

    System.out.println("Enter your numbers: ");
    for (int i = 0; i < a; i++)
    {
      b[i] = x.nextInt();
      sum += b[i];
    }
    int fMax, sMax, tMax;
    int fMin = Integer.MAX_VALUE;
    int sMin = Integer.MAX_VALUE;
    int tMin = Integer.MAX_VALUE;

    if (b.length < 3)
    {
      System.out.println("The numbers entered are not enough.");
    }

    tMax = fMax = sMax = 0;

    for (int j = 0; j < b.length; j++)
    {
      if (b[j] > fMax)
      {
        tMax = sMax;
        sMax = fMax;
        fMax = b[j];
      }
      else if (b[j] > sMax)
      {
        tMax = sMax;
        sMax = b[j];
      }
      else if (b[j] > tMax)
      {
        tMax = b[j];
      }

      if (b[j] < fMin)
      {
        tMin = sMin;
        sMin = fMin;
        fMin = b[j];
      }
      else if (b[j] < sMin)
      {
        tMin = sMin;
        sMin = b[j];
      }
      else if (b[j] < tMin)
      {
        tMin = b[j];
      }
    }

    System.out.println("3 Minimum: \n" + fMin + ',' + sMin + ',' + tMin);
    System.out.println("3 Minimum: \n" + fMax + ',' + sMax + ',' + tMax);
  }
}