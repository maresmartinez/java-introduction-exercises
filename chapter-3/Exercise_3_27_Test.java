import java.util.Scanner;

public class Exercise_3_27_Test {
   public static void main(String[] args) {
   
      // Create a Scanner
      Scanner input = new Scanner(System.in);
      
      // Prompt the user to enter the coordinates of their point
      System.out.print("Enter a point's x- and y- coordinates: ");
      double xUser = input.nextDouble();
      double yUser = input.nextDouble();
      
      double x1 = xUser;
      double y1 = yUser;
      
      double x2 = 0;
      double y2 = 0;
      
      double x3 = 0;
      double y3 = 100;
      
      double x4 = 200;
      double y4 = 0;
      
      // Consider line1 at between user point (xUser, yUser) and (0, 0)
      // Consider line2 at the perimeter of triangle (0, 100) and (200, 0)
      // The intersection point between line1 and line2 will determine if the user point is in the triangle

      // Find intersection point using Cramer rule
      
      // Cramer Rule to get xIntersect: ax + by = e
      // (y1 - y2) * x - (x1 - x2) * y = (y1 - y2) * x1 - (x1 - x2) * y1
         // where (x1, y1) = (xUser, yUser), (x2, y2) = (0, 0)
      // (yUser - 0) * xIntersect - (xUser - 0) * yIntersect = (yUser - 0) * xUser - (xUser - 0) * yUser
      
      // Cramer Rule to get yIntersect: cx + dy = f
      // (y3 - y4) * x - (x3 - x4) * y = (y3 - y4) * x3 - (x3 - x4) * y3
         // where (x3, y3) = (0, 100), (x4, y4) = (200, 0)
      // (10 - 0) * xIntersect - (0 - 200) * yIntersect = (10 - 0) * 0 - (0 - 200) * 10
      
      // Declare variables to be used in calculations
      
      double a = y1 - y2;
      double b = x1 - x2;
      double c = y3 - y4;
      double d = x3 - x4;
      double e = (y1 - y2) * x1 - (x1 - x2) * y1;
      double f = (y3 - y4) * x3 - (x3 - x4) * y3;
      
      // Found using Cramer rule
      double xIntersect = (e * d - b * f) / (a * d - b * c);
      double yIntersect = (a * f - e * c) / (a * d - b * c);
      
      System.out.println(xIntersect + ", " + yIntersect);
      
      // If yIntersect < yUser, the point is NOT in the triangle
      // Display the result to the user
      if (yIntersect < yUser) {
         System.out.println("The point (" + xUser + ", " + yUser + ") is in the triangle.");
      }
      else {
         System.out.println("The point (" + xUser + ", " + yUser + ") is NOT in the triangle.");
      }
         
   }
}