import java.util.Scanner;

public class ComputeAngles {

   public static void main(String[] args) {
   
      // Create a Scanner
      Scanner input = new Scanner(System.in);
      
      // Prompt the user to enter three points
      System.out.print("Enter the coordinates of Point 1 (x1 y1): ");
      double x1 = input.nextDouble();
      double y1 = input.nextDouble();
      
      System.out.print("Enter the coordinates of Point 2 (x2 y2): ");
      double x2 = input.nextDouble();
      double y2 = input.nextDouble();
      
      System.out.print("Enter the coordinates of Point 3 (x3 y3): ");
      double x3 = input.nextDouble();
      double y3 = input.nextDouble();
      
      // Calculate the length of each side of the triangle
      double a = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
      double b = Math.pow(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2), 0.5);
      double c = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
   
      // Calculate the angles
      double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
      double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
      double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));
      
      // Display the results to the user
      final char DEGREES = '\u00b0';
      System.out.printf("The three angles are:\n Angle A = %.2f%c\n AngleB = %.2f%c\n Angle C = %.2f%c\n",
                        A, DEGREES, B, DEGREES, C, DEGREES);
   }

}