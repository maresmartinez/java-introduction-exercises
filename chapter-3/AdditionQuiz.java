import java.util.Scanner;

public class AdditionQuiz {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      long number1 = System.currentTimeMillis() % 10;
      long number2 = System.currentTimeMillis() / 7 % 10;
      
      System.out.print("What is " + number1 + " + " + number2 + "?");
      int studentAnswer = input.nextInt();
      
      long correctAnswer = number1 + number2;
      
      if (studentAnswer == correctAnswer) {
         System.out.println("You are correct!");
      }
      else {
         System.out.println("Wrong! You ain't shit!!!!!!!");
      }
   
   }

}