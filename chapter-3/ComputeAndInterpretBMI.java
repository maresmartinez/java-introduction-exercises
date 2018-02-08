import java.util.Scanner;

public class ComputeAndInterpretBMI {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter your weight (pounds): ");
      double weightPounds = input.nextDouble();
      
      System.out.print("Enter your height (inches): ");
      double heightInches = input.nextDouble();
      
      final double POUNDS_PER_KILOGRAM = 0.45359237;
      final double INCHES_PER_METER = 0.0254;
      
      double weightKilograms = weightPounds * POUNDS_PER_KILOGRAM;
      double heightMeters = heightInches * INCHES_PER_METER;
      
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
      
      System.out.println("Your BMI is " + ((int)(bodyMassIndex * 100) / 100.0) + ". This is " + interpretation + ".");
          
   }

}