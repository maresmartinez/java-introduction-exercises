import java.util.Scanner;

public class Exercise_2_6 {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a number between 0 and 1000: ");
      int userNumber = input.nextInt();
      
      // The formula to extract a digit is nthDigit = userNumber % (10 * n) / n
      // Where n is the digit's place value
      int thousandsDigit = userNumber % 10000 / 1000;
      int hundredsDigit = userNumber % 1000 / 100;
      int tensDigit = userNumber % 100 / 10;
      int onesDigit = userNumber % 10 / 1; 
      
      int sum = thousandsDigit + hundredsDigit + tensDigit + onesDigit;
      
      System.out.println("The sum of " + thousandsDigit + ", " + hundredsDigit + ", "
                        + tensDigit + ", and " + onesDigit + " is " + sum + ".");
   
   }

}