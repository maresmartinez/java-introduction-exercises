import java.util.Scanner;

public class GreatestCommonDivisor {

   public static void main(String[] args) {
   
      // Create a Scanner
      Scanner input = new Scanner(System.in);
      
      // Prompt user to enter two integers
      System.out.print("Enter integer 1: ");
      int number1 = input.nextInt();
      System.out.print("Enter integer 2: ");
      int number2 = input.nextInt();
      
      // Initialize greatest common divisor
      int greatestCommonDivisor = 1;
      
      // Search for a divisor greater than 1
      for (int divisor = 2; divisor <= number1 && divisor <= number2; divisor++) {
         
         // Check if the number1 and number2 are divisible by divisor variable
         if ((number1 % divisor == 0) && (number2 % divisor == 0)) {
         
            // if both are divisible, it is the current greatest common divisor
            greatestCommonDivisor = divisor;
         
         }
      
      }
      
      // Display result to user
      System.out.printf("The greatest common divisor between %d and %d is %d.\n",
                           number1, number2, greatestCommonDivisor);
   
   }

}