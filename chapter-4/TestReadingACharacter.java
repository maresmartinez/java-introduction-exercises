import java.util.Scanner;

public class TestReadingACharacter {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a character: ");
      String userInput = input.nextLine();
      char character = userInput.charAt(0);
      
      System.out.printf("The character you entered was %c \n", character);
   
   }

}