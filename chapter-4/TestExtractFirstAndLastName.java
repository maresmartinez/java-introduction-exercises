import java.util.Scanner;

public class TestExtractFirstAndLastName {

   public static void main(String[] args) {
   
      // Create a Scanner
      Scanner input = new Scanner(System.in);
      
      // Prompt user to enter their name
      System.out.println("Enter your first and last name (separated by a space): ");
      String fullName = input.nextLine();
      
      // Extract first and last name
      int indexOfSpace = fullName.indexOf(' ');
      String firstName = fullName.substring(0, indexOfSpace);
      String lastName = fullName.substring(indexOfSpace + 1);
      
      // Display name
      System.out.printf("Your first name is: %s \n Your last name is: %s \n", firstName, lastName);
   
   }

}