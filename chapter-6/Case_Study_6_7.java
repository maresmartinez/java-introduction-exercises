import java.util.Scanner;

public class Case_Study_6_7 {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a hex number: ");
      String hexNumber = input.nextLine();
      
      hexNumber = hexNumber.toUpperCase();
      int decimalNumber = hexToDec(hexNumber);
      
      String decimalOutput = "The hex number %s is equivalent to the decimal number %d\n";
      System.out.printf(decimalOutput, hexNumber, decimalNumber);
   
   }
   
   // Takes a hex number and converts to its equivalent decimal number
   private static int hexToDec(String hexNumber) {
   
      int decimalNumber = 0;
      
      for (int i = 0; i < hexNumber.length(); i++) {
      
         char hexDigit = hexNumber.charAt(i);
         decimalNumber = decimalNumber * 16 + hexCharToDecimal(hexDigit);
         
      }
      
      return decimalNumber;
   
   }
   
   // Takes a single hex char and returns its decimal value
   private static int hexCharToDecimal(char hexDigit) {
   
      if (hexDigit >= 'A' && hexDigit <= 'F') {
         return 10 + hexDigit - 'A';
      } else {
         return hexDigit - '0';
      }
   
   }

}