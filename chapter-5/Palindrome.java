import java.util.Scanner;

public class Palindrome {

   public static void main(String[] args) {
   
      // Create a Scanner
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a word: ");
      String userWord = input.next();
      
      // If the number is odd, the center char doesn't need to be checked for a match
      int lastCharToCheck = userWord.length() / 2;
      int checkingChar = 0;
      boolean palindrome = false;
      
      while (checkingChar < lastCharToCheck) {
      
         
         
      }
      
      System.out.print("This is " + ((palindrome) ? "a " : "not a ") + "palindrome.");
   
   }

}