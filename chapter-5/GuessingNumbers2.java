import java.util.Scanner;

public class GuessingNumbers2 {

   public static void main(String[] args) {
   
      // Create a Scanner
      Scanner input = new Scanner(System.in);
      
      // Describe the game
      System.out.println("Guess a magic number between 0 and 100!");
      
      // Generate number and variable for user guess
      int magicNumber = (int)(Math.random() * 101);
      int userGuess = 0;
      
      // Prompt user to enter guess and read in their value
      
      
      while(userGuess != magicNumber) {
         
         System.out.print("Enter your guess: ");
         userGuess = input.nextInt();
         
         if (userGuess == magicNumber) {
            System.out.printf("Yes, the number is %d \n", magicNumber);
         } else {
            String highOrLow = (userGuess > magicNumber) ? "too high" : "too low";
            System.out.printf("Your guess is %s. Enter another guess: ", highOrLow);
         }
      
      }
      
   }

}