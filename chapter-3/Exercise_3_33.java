import java.util.Scanner;

public class Exercise_3_33 {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      // Promp user to enter information
      System.out.print("Enter the weight and price for package 1: ");
      double weightPackage1 = input.nextDouble();
      double pricePackage1 = input.nextDouble();
      
      System.out.print("Enter the weight and price for package 2: ");
      double weightPackage2 = input.nextDouble();
      double pricePackage2 = input.nextDouble();
      
      // Calculate price per unit of weight
      double pricePerUnitPackage1 = pricePackage1 / weightPackage1;
      double pricePerUnitPackage2 = pricePackage2 / weightPackage2;
      
      if (pricePerUnitPackage1 < pricePerUnitPackage2) {
         System.out.println("Package 1 has a better price per unit.");
      }
      else if (pricePerUnitPackage2 < pricePerUnitPackage1) {
         System.out.println("Package 2 has a better price per unit.");
      }
      else {
         System.out.println("Both packages have the same price per unit.");
      }
   
   }

}