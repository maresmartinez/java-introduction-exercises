import java.util.Scanner;

public class Exercise_3_1 {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a, b, c: ");
      double a = input.nextDouble();
      double b = input.nextDouble();
      double c = input.nextDouble();
      
      // Calculate discriminant
      double discriminant = Math.pow(b, 2) - (4 * a * c);
      
      if (discriminant > 0) {
         // Discriminant is positive. Calculate two real roots.
         double root1 = (- b + Math.pow(discriminant, 0.5)) / (2 * a);
         double root2 = (- b - Math.pow(discriminant, 0.5)) / (2 * a);
         System.out.println("The equation has two roots: " + root1 + " and " + root2);
      }
      else if (discriminant == 0) {
         // Discriminant is 0. Calculate one root.
         double root = (- b + Math.pow(discriminant, 0.5)) / (2 * a);
         System.out.println("The equation has one root: " + root);
      }
      else {
         // Discriminant is negative. There are no real roots.
         System.out.println("The equation has no real roots.");
      }
   
   }

}