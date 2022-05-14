import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class SortNumbers
{
  public static void main(String[] args)
  {
    System.out.println("This project is for sorted user numbers.");

    Scanner x = new Scanner(System.in);
    System.out.println("Enter a number for length of array: ");
    int a = x.nextInt();

    Integer[] arr = new Integer[a];

    for (int i = 0; i < a; i++)
    {
      arr[i] = x.nextInt();
    }

    System.out.println("sort array Ascending :");
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    System.out.println("sort array Ascending :");
    Arrays.sort(arr, Collections.reverseOrder());
    System.out.println(Arrays.toString(arr));

  }
}