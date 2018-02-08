import java.util.Scanner;

public class Exercise_3_6 {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter weight in pounds: ");
      double weightPounds = input.nextDouble();
      
      System.out.print("Enter feet: ");
      double heightFeet = input.nextDouble();
      
      System.out.print("Enter inches: ");
      double heightInches = input.nextDouble();
      
      final double POUNDS_PER_KILOGRAM = 0.45359237;
      final double INCHES_PER_METERS = 0.0254;
      final double FEET_PER_METERS = 0.3048;
      
      double weightKilograms = weightPounds * POUNDS_PER_KILOGRAM;
      double heightMeters = (heightFeet * FEET_PER_METERS) + (heightInches * INCHES_PER_METERS);
      
      double bodyMassIndex = weightKilograms / Math.pow(heightMeters, 2);
      
      String interpretation;
      
      if (bodyMassIndex < 18.5)
         interpretation = "Underweight";
      else if (bodyMassIndex < 25.0)
         interpretation = "Normal";
      else if (bodyMassIndex < 30.0)
         interpretation = "Overweight";
      else
         interpretation = "Obese";
      
      System.out.println("Your BMI is approximately " + ((int)(bodyMassIndex * 100) / 100.0) + ". This is " + interpretation + ".");      
   }

}