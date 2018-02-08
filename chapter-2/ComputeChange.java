import java.util.Scanner;

public class ComputeChange {

   public static void main(String[] args) {
   
      // Create a Scanner
      Scanner input = new Scanner(System.in);      
      
      // Prompt the user to enter the amount as a decimal number
      System.out.print("Enter the amount of money you have as a decimal (e.g. 5.30): ");
      double amount = input.nextDouble();
      
      // Convert the amount into cents
      int remainingAmount = (int)(amount * 100);
      
      // Divide the cents by 100 to find the number of dollars
      // Obtain the remining cents using the cents remainder 100
      
      
      // Divide the remaining cents by 25 to find the number of quarters
      // Obtain the remining cents using the cents remainder 25
      
      
      // Divide the remining cents by 10 to find the number of dimes
      // Obtain the remaining cents using the cents remainder 10
      
      
      // Divide the remining cents by 5 to find the number of nickels
      // Obtain the remaining cents using the cents remainder 5
      
      
      // The remaining cents are the pennies
      
      
      // Display the result
      System.out.println("Result: ");
     
   
   }

}