import java.util.Scanner;

public class Exercise_3_27 {
   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a point's x- and y- coordinates: ");
      double xUser = input.nextDouble();
      double yUser = input.nextDouble();
      
      // Can skip complicated calculations if user point contains coordinates <= 0
      if (xUser < 0 || yUser < 0) {
         System.out.println("The point (" + xUser + ", " + yUser + ") is not in the triangle.");
         System.exit(0);
      }
      else if (xUser == 0 || yUser == 0) {
         System.out.println("The point (" + xUser + ", " + yUser + ") is on the perimeter of the triangle.");
         System.exit(0);
      }
      
      // More complicated calculations for positive numbers
      
      // Consider line1 between user point and right-angle point of triangle: (xUser, yUser) and (0, 0)
      // Consider line2 at the hypotenuse of triangle: (0, 100) and (200, 0)
      // The intersection point between line1 and line2 will determine if the user point is in the triangle

      // User Cramer rule to determine intersection point
      
      // Cramer Rule Equation 1:
      // ax + by = e
      // = (y1 - y2) * x - (x1 - x2) * y = (y1 - y2) * x1 - (x1 - x2) * y1
         // where (x1, y1) = (xUser, yUser), (x2, y2) = (0, 0)
      
      // Cramer Rule Equation 2:
      // cx + dy = f
      // = (y3 - y4) * x - (x3 - x4) * y = (y3 - y4) * x3 - (x3 - x4) * y3
         // where (x3, y3) = (0, 100), (x4, y4) = (200, 0)
      
      // Declare variables to be used in calculations
      double a = yUser - 0;
      double b = xUser - 0;
      double c = 100 - 0;
      double d = 0 - 200;
      double e = (yUser - 0) * xUser - (xUser - 0) * yUser; 
      double f = (100 - 0) * 0 - (0 - 200) * 100; 
      
      // Find intersection point using using Cramer rule
         // I keep getting negative results for yIntersect for some reason 
         // so I had to modify the formula to get a positive number... not sure how to fix it
      // Don't need to determine xIntersect to see if it's in the triangle, but keeping that in for bug fixes
      double xIntersect = (e * d - b * f) / (a * d - b * c);
      double yIntersect = -((a * f - e * c) / (a * d - b * c)); 
      
      // Determine if the point is in the triangle and display result
      if (yIntersect == yUser || xIntersect == xUser) {
         // The point is on the hypotenuse of the triangle
         System.out.println("The point (" + xUser + ", " + yUser + ") is on the perimeter of the triangle.");
      }
      else if (yIntersect > yUser) {
         System.out.println("The point (" + xUser + ", " + yUser + ") is in the triangle.");
      }
      else {
         System.out.println("The point (" + xUser + ", " + yUser + ") is not in the triangle.");
      }
         
   }
}