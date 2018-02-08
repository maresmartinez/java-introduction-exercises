import java.util.Scanner;

public class Exercise_3_3 {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      // Use Cramer's rule to solve the equation
      
      // ax + by = e
      // cx + dy = f 
      
      // x = (e * d - b * f) / (a * d - b * c)
      // y = (a * f - e * c) / (a * d - b * c)
      
      System.out.print("Enter a, b, c, d, e, f: ");
      double a = input.nextDouble();
      double b = input.nextDouble();
      double c = input.nextDouble();
      double d = input.nextDouble();
      double e = input.nextDouble();
      double f = input.nextDouble();
      
      double x;
      double y;
          
      x = (e * d - b * f) / (a * d - b * c);
      y = (a * f - e * c) / (a * d - b * c);
      
      // Display the result to the user
      if ((a * d - b * c) == 0) {
         System.out.println("The equation has no solution.");
      }
      else {
         System.out.println("x is " + x + " and y is " + y);
      }
   
   }

}