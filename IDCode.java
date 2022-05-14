import java.util.Scanner;

public class IDCode {
    private static boolean validationNationalCode(String code){
        
        if (code.length() != 10)
        {
          return false;
        }

        long nationalCode = Long.parseLong(code);
        byte[] arrayNationalCode = new byte[10];

        
        for (int i = 0; i < 10 ; i++)
        {
            arrayNationalCode[i] = (byte) (nationalCode % 10);
            nationalCode = nationalCode / 10;
        }

        
        int sum = 0;
        for (int i = 9; i > 0 ; i--)
        {
          sum += arrayNationalCode[i] * (i+1);
        }
        
        int temp = sum % 11;
        
        if (temp < 2)
        {
          return arrayNationalCode[0] == temp;
        }
        else
        {
          return arrayNationalCode[0] == 11 - temp;
        }
    }
    public static void main(String[] args)
    {
      System.out.println("This project is for ID code.");
      System.out.println("Enter your ID code: ");

      Scanner scanner = new Scanner(System.in);
      String code = scanner.next();
      if (validationNationalCode(code))
      {
        System.out.println("this natinal code is true.");
      }
      else
      {
        System.out.println("this natinal code incorrect...!");
      }

      scanner.close();
    }
}