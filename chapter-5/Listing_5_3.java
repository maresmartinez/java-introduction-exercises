import java.util.Scanner;

public class Listing_5_3 {

   public static void main(String[] args) {
   
      // Create a Scanner
      Scanner input = new Scanner(System.in);
      
      // Describe the game
      System.out.println("Guess a magic number between 0 and 100");

      // Generate the random number to be guessed
      int magicNumber = (int)(Math.random() * 101);
      
      int userGuess = -1;
      // Prompt the user to guess the number
      while(userGuess != magicNumber) {
      
         System.out.print("Enter your guess: ");
         userGuess = input.nextInt();
         
         if (userGuess == magicNumber) {
            System.out.println("Yes, the number is " + magicNumber + "!");
         } else {
            System.out.print("Your guess is " + ((userGuess > magicNumber) ? "too high. " : "too low. "));
         }
      
      }
   
   }

}