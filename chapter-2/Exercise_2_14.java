import java.util.Scanner;

public class Exercise_2_14 {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter weight in pounds: ");
      double weightPounds = input.nextDouble();
      
      System.out.print("Enter weight height in: ");
      double heightInches = input.nextDouble();
      
      final double POUNDS_PER_KILOGRAM = 0.45359237;
      final double INCHES_PER_METERS = 0.0254;
      
      double weightKilograms = weightPounds * POUNDS_PER_KILOGRAM;
      double heightMeters = heightInches * INCHES_PER_METERS;
      
      double bodyMassIndex = weightKilograms / Math.pow(heightMeters, 2);
      
      System.out.println("BMI is " + bodyMassIndex + ".");
   
   }

}