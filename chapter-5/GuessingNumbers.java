import java.util.Scanner;

public class GuessingNumbers {

   public static void main(String[] args) {
   
      // Create a Scanner
      Scanner input = new Scanner(System.in);
      
      // Generate number between 0 and 100 and variable for user guess
      int magicNumber = (int)(Math.random() * 101);
      int userGuess = 0;
      
      // Prompt user to enter guess and read in that value
      System.out.print("Guess a magic number between 0 and 100!\n"
                          + "Enter your guess: ");
      userGuess = input.nextInt();
      
      // Will stay in this loop as long as their guess is not correct
      while(userGuess != magicNumber) {
         
         // Enter Strings to help user narrow down guess
         String high = "too high";
         String low = "too low";
         String highOrLow = (userGuess > magicNumber) ? high : low;
         
         // Prompt user to enter new guess
         System.out.printf("Your guess is %s. Enter another guess: ", highOrLow);
         userGuess = input.nextInt();
      
      }
      
      // Program will only exit loop once the number is guessed
      System.out.printf("Yes, the number is %d! \n", magicNumber);
   
   }

}