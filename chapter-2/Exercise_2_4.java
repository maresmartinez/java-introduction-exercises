import java.util.Scanner;

public class Exercise_2_4 {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a number in pounds: ");
      double pounds = input.nextDouble();
      
      final double POUNDS_PER_KILOGRAM = 0.454;
      double kilograms = pounds * POUNDS_PER_KILOGRAM;
      
      System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");
   
   }

}