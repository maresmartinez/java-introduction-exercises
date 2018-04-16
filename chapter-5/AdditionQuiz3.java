import java.util.Scanner;

public class AdditionQuiz3 {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      long number1 = (int)(Math.random() * 10);
      long number2 = (int)(Math.random() * 10);
      
      System.out.print("What is " + number1 + " + " + number2 + "?");
      int studentAnswer = input.nextInt();
      
      long correctAnswer = number1 + number2;
      
      while (studentAnswer != correctAnswer) {
         System.out.print("You are incorrect. Try again! "
                           + "What is " + number1 + " + " + number2 + "?");
         studentAnswer = input.nextInt();
      }
      
      System.out.println("You are correct!");
      
   }

}