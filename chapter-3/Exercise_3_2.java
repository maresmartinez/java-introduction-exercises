import java.util.Scanner;

public class Exercise_3_2 {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      // Generate 3 single digit integers
      int number1 = (int)(Math.random() * 10);
      int number2 = (int)(Math.random() * 10);
      int number3 = (int)(Math.random() * 10);
      
      System.out.println("What is " + number1 + " + "
                        + number2 + " + " + number3 + "?");
      
      int studentAnswer = input.nextInt();
      
      if (studentAnswer == number1 + number2 + number3) {
         System.out.println("You are correct!");
      }
      else {
         System.out.println("You ain't shit! The correct answer is "
                           + (number1 + number2 + number3) + ".");
      }
   
   }

}