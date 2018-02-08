import java.util.Scanner;

public class Exercise_2_3 {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a number in feet: ");
      double feet = input.nextDouble();
      
      final double FEET_PER_METERS = 0.305;
      double meters = feet * FEET_PER_METERS;
      
      System.out.println(feet + " feet is equal to " + meters + " meters.");
   
   }

}