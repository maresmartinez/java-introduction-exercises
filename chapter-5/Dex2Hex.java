import java.util.Scanner;

public class Dex2Hex {

   public static void main(String[] args) {
   
      // Create a Scanner
      Scanner input = new Scanner(System.in);
   
      // Prompt user to enter decimal number
      System.out.print("Enter a decimal number: ");
      int decimalNumber = input.nextInt();
      
      String hexNumber = "";
      int quotient = decimalNumber;

      while (quotient != 0) {
      
         int hexValue = quotient % 16;
         
         char hexDigit = (hexValue <= 9 && hexValue >= 0) ?
            (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');
         
         hexNumber = hexDigit + hexNumber;
         quotient /= 16;
      
      }
      
      System.out.printf("The decimal number %d is equal to the hexidecimal number %s\n",
                        decimalNumber, hexNumber);
      
   }

}