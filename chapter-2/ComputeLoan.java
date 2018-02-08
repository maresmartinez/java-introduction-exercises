import java.util.Scanner;

public class ComputeLoan {

   public static void main(String[] args) {
   
      // Create a scanner
      Scanner input = new Scanner(System.in);
      
      // Prompt user to enter annual interest rate, number of years, and loan amount
      System.out.print("Enter the annual interest rate (e.g. 7.25): ");
      double annualInterestRate = input.nextDouble();
      
      System.out.print("Enter the number of years as an integer (e.g. 5): ");
      int years = input.nextInt();
      
      System.out.print("Enter the loan amount (no commas): $");
      double loanAmount = input.nextDouble();
      
      // convert inputs to data types that the program can work with
      double monthlyInterestRate = annualInterestRate / 1200;
      
      // compute the monthly payment
      double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
         
      // compute the total payment
      double totalPayment = monthlyPayment * years * 12;
      
      // display the monthly payment and total payment to the user
      System.out.println("Your monthly payment is: $" + (int)(monthlyPayment * 100) / 100.0);
      System.out.println("Your total payment is: $" + (int)(totalPayment * 100) / 100.0);
         
   }

}