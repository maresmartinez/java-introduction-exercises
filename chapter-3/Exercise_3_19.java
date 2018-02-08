import java.util.Scanner;

public class Exercise_3_19 {

   public static void main(String[] args) {
   
      // Create a Scanner
      Scanner input = new Scanner(System.in);
      
      // Prompt user to enter three edges of a triangle
      System.out.println("Enter three edges for a triangle: ");
      double edge1 = input.nextDouble();
      double edge2 = input.nextDouble();
      double edge3 = input.nextDouble();
      
      if (edge1 + edge2 < edge3 || edge1 + edge3 < edge2 || edge2 + edge3 < edge1) {
         System.out.println("Error: input is invalid");
         System.exit(1);
      }
      else {
         double perimeter = edge1 + edge2 + edge3;
         System.out.println("The perimeter of this triangle is "
                               + perimeter);
      }
   
   }

}