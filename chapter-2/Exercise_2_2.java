import java.util.Scanner;

public class Exercise_2_2 {

   public static void main(String[] args) {
   
      final double PI = 3.14159;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the radius of your cylinder: ");
      double radius = input.nextDouble();
   
      System.out.print("Enter the length of your cylinder: ");
      double length = input.nextDouble();
      
      double area = radius * radius * PI;
      double volume = area * length;
      
      System.out.println("The area of your cylinder is " + area + " and the length of your cylinder is "
                        + volume);
   }

}