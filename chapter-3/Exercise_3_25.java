import java.util.Scanner;

public class Exercise_3_25 {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      // Prompt user to enter coordinates of 4 points
      System.out.print("Enter x1, y1: ");
      double x1 = input.nextDouble();
      double y1 = input.nextDouble();
      
      System.out.print("Enter x2, y2: ");
      double x2 = input.nextDouble();
      double y2 = input.nextDouble();
      
      System.out.print("Enter x3, y3: ");
      double x3 = input.nextDouble();
      double y3 = input.nextDouble();
      
      System.out.print("Enter x4, y4: ");
      double x4 = input.nextDouble();
      double y4 = input.nextDouble();
      
      // Declare variables to be used in Cramer rule
      
      // ax + by = e
      // (y1 - y2) * x - (x1 - x2) * y = (y1 - y2) * x1 - (x1 - x2) * y1
      
      // cx + dy = f 
      // (y3 - y4) * x - (x3 - x4) * y = (y3 - y4) * x3 - (x3 - x4) * y3
      
      double a = y1 - y2;
      double b = x1 - x2;
      double c = y3 - y4;
      double d = x3 - x4;
      double e = a * x1 - b * y1;
      double f = c * x3 - d * y3;
      
      if ((a * d - b * c) == 0) {
         // There is no intersecting point in this case
         System.out.println("The two lines are parallel.");
      }
      else {
         // Find the intersecting point using Cramer's rule
      
         double xIntersect = (e * d - b * f) / (a * d - b * c);
         double yIntersect = -((a * f - e * c) / (a * d - b * c));
      
         // Display the point to user
         System.out.println("The intersecting point is at (" + xIntersect + ", " + yIntersect + ").");
      }

   }

}