import java.util.Scanner;

public class Exercise_2_13 {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the monthly saving amount: ");
      double monthlySavings = input.nextDouble();
      
      final double ANNUAL_INTEREST_RATE = 0.05;
      final double MONTHLY_INTEREST_RATE = ANNUAL_INTEREST_RATE / 12;
      
      double month1 = monthlySavings * (1 + MONTHLY_INTEREST_RATE);
      double month2 = (monthlySavings + month1) * (1 + MONTHLY_INTEREST_RATE);
      double month3 = (monthlySavings + month2) * (1 + MONTHLY_INTEREST_RATE);
      double month4 = (monthlySavings + month3) * (1 + MONTHLY_INTEREST_RATE);
      double month5 = (monthlySavings + month4) * (1 + MONTHLY_INTEREST_RATE);
      double month6 = (monthlySavings + month5) * (1 + MONTHLY_INTEREST_RATE);
      
      System.out.println("Given an annual interest rate of "
                            + ANNUAL_INTEREST_RATE * 100 + "%, the account value will be $"
                            + (int)(month6 * 100) / 100.0 + " after the sixth month.");
   
   }

}