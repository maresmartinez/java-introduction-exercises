import java.util.Scanner;

public class Exercise_3_28 {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      // Prompt user to enter data for two rectangles 
      System.out.println("Enter Rectangle 1's center, x-, y-coordinates, width, and height: ");
      double centerRectangle1 = input.nextDouble();
      double xRectangle1 = input.nextDouble();
      double yRectangle1 = input.nextDouble();
      double widthRectangle1 = input.nextDouble();
      double heightRectangle1 = input.nextDouble();
      
      System.out.println("Enter Rectangle 2's center, x-, y-coordinates, width, and height: ");
      double centerRectangle2 = input.nextDouble();
      double xRectangle2 = input.nextDouble();
      double yRectangle2 = input.nextDouble();
      double widthRectangle2 = input.nextDouble();
      double heightRectangle2 = input.nextDouble();
   
      
      
      // Display result for the user
      System.out.println ("Rectangle 1 is inside Rectangle 2");
      System.out.println ("Rectangle 1 overlaps with Rectangle 2");
      System.out.println ("Rectangle 1 does not overlap with Rectangle 2");
   }

}