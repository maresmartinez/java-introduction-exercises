import java.util.Scanner;
import javax.swing.JOptionPane;

public class ComputeTaxes {

   public static void main(String[] args) {
   
   // Create a Scanner
   Scanner input = new Scanner(System.in);
   
   // Prompt user to enter their filing status
   System.out.println("Enter your filing status (0, 1, 2, or 3): \n"
                     + "0 - Single \n"
                     + "1 - Married Filing Jointlny or Qualifying Widow(er) \n"
                     + "2 - Married Filing Separately \n"
                     + "3 - Head of Household \n");
   int filingStatus = input.nextInt();
   
   // Prompt user to enter their taxable income
   System.out.println("Enter your taxable income: ");
   double taxableIncome = input.nextDouble();
   
   // Declare and initialize variables that will be used in the tax calculations
   double totalTaxes = 0;
   int taxTier1 = 0;
   int taxTier2 = 0;
   int taxTier3 = 0;
   int taxTier4 = 0;
   int taxTier5 = 0;
   
   // Create constants for marginal tax rates
   final double TAX_RATE_1 = 0.10;
   final double TAX_RATE_2 = 0.15;
   final double TAX_RATE_3 = 0.25;
   final double TAX_RATE_4 = 0.28;
   final double TAX_RATE_5 = 0.33;
   final double TAX_RATE_6 = 0.35;
   
   // Assign tiers based on the filing status of user
   if (filingStatus == 0) {
      // Assign tiers for single filers
      
      taxTier1 = 8350;
      taxTier2 = 33950;
      taxTier3 = 82250;
      taxTier4 = 171550;
      taxTier5 = 372950;
   }
   else if (filingStatus == 1) {
      // Assign tiers for married filing jointly or qualifying widow(er)
      
      taxTier1 = 16700;
      taxTier2 = 67900;
      taxTier3 = 137050;
      taxTier4 = 208850;
      taxTier5 = 372950;
   }
   else if (filingStatus == 2) {
      // Assign tiers for married filing separately
      
      taxTier1 = 8350;
      taxTier2 = 33950;
      taxTier3 = 68525;
      taxTier4 = 104425;
      taxTier5 = 186475;
   }
   else if (filingStatus == 3) {
      // Assign tiers for head of household
      
      taxTier1 = 11950;
      taxTier2 = 45500;
      taxTier3 = 117450;
      taxTier4 = 190200;
      taxTier5 = 372950;
   }
   else {
      // Display wrong status and exit program
      JOptionPane.showMessageDialog(null, "Invalid Status", "Error", JOptionPane.ERROR_MESSAGE);
      System.exit(1);
   }
   
   // Compute taxes based on tiers dictated by filing status
   if (taxableIncome <= taxTier1) {
      totalTaxes = taxableIncome * TAX_RATE_1;
   }
   else if (taxableIncome <= taxTier2) {
      totalTaxes = taxTier1 * TAX_RATE_1
         + (taxableIncome - taxTier1) * TAX_RATE_2;
   }
   else if (taxableIncome <= taxTier3) {
      totalTaxes = (taxTier1 * TAX_RATE_1)
         + ((taxTier2 - taxTier1) * TAX_RATE_2)
         + ((taxableIncome - taxTier2) * TAX_RATE_3);
   }
   else if (taxableIncome <= taxTier4) {
      totalTaxes = taxTier1 * TAX_RATE_1
         + (taxTier2 - taxTier1) * TAX_RATE_2
         + (taxTier3 - taxTier2) * TAX_RATE_3
         + (taxableIncome - taxTier3) * TAX_RATE_4;
   }
   else if (taxableIncome <= taxTier5) {
      totalTaxes = taxTier1 * TAX_RATE_1
         + (taxTier2 - taxTier1) * TAX_RATE_2
         + (taxTier3 - taxTier2) * TAX_RATE_3
         + (taxTier4 - taxTier3) * TAX_RATE_4
         + (taxableIncome - taxTier4) * TAX_RATE_5;
   }
   else {
     totalTaxes = taxTier1 * TAX_RATE_1
         + (taxTier2 - taxTier1) * TAX_RATE_2
         + (taxTier3 - taxTier2) * TAX_RATE_3
         + (taxTier4 - taxTier3) * TAX_RATE_4
         + (taxTier5 - taxTier4) * TAX_RATE_5
         + (taxableIncome - taxTier5) * TAX_RATE_6;
   }
   
   // Display their total tax
   System.out.println("Your total tax is $" + (int)(totalTaxes * 100) / 100.0);
   
   }

}