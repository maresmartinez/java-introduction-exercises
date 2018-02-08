import java.util.Scanner;

public class Exercise_3_22 {
   public static void main(String[] args) {
      
      // Create a Scanner
      Scanner input = new Scanner(System.in);
      
      // Prompt the user to enter a point
      System.out.print("Enter a point with two coordinates: ");
      double x = input.nextDouble();
      double y = input.nextDouble();
      
      // Declare and initialize boolean
      boolean inTheCircle = true;
      
      // Determine if the point is in the circle
      // Note that the circle is at Point (0, 0) and has a radius of 10
      double distanceFromCentre = Math.pow(Math.pow(0 - x, 2) + Math.pow(0 - y, 2), 0.5);
      
      // Change boolean if the point is NOT in the circle
      if (distanceFromCentre > 10)
         inTheCircle = false;
      
      // Display the results to the user
      if (inTheCircle == true)
         System.out.println("Point (" + x + ", " + y + ") is in the circle.");
      else
         System.out.println("Point (" + x + ", " + y + ") is not in the circle.");
      
   }
}