import java.util.Scanner;

public class Radius
{
  public static void main(String[] args)
  {
    System.out.println("This program if for radius of the circle.");

    System.out.println("Enter your radius number ");
    Scanner x = new Scanner(System.in);
    float radius = x.nextFloat();
    float pi = 3.14f;

    float env = 2 * pi * radius;
    float diameter = 2 * radius;
    float area = pi * radius * radius;

    System.out.println("Enviroment: " + env);
    System.out.println("Diameter: " + diameter);
    System.out.print("Area: " + area);
  }
}