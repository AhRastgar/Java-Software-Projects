import java.util.Scanner;

class  CompleteNumber
{
  public static void main(String[] args)
  {
    System.out.println("This project is for check complete number.");

    Scanner x = new Scanner(System.in);
    System.out.println("Enter your number: ");
    int a = x.nextInt();
    
    int sum = 1;

    for (int i = 0; i < a; i++)
    {
      if (a % i == 0)
      {
        sum += i;
      }
    }
    if (sum == a)
    {
      System.out.println("this number is Complete.");
    }
    else 
    {
      System.out.println("this number is not Complete.");
    }
  }
}