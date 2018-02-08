import java.util.Scanner;

public class Exercise_3_23 {
   public static void main(String[] args) {
   
      // Create a Scanner
      Scanner input = new Scanner(System.in);
      
      // Prompt user to enter coordinates of their point
      System.out.print("Enter a point with two coordinates: ");
      double x = input.nextDouble();
      double y = input.nextDouble();
      
      // Declare and initialize boolean to determine if the point is in the rectangle
      boolean inTheRectangle = true;
      
      // Determine if horizontal point is in the rectangle
      double horizontalDistance = Math.pow(Math.pow(x - 0, 2), 0.5);
      
      if (horizontalDistance > (10.0 / 2))
         inTheRectangle = false;
      
      // Determine if the vertical point is in the rectangle
      double verticalDistance = Math.pow(Math.pow(y - 0, 2), 0.5);
      
      if (verticalDistance > (5.0 / 2))
         inTheRectangle = false;
      
      // Display the result to the user
      if (inTheRectangle == true)
         System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
      else
         System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
   }
}