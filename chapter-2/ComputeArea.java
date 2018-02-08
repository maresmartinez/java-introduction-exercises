import java.util.Scanner;

public class ComputeArea {

   public static void main(String[] args) {
      
      final double PI = 3.14159;
      
      // create the scanner
      Scanner input = new Scanner(System.in);
      
      // read in radius
      System.out.println("Enter a number for radius: ");
      double radius = input.nextDouble();
      
      // compute area
      double area = radius * radius * PI;
      
      // display the area
      System.out.println("The area of a circle with radius " + radius + " is " + area);

   }

}