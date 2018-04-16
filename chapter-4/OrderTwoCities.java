import java.util.Scanner;

public class OrderTwoCities {

   public static void main(String[] args) {
   
      // Create a Scanner
      Scanner input = new Scanner(System.in);
      
      // Prompt the user to enter two cities
      System.out.print("Enter the name of a city: ");
      String city1 = input.nextLine();
      
      System.out.print("Enter the name of another city: ");
      String city2 = input.nextLine();
      
      // Put the two cities in alphabetical order
      /* A positive value indicates that city2 is further down the alphabet than city1
       * Therefore the cities are out of order and should be swapped
       */
      if (city1.compareTo(city2) > 0) {
         String temp = city1;
         city1 = city2;
         city2 = temp;
      }
      
      // Display the cities in alphabetical order
      System.out.println("Here are the two cities in alphabetical order: \n"
                        + "1. " + city1 + "\n" + "2. " + city2);
   
   }

}